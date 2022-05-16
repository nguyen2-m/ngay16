package cty.trungtamjava.baitapthuchanh;

public class KiSu extends CanBo {
	
	String nganh;
	
	

	public KiSu(String name, int age, String sex, String address,String nganh) {
		super(name, age, sex, address);
		this.nganh=nganh;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	@Override
	public String toString() {
		return "KiSu [nganh=" + nganh + 
				", name=" + name + 
				", age=" + age + 
				", sex=" + sex + 
				", address=" + address
				+ "]";
	}
	
	

}
