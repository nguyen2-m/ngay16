package cty.BaiTap.NamMoi;

import java.util.Scanner;

public class KiemTraSoDoiXung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap vao so can kiem tra");
		int x = scan.nextInt();
		int soDu;
		int soMoi = 0;
		int soCu = x;
		while (soCu != 0) {
			soDu = soCu % 10;
			soMoi = soMoi * 10 + soDu;
			soCu = soCu / 10;
		}
		if (soMoi == x) {
			System.out.println("doi xung");
		} else
			System.out.println("nooooooooo");
	}

}
