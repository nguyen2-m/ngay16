package cty.trungtamjava.baitapthuchanh;

public class CongNhan extends CanBo {

	int level;

	public CongNhan(String name, int age, String sex, String address, int level) {
		super(name, age, sex, address);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "CongNhan {level=" + level + 
				", name=" + name + 
				", age=" + age + 
				", sex=" + sex + 
				", address=" + address
				+ "}";
	}

	

}
