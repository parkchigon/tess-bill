package com.vup.tess;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeTest {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("HHmm", Locale.KOREA);
		
		Date d1 = f.parse("0115");
		Date d2 = f.parse("0200");
		long diff = d2.getTime() - d1.getTime();
		long sec = diff / 1000/60;
		int a= 15;
		int pe = (int) (sec/a);
		
		System.out.println(sec);
		System.out.println(pe);
	}
}
