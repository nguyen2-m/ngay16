package cty.trungtamjava.baitapthuchanh;

public class NhanVien extends CanBo {
	
	String congViec;
	
	

	public NhanVien(String name, int age, String sex, String address,String congViec) {
		super(name, age, sex, address);
		this.congViec=congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	@Override
	public String toString() {
		return "NhanVien [congViec=" + congViec + 
				", name=" + name + 
				", age=" + age + 
				", sex=" + sex + 
				", address="+ address + 
				"]";
	}
	
	

}
