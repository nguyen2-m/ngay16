import java.util.Scanner;

public class SapXepAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap so chuoi ban muon ss");
		int sochuoi = scan.nextInt();
		String[] s1 = new String[sochuoi];
		Scanner scan1 = new Scanner(System.in);
		System.out.println("nhap gia trei cho tung chuoi");
		for (int i = 0; i < sochuoi; i++) {
			s1[i] = scan1.nextLine();
			System.out.println(s1[i]);
		}
		String temp;
		for (int i = 0; i < sochuoi; i++) {
			for (int j = i + 1; j < sochuoi; j++) {
				if (s1[i].compareTo(s1[j]) > 0) {
					temp = s1[i];
					s1[i] = s1[j];
					s1[j] = temp;
				}
			}
		}
		for (int i = 0; i < sochuoi; i++) {
			System.out.println(s1[i]);
		}

	}

}
