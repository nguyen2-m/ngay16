package cty.BaiTap.NamMoi;

import java.util.Scanner;

public class DaoNguoc {
	
	static void setString(String str) {
		String[] words = str.split(" ");
		String reversedString="";
		for(int i =0 ;i < words.length;i++) {
			String word = words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord=reverseWord+word.charAt(j);
			}
			reversedString=reversedString+reverseWord+" ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String obj = scan.nextLine();
		setString(obj);
	}

}
