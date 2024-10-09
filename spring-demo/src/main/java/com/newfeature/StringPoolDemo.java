package com.newfeature;

public class StringPoolDemo {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";

		// 使用 intern() 方法
		String str3 = new String("Hello").intern();

		System.out.println(str1 == str2); // true
		System.out.println(str1 == str3); // true
		System.out.println(str1.equals(str3)); // true
	}

}
