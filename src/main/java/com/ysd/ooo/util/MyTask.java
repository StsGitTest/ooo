package com.ysd.ooo.util;

import org.springframework.stereotype.Component;

@Component("myTast")
public class MyTask {

	private int count = 0;

	public void say() {
		System.out.println("大家好,我是Spring boot任务调度=>" + count++);
	}
}
