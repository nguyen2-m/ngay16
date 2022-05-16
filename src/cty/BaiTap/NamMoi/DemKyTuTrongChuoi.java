package cty.BaiTap.NamMoi;

import java.util.Scanner;

public class DemKyTuTrongChuoi {

	static void DemKiTu(String str) {
		int counter[] = new int[256];
		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			counter[x]++;
			System.out.println(x);
			System.out.println(counter[x]);
		}
		char array[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			array[i] = str.charAt(i);
			int flag = 0;
			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == array[j])
					flag++;

			}
			if (flag == 1) {
				System.out.println("so lan xuat hien cua " + str.charAt(i) 
				+ " trong chuoi " +counter[str.charAt(i)]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();
		DemKiTu(x);
	}

}
