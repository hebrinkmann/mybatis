package de.henningBrinkmann.mybatisSample.service;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;

import de.henningBrinkmann.mybatisSample.xmltv.Tv;

@Component
public class TvService {
	public void update() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Tv.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		InputStream is = ClassLoader.class.getResourceAsStream("/xmltv.xml");
		
		Tv tv = (Tv) unmarshaller.unmarshal(is);

		
	}
}
