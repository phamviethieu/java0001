package qlns;
public class Main {
	public static void main(String[] args) {
	
		People gd1 = new GiamDoc();
		gd1.nhapThongTin();
		System.out.println("======================");
	
		People tp1 = new TruongPhong();
		tp1.nhapThongTin();
		System.out.println("======================");
		People nv1 = new NhanVien();
		nv1.nhapThongTin();
		System.out.println("======================");
		
		gd1.showInfo();
		gd1.tinhLuong();
		tp1.showInfo();
		tp1.tinhLuong();
		nv1.showInfo();
		nv1.tinhLuong();
	}
}
