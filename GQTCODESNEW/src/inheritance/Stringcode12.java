package com.gqt.stringproj.pkg1;

import java.util.Scanner;

public class StringCode12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str =sc.next();
		str=str.toLowerCase();
		int vowel_int=0;
		int cons_int=0;
		String str2=" ";
		for(int i=0; i<str.length();i++) {
			if (str.charAt(i)=='a') {
				str2=str2+ "@";
			}
			else if(str.charAt(i)=='e') {
				str2=str2+ "#";
		      }
			else if(str.charAt(i)=='i') {
				str2=str2+ "$";
			}
			else if(str.charAt(i)=='o') {
				str2=str2+ "%";
		        }
			else if(str.charAt(i)=='u') {
				str2=str2+ "&";
			}
			else {
				str2=str2 + str.charAt(i);
			}
		}
		   System.out.println(str2);
			
          	}
}
