package br.com.rsinet_appium_bdd.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String getTimeStamp() {
		return new SimpleDateFormat("dd_MM_yyyy HH.mm.ss").format(new Date());
	}
}
