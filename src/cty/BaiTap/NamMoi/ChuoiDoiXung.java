package cty.BaiTap.NamMoi;

import java.util.Scanner;
import java.util.Stack;

class ChuoiDoiXung {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap vao chuoi ban muon kiem tra");
		String input= scan.nextLine();
		Stack stack = new Stack();
		for(int i = 0;i<input.length();i++) {
			char cha=input.charAt(i);
			stack.push(cha);
		}
		String reverseString="";
		
		while(!stack.isEmpty()) {
			reverseString= reverseString + stack.pop();
		}
		System.out.println(reverseString);
		if (input.equals(reverseString)) {
			System.out.println("day la chuoi doi xung");
		}else
			System.out.println("day no nonooooooooooooo");
				
	}
}
