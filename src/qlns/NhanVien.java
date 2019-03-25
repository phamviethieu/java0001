package qlns;
import java.util.Scanner;
public class NhanVien extends People {
	Scanner sc = new Scanner(System.in);
	private float luongChinhThuc;
	private float heSo;
	
	public float getLuongChinhThuc() {
		return luongChinhThuc;
	}

	public void setLuongChinhThuc(Float luongChinhThuc) {
		this.luongChinhThuc = luongChinhThuc;
	}
	
	public float getHeSo() {
		return heSo;
	}

	public void setHeSo(float heSo) {
		this.heSo = heSo;
	}

	@Override
	public void nhapThongTin() {
		System.out.println("Nhan vien:");
		super.nhapThongTin();
		System.out.println("Nhap he so luong: ");
		setHeSo(sc.nextFloat());
	}


	@Override
	public void tinhLuong() {
		luongChinhThuc = super.getLuongCoBan()*getHeSo();
		System.out.println("Luong chinh thuc cua Nhan Vien thang nay la: " + (luongChinhThuc /30 * super.getNgayCong()) + "(VND)");
		
	}


	public void showInfo() {
		System.out.println("Nhan Vien: ");
		super.showInfo();
		
	}
}
