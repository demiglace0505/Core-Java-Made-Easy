package com.demiglace.strings;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("Doge doge doge");
		sb.append("cate cate cate");
		
		System.out.println(sb);
		System.out.println(sb.capacity());
	}
}
