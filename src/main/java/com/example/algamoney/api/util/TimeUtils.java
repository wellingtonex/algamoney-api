package com.example.algamoney.api.util;

import java.util.concurrent.TimeUnit;

public class TimeUtils {

	public static void main(String[] args) {
		long minutes = TimeUnit.MINUTES.toSeconds(5);
		System.out.println(minutes);
	}
}
