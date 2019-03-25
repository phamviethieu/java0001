package OOP;

public abstract class People {
	
	protected String ten;
	protected String gioiTinh;
	protected int ID;
	protected String ChuyenNganh;
	protected int diem;
	//CONSTRUCTOR
	//SET, GET


	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getChuyenNganh() {
		return ChuyenNganh;
	}
	public void setChuyenNganh(String ChuyenNganh) {
		this.ChuyenNganh = ChuyenNganh;
	}
	public int getDiem() {
		return diem;
	}
	public void setDiem(int diem) {
		this.diem = diem;
	}
	public void showInfo() {
		System.out.println("Ho ten: " + getTen());
		System.out.println("gioiTinh: " + getGioiTinh());
		System.out.println("Chuyen Nganh : " + getChuyenNganh());
	
	}

}
