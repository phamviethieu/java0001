package qlns;
import java.util.Scanner;

public abstract class People {
	Scanner sc = new Scanner(System.in);
	protected int ID;
	protected String Name;
	protected int ngayCong;
	protected float luongCoBan;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNgayCong() {
		return ngayCong;
	}
	public void setNgayCong(int ngayCong) {
		this.ngayCong = ngayCong;
	}
	public float getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(float luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public void nhapThongTin() {
		System.out.println(" Ho Ten : ");
		setName(sc.nextLine());
		System.out.println(" ID: ");
		setID(sc.nextInt());
		System.out.println("-----------------------");
		System.out.println("Nhap luong co ban: ");
		setLuongCoBan(sc.nextFloat());
		System.out.println("So ngay lam viec trong thang: ");
		setNgayCong(sc.nextInt());
	
	}
	
	public void showInfo() {
		System.out.println("Ten: " + getName());
		System.out.println("ID : " + getID());
		System.out.println("So ngay lam viec trong thang: " + getNgayCong());
		System.out.println("Luong co ban: " + getLuongCoBan());
	
	}
	public abstract void tinhLuong();
}
