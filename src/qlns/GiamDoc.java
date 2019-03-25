package qlns;
import java.util.*;
public class GiamDoc extends People{
	Scanner sc = new Scanner(System.in);
	private String tenBoPhan;
	private float luongChinhThuc;
	private float heSo;
	
	public String getTenBoPhan() {
		return tenBoPhan;
	}

	public void setTenBoPhan(String tenBoPhan) {
		this.tenBoPhan = tenBoPhan;
	}
	public Float getHeSo() {
		return heSo;
	}

	public void setHeSo(Float heSo) {
		this.heSo = heSo;
	}

	@Override
	public void nhapThongTin() {
		System.out.println("Giam Doc");
		super.nhapThongTin();
		System.out.println("Nhap Bo Phan: ");
		setTenBoPhan(sc.nextLine());
		System.out.println("He So Luong: ");
		setHeSo(sc.nextFloat());
	}

	@Override
	public void showInfo() {
		System.out.println("Giam Doc");
		super.showInfo();
		System.out.println("Bo Phan: " + getTenBoPhan());
	}
	

	@Override
	public void tinhLuong() {
		System.out.println("nhap he so luong: ");
		luongChinhThuc = super.getLuongCoBan()*getHeSo();
		System.out.println("Luong chinh thuc cua Giam Doc thang nay la: " + (luongChinhThuc /30 * super.getNgayCong()) + "(VND)");
	}

}
