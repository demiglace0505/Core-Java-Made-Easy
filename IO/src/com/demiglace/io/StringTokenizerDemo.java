package com.demiglace.io;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String s = "Serialize,Yourself,Close,The,World,Open,The,Next.";
		
		StringTokenizer st = new StringTokenizer(s, ",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
