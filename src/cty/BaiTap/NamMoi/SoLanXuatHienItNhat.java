package cty.BaiTap.NamMoi;

import java.util.Scanner;

public class SoLanXuatHienItNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("so phan tu trong mang: ");
		int soPhanTu = scan.nextInt();
		int arr[]=new int[soPhanTu];
		for(int i=0;i<soPhanTu;i++) {
			int x = scan.nextInt();
		}
		int max=arr[0];
		for(int num : arr) {
			if(max<num)
				max=num;
		}
		
	}

}
