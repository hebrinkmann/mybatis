package de.henningBrinkmann.mybatisSample.util;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

public class LoggerAdapter implements Logger {
	private final Logger logger;
	
	public LoggerAdapter() {
		this.logger = LoggerFactory.getLogger(UUID.randomUUID().toString());
	}

	/**
	 * @return
	 * @see org.slf4j.Logger#getName()
	 */
	public String getName() {
		return logger.getName();
	}

	/**
	 * @return
	 * @see org.slf4j.Logger#isTraceEnabled()
	 */
	public boolean isTraceEnabled() {
		return logger.isTraceEnabled();
	}

	/**
	 * @param msg
	 * @see org.slf4j.Logger#trace(java.lang.String)
	 */
	public void trace(String msg) {
		logger.trace(msg);
	}

	/**
	 * @param format
	 * @param arg
	 * @see org.slf4j.Logger#trace(java.lang.String, java.lang.Object)
	 */
	public void trace(String format, Object arg) {
		logger.trace(format, arg);
	}

	/**
	 * @param format
	 * @param arg1
	 * @param arg2
	 * @see org.slf4j.Logger#trace(java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void trace(String format, Object arg1, Object arg2) {
		logger.trace(format, arg1, arg2);
	}

	/**
	 * @param format
	 * @param arguments
	 * @see org.slf4j.Logger#trace(java.lang.String, java.lang.Object[])
	 */
	public void trace(String format, Object... arguments) {
		logger.trace(format, arguments);
	}

	/**
	 * @param msg
	 * @param t
	 * @see org.slf4j.Logger#trace(java.lang.String, java.lang.Throwable)
	 */
	public void trace(String msg, Throwable t) {
		logger.trace(msg, t);
	}

	/**
	 * @param marker
	 * @return
	 * @see org.slf4j.Logger#isTraceEnabled(org.slf4j.Marker)
	 */
	public boolean isTraceEnabled(Marker marker) {
		return logger.isTraceEnabled(marker);
	}

	/**
	 * @param marker
	 * @param msg
	 * @see org.slf4j.Logger#trace(org.slf4j.Marker, java.lang.String)
	 */
	public void trace(Marker marker, String msg) {
		logger.trace(marker, msg);
	}

	/**
	 * @param marker
	 * @param format
	 * @param arg
	 * @see org.slf4j.Logger#trace(org.slf4j.Marker, java.lang.String, java.lang.Object)
	 */
	public void trace(Marker marker, String format, Object arg) {
		logger.trace(marker, format, arg);
	}

	/**
	 * @param marker
	 * @param format
	 * @param arg1
	 * @param arg2
	 * @see org.slf4j.Logger#trace(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void trace(Marker marker, String format, Object arg1, Object arg2) {
		logger.trace(marker, format, arg1, arg2);
	}

	/**
	 * @param marker
	 * @param format
	 * @param argArray
	 * @see org.slf4j.Logger#trace(org.slf4j.Marker, java.lang.String, java.lang.Object[])
	 */
	public void trace(Marker marker, String format, Object... argArray) {
		logger.trace(marker, format, argArray);
	}

	/**
	 * @param marker
	 * @param msg
	 * @param t
	 * @see org.slf4j.Logger#trace(org.slf4j.Marker, java.lang.String, java.lang.Throwable)
	 */
	public void trace(Marker marker, String msg, Throwable t) {
		logger.trace(marker, msg, t);
	}

	/**
	 * @return
	 * @see org.slf4j.Logger#isDebugEnabled()
	 */
	public boolean isDebugEnabled() {
		return logger.isDebugEnabled();
	}

	/**
	 * @param msg
	 * @see org.slf4j.Logger#debug(java.lang.String)
	 */
	public void debug(String msg) {
		logger.debug(msg);
	}

	/**
	 * @param format
	 * @param arg
	 * @see org.slf4j.Logger#debug(java.lang.String, java.lang.Object)
	 */
	public void debug(String format, Object arg) {
		logger.debug(format, arg);
	}

	/**
	 * @param format
	 * @param arg1
	 * @param arg2
	 * @see org.slf4j.Logger#debug(java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void debug(String format, Object arg1, Object arg2) {
		logger.debug(format, arg1, arg2);
	}

	/**
	 * @param format
	 * @param arguments
	 * @see org.slf4j.Logger#debug(java.lang.String, java.lang.Object[])
	 */
	public void debug(String format, Object... arguments) {
		logger.debug(format, arguments);
	}

	/**
	 * @param msg
	 * @param t
	 * @see org.slf4j.Logger#debug(java.lang.String, java.lang.Throwable)
	 */
	public void debug(String msg, Throwable t) {
		logger.debug(msg, t);
	}

	/**
	 * @param marker
	 * @return
	 * @see org.slf4j.Logger#isDebugEnabled(org.slf4j.Marker)
	 */
	public boolean isDebugEnabled(Marker marker) {
		return logger.isDebugEnabled(marker);
	}

	/**
	 * @param marker
	 * @param msg
	 * @see org.slf4j.Logger#debug(org.slf4j.Marker, java.lang.String)
	 */
	public void debug(Marker marker, String msg) {
		logger.debug(marker, msg);
	}

	/**
	 * @param marker
	 * @param format
	 * @param arg
	 * @see org.slf4j.Logger#debug(org.slf4j.Marker, java.lang.String, java.lang.Object)
	 */
	public void debug(Marker marker, String format, Object arg) {
		logger.debug(marker, format, arg);
	}

	/**
	 * @param marker
	 * @param format
	 * @param arg1
	 * @param arg2
	 * @see org.slf4j.Logger#debug(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void debug(Marker marker, String format, Object arg1, Object arg2) {
		logger.debug(marker, format, arg1, arg2);
	}

	/**
	 * @param marker
	 * @param format
	 * @param arguments
	 * @see org.slf4j.Logger#debug(org.slf4j.Marker, java.lang.String, java.lang.Object[])
	 */
	public void debug(Marker marker, String format, Object... arguments) {
		logger.debug(marker, format, arguments);
	}

	/**
	 * @param marker
	 * @param msg
	 * @param t
	 * @see org.slf4j.Logger#debug(org.slf4j.Marker, java.lang.String, java.lang.Throwable)
	 */
	public void debug(Marker marker, String msg, Throwable t) {
		logger.debug(marker, msg, t);
	}

	/**
	 * @return
	 * @see org.slf4j.Logger#isInfoEnabled()
	 */
	public boolean isInfoEnabled() {
		return logger.isInfoEnabled();
	}

	/**
	 * @param msg
	 * @see org.slf4j.Logger#info(java.lang.String)
	 */
	public void info(String msg) {
		logger.info(msg);
	}

	/**
	 * @param format
	 * @param arg
	 * @see org.slf4j.Logger#info(java.lang.String, java.lang.Object)
	 */
	public void info(String format, Object arg) {
		logger.info(format, arg);
	}

	/**
	 * @param format
	 * @param arg1
	 * @param arg2
	 * @see org.slf4j.Logger#info(java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void info(String format, Object arg1, Object arg2) {
		logger.info(format, arg1, arg2);
	}

	/**
	 * @param format
	 * @param arguments
	 * @see org.slf4j.Logger#info(java.lang.String, java.lang.Object[])
	 */
	public void info(String format, Object... arguments) {
		logger.info(format, arguments);
	}

	/**
	 * @param msg
	 * @param t
	 * @see org.slf4j.Logger#info(java.lang.String, java.lang.Throwable)
	 */
	public void info(String msg, Throwable t) {
		logger.info(msg, t);
	}

	/**
	 * @param marker
	 * @return
	 * @see org.slf4j.Logger#isInfoEnabled(org.slf4j.Marker)
	 */
	public boolean isInfoEnabled(Marker marker) {
		return logger.isInfoEnabled(marker);
	}

	/**
	 * @param marker
	 * @param msg
	 * @see org.slf4j.Logger#info(org.slf4j.Marker, java.lang.String)
	 */
	public void info(Marker marker, String msg) {
		logger.info(marker, msg);
	}

	/**
	 * @param marker
	 * @param format
	 * @param arg
	 * @see org.slf4j.Logger#info(org.slf4j.Marker, java.lang.String, java.lang.Object)
	 */
	public void info(Marker marker, String format, Object arg) {
		logger.info(marker, format, arg);
	}

	/**
	 * @param marker
	 * @param format
	 * @param arg1
	 * @param arg2
	 * @see org.slf4j.Logger#info(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void info(Marker marker, String format, Object arg1, Object arg2) {
		logger.info(marker, format, arg1, arg2);
	}

	/**
	 * @param marker
	 * @param format
	 * @param arguments
	 * @see org.slf4j.Logger#info(org.slf4j.Marker, java.lang.String, java.lang.Object[])
	 */
	public void info(Marker marker, String format, Object... arguments) {
		logger.info(marker, format, arguments);
	}

	/**
	 * @param marker
	 * @param msg
	 * @param t
	 * @see org.slf4j.Logger#info(org.slf4j.Marker, java.lang.String, java.lang.Throwable)
	 */
	public void info(Marker marker, String msg, Throwable t) {
		logger.info(marker, msg, t);
	}

	/**
	 * @return
	 * @see org.slf4j.Logger#isWarnEnabled()
	 */
	public boolean isWarnEnabled() {
		return logger.isWarnEnabled();
	}

	/**
	 * @param msg
	 * @see org.slf4j.Logger#warn(java.lang.String)
	 */
	public void warn(String msg) {
		logger.warn(msg);
	}

	/**
	 * @param format
	 * @param arg
	 * @see org.slf4j.Logger#warn(java.lang.String, java.lang.Object)
	 */
	public void warn(String format, Object arg) {
		logger.warn(format, arg);
	}

	/**
	 * @param format
	 * @param arguments
	 * @see org.slf4j.Logger#warn(java.lang.String, java.lang.Object[])
	 */
	public void warn(String format, Object... arguments) {
		logger.warn(format, arguments);
	}

	/**
	 * @param format
	 * @param arg1
	 * @param arg2
	 * @see org.slf4j.Logger#warn(java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void warn(String format, Object arg1, Object arg2) {
		logger.warn(format, arg1, arg2);
	}

	/**
	 * @param msg
	 * @param t
	 * @see org.slf4j.Logger#warn(java.lang.String, java.lang.Throwable)
	 */
	public void warn(String msg, Throwable t) {
		logger.warn(msg, t);
	}

	/**
	 * @param marker
	 * @return
	 * @see org.slf4j.Logger#isWarnEnabled(org.slf4j.Marker)
	 */
	public boolean isWarnEnabled(Marker marker) {
		return logger.isWarnEnabled(marker);
	}

	/**
	 * @param marker
	 * @param msg
	 * @see org.slf4j.Logger#warn(org.slf4j.Marker, java.lang.String)
	 */
	public void warn(Marker marker, String msg) {
		logger.warn(marker, msg);
	}

	/**
	 * @param marker
	 * @param format
	 * @param arg
	 * @see org.slf4j.Logger#warn(org.slf4j.Marker, java.lang.String, java.lang.Object)
	 */
	public void warn(Marker marker, String format, Object arg) {
		logger.warn(marker, format, arg);
	}

	/**
	 * @param marker
	 * @param format
	 * @param arg1
	 * @param arg2
	 * @see org.slf4j.Logger#warn(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void warn(Marker marker, String format, Object arg1, Object arg2) {
		logger.warn(marker, format, arg1, arg2);
	}

	/**
	 * @param marker
	 * @param format
	 * @param arguments
	 * @see org.slf4j.Logger#warn(org.slf4j.Marker, java.lang.String, java.lang.Object[])
	 */
	public void warn(Marker marker, String format, Object... arguments) {
		logger.warn(marker, format, arguments);
	}

	/**
	 * @param marker
	 * @param msg
	 * @param t
	 * @see org.slf4j.Logger#warn(org.slf4j.Marker, java.lang.String, java.lang.Throwable)
	 */
	public void warn(Marker marker, String msg, Throwable t) {
		logger.warn(marker, msg, t);
	}

	/**
	 * @return
	 * @see org.slf4j.Logger#isErrorEnabled()
	 */
	public boolean isErrorEnabled() {
		return logger.isErrorEnabled();
	}

	/**
	 * @param msg
	 * @see org.slf4j.Logger#error(java.lang.String)
	 */
	public void error(String msg) {
		logger.error(msg);
	}

	/**
	 * @param format
	 * @param arg
	 * @see org.slf4j.Logger#error(java.lang.String, java.lang.Object)
	 */
	public void error(String format, Object arg) {
		logger.error(format, arg);
	}

	/**
	 * @param format
	 * @param arg1
	 * @param arg2
	 * @see org.slf4j.Logger#error(java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void error(String format, Object arg1, Object arg2) {
		logger.error(format, arg1, arg2);
	}

	/**
	 * @param format
	 * @param arguments
	 * @see org.slf4j.Logger#error(java.lang.String, java.lang.Object[])
	 */
	public void error(String format, Object... arguments) {
		logger.error(format, arguments);
	}

	/**
	 * @param msg
	 * @param t
	 * @see org.slf4j.Logger#error(java.lang.String, java.lang.Throwable)
	 */
	public void error(String msg, Throwable t) {
		logger.error(msg, t);
	}

	/**
	 * @param marker
	 * @return
	 * @see org.slf4j.Logger#isErrorEnabled(org.slf4j.Marker)
	 */
	public boolean isErrorEnabled(Marker marker) {
		return logger.isErrorEnabled(marker);
	}

	/**
	 * @param marker
	 * @param msg
	 * @see org.slf4j.Logger#error(org.slf4j.Marker, java.lang.String)
	 */
	public void error(Marker marker, String msg) {
		logger.error(marker, msg);
	}

	/**
	 * @param marker
	 * @param format
	 * @param arg
	 * @see org.slf4j.Logger#error(org.slf4j.Marker, java.lang.String, java.lang.Object)
	 */
	public void error(Marker marker, String format, Object arg) {
		logger.error(marker, format, arg);
	}

	/**
	 * @param marker
	 * @param format
	 * @param arg1
	 * @param arg2
	 * @see org.slf4j.Logger#error(org.slf4j.Marker, java.lang.String, java.lang.Object, java.lang.Object)
	 */
	public void error(Marker marker, String format, Object arg1, Object arg2) {
		logger.error(marker, format, arg1, arg2);
	}

	/**
	 * @param marker
	 * @param format
	 * @param arguments
	 * @see org.slf4j.Logger#error(org.slf4j.Marker, java.lang.String, java.lang.Object[])
	 */
	public void error(Marker marker, String format, Object... arguments) {
		logger.error(marker, format, arguments);
	}

	/**
	 * @param marker
	 * @param msg
	 * @param t
	 * @see org.slf4j.Logger#error(org.slf4j.Marker, java.lang.String, java.lang.Throwable)
	 */
	public void error(Marker marker, String msg, Throwable t) {
		logger.error(marker, msg, t);
	}
}
