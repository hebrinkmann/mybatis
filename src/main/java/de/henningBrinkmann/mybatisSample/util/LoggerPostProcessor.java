package de.henningBrinkmann.mybatisSample.util;

import java.lang.reflect.Modifier;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class LoggerPostProcessor implements BeanPostProcessor {
	private static Logger logger = LoggerFactory.getLogger(LoggerPostProcessor.class);

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		final String beanClassName = bean.getClass().getName();
		if (beanClassName.startsWith("de.henningBrinkmann")) {
			logger.info("Trying to inject logger to: {}", bean.getClass().getName());

			Arrays.stream(bean.getClass().getDeclaredFields()).filter(field -> {
				if (field.getAnnotation(InjectLogger.class) != null) {
					if (Logger.class.isAssignableFrom(field.getType())) {
						return (field.getModifiers() & Modifier.STATIC) == 0;
					}
				}

				return false;
			}).forEach(field -> {
				logger.debug("Injecting logger to {}@{}.", beanClassName, bean.hashCode());

				field.setAccessible(true);
				try {
					field.set(bean, LoggerFactory.getLogger(bean.getClass()));
				} catch (Exception e) {
					logger.error("Failed to inject logger to {}.", bean.getClass().getName());
				}
			});
		}

		return bean;

	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

}
