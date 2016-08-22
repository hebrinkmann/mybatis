package de.henningBrinkmann.mybatisSample.xmltv;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date>{
	private final SimpleDateFormat getDateFormat() {
		return new SimpleDateFormat("yyyyMMddHHmmss X");
	}
	
	@Override
	public Date unmarshal(String v) throws Exception {
		return getDateFormat().parse(v);
	}

	@Override
	public String marshal(Date v) throws Exception {
		return getDateFormat().format(v);
	}

}
