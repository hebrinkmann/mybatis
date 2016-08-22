package de.henningBrinkmann.mybatisSample.xmltv;

import static org.junit.Assert.*;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class XmlTvTest {
	private static Logger logger = LoggerFactory.getLogger(XmlTvTest.class);

	@Test
	public void test() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Tv.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		InputStream is = ClassLoader.class.getResourceAsStream("/xmltv.xml");
		
		Tv tv = (Tv) unmarshaller.unmarshal(is);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		logger.debug("Read Tv: {}", gson.toJson(tv));
	}

}
