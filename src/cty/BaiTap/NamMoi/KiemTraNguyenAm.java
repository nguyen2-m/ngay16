package cty.BaiTap.NamMoi;

import java.util.Scanner;

public class KiemTraNguyenAm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isVowel = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap vao ki tu can kiem tra");
		char ch = scan.next().charAt(0);
		scan.close();
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			isVowel = true;
		}

		if (isVowel == true) {
			System.out.println(ch+" la nguyen am");
		}
		else {
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
				System.out.println(ch+" la phu am");
			else
				System.out.println("khong nam trong bang chu cai");
		}
	}

}
