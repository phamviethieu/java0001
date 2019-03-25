package qlns;
import java.util.Scanner;
public class TruongPhong extends People {
	Scanner sc = new Scanner(System.in);
	private String Phong;
	private float luongChinhThuc;
	private float heSo;
	
	public String getPhong() {
		return Phong;
	}

	public void setPhong(String Phong) {
		this.Phong = Phong;
	}
	
	public float getLuongChinhThuc() {
		return luongChinhThuc;
	}

	public void setLuongChinhThuc(Float luongChinhThuc) {
		this.luongChinhThuc = luongChinhThuc;
	}

	public float getHeSo() {
		return heSo;
	}

	public void setHeSo(Float heSo) {
		this.heSo = heSo;
	}

	@Override
	public void nhapThongTin() {
		// TODO Auto-generated method stub
		System.out.println("Truong Phong: ");
		super.nhapThongTin();
		System.out.println("Nhap Phong: ");
		setPhong(sc.nextLine());
		System.out.println("Nhap he so Luong: ");
		setHeSo(sc.nextFloat());
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Truong Phong");
		super.showInfo();
		System.out.println("Phong: " + getPhong());
		
	}

	@Override
	public void tinhLuong() {
		luongChinhThuc = super.getLuongCoBan()*getHeSo();
		System.out.println("Luong chinh thuc cua Truong Phong thang nay la: " + (luongChinhThuc /30 * super.getNgayCong()) + "(VND)");
	

	}

	

	
	
}
