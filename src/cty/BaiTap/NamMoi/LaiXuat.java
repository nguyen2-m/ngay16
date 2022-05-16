package cty.BaiTap.NamMoi;

public class LaiXuat {
    public void calculate(int p, int t, double r, int n) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("lai sau " + t + " nam la : "+cinterest);
        System.out.println("soco dc sau " + t + " nam: "+amount);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaiXuat obj = new LaiXuat();
		obj.calculate(2000, 5, 0.08, 12);
	}

}
