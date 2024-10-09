package com.newfeature;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;

public class Java11NewFeature {
	public static void main(String[] args) {
//		varField();
//		test2();

		test3();

	}

	private static void varField(){
		var message = "Hello, Java 11";
		System.out.println(message);
	}

	private static void test2(){
		String str = "   Hello, Java 11!   ";

		// 使用 strip() 方法去除前后空格
		System.out.println("Strip: '" + str.strip() + "'"); // 输出: 'Hello, Java 11!'

		// 使用 isBlank() 方法检查字符串是否为空或只包含空白字符
		System.out.println("Is Blank: " + str.isBlank()); // 输出: false

		// 使用 lines() 方法将字符串按行分割
		str = "Hello\nJava\n11";
		str.lines().forEach(System.out::println); // 输出每一行

		// 使用 repeat() 方法重复字符串
		System.out.println("Repeat: " + "Java".repeat(3)); // 输出: JavaJavaJava
	}

	@SneakyThrows
	public static void test3(){
		Path path = Path.of("example.txt");

		// 写入字符串到文件
		Files.writeString(path, "Hello, Java 11 File API!");

		// 从文件读取字符串
		String content = Files.readString(path);
		System.out.println("File Content: " + content);

		// 清理文件
//		Files.delete(path);
	}

}
