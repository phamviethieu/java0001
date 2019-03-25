package OOP;

public class Main {
	public static void main(String[] args) {
		NhapThongTin();
		
	}
	public static void NhapThongTin() {
		People Hieu = new Student();
		Hieu.setID(1);
		Hieu.setChuyenNganh("Java");
		Hieu.setDiem(7);
		Hieu.showInfo();
		
	}
}

