package com.ysd.ooo.util;

import java.text.SimpleDateFormat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 相当于xml文件中的<beans>
public class ConfigMyTools {
	/**
	 * 格式化当前日期
	 */
	@Bean("dateFormat")
	public SimpleDateFormat dateFormat() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	}

}
