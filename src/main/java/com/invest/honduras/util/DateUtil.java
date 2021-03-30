package com.invest.honduras.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DateUtil {

	public static Date formatDate(String dateInString) {
		try {
			return DateUtils.parseDate(dateInString, new String[] { "dd/MM/yyyy HH:mm:ss", "dd/MM/yyyy" });
		} catch (ParseException e) {
			log.error("Error formatDate");
			return null;
		}
	}

	public static String formatDate(Date date) {
		if (date != null) {
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			return formatter.format(date);
		}else {
			return "";
		}
	}
	
	public static String formatDateHHMM(Date date) {
		if (date != null) {
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm");
			return formatter.format(date);
		}else {
			return "";
		}
	}

}
