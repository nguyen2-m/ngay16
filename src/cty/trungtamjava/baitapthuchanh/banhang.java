package cty.trungtamjava.baitapthuchanh;

public class banhang {
	private String tenloaicaffe;
	private double giatien1kg;
	private double khoiluong;

	public banhang(String ten, double gia, double kl) {
		this.tenloaicaffe = ten;
		this.giatien1kg = gia;
		this.khoiluong = kl;

	}

	public double tinhtongtien() {
		return this.giatien1kg * this.khoiluong;
	}

	public boolean kiemtrakhoiluonglonhon(double khoiluong) {
		return this.khoiluong > khoiluong;
	}

	public boolean kiemtratienlonhon500k() {
		return this.tinhtongtien() > 500000;
	}

	public double giamgia(double x) {

		if (this.tinhtongtien() >= 500) {
			return (x / 100) * this.tinhtongtien();
		} else
			return 0;
	}

}
