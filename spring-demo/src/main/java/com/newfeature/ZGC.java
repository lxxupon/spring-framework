package com.newfeature;

import java.util.concurrent.TimeUnit;

public class ZGC {

	/**
	 * # ZGC 是一种 JVM 选项，无法通过代码示例直接展示
	 * # 启动应用程序时可以使用以下参数启用 ZGC：
	 *  java -XX:+UseZGC -jar yourapp.jar
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 100; i++) {
			TimeUnit.SECONDS.sleep(10L);
		}
	}
}
