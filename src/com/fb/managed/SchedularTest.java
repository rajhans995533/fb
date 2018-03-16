package com.fb.managed;

import javax.ejb.Schedule;
import javax.ejb.Singleton;

@Singleton
public class SchedularTest {
//	@Schedule(second = "*", minute = "*/5", hour = "*", persistent = false)
	public void go() {
		System.out.println("Schedular is classed");
	}
}
