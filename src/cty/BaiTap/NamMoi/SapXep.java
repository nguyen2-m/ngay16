package cty.BaiTap.NamMoi;

import java.util.Scanner;

public class SapXep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count, temp;
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Nhap cac phan tu trong mang: ");
	        count = scan.nextInt();
	        int num[] = new int[count];
	        System.out.println("cac phan tu trong mang la:");
	        for (int i = 0; i < count; i++)
	        {
	            num[i] = scan.nextInt();
	        }
	        scan.close();
	        for (int i = 0; i < count; i++)
	        {
	            for (int j = i + 1; j < count; j++) {
	                if (num[i] > num[j])
	                {
	                    temp = num[i];
	                    num[i] = num[j];
	                    num[j] = temp;
	                }
	            }
	        }
	        System.out.print("kq sau khi sx: ");
	        for (int i = 0; i < count; i++)
	        {
	            System.out.print(num[i] + ", ");
	        }
	}

}
