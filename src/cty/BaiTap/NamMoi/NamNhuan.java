package cty.BaiTap.NamMoi;

import java.util.Scanner;

public class NamNhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap vao nam ban muon kiem tra");
		int nam = scan.nextInt();
		boolean nhuan = false;
		if (nam % 4 == 0) {
			if (nam % 100 == 0) {
				if (nam % 400 == 0) {
					nhuan = true;
				} else
					nhuan = false;
			} else
				nhuan = true;
		} else
			nhuan = false;

		if (nhuan == true)
			System.out.println("nam nhuan");
		else
			System.out.println("khong phai nam nhuan");
	}

}
