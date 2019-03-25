package OOP;

class Student extends People {
	private int ID_HocSinh;
	private String ChuyenNganh;
	private int diem;

	//SETTER GETTER
	public void setChuyenNganh(String ChuyenNganh) {
		this.ChuyenNganh = ChuyenNganh;
	}

	public String getChuyenNganh() {
		return this.ChuyenNganh;
	}

	public void setID(int iD) {
		super.setID(iD);
		this.ID_HocSinh = iD;
	}
	public int getID() {
		return this.ID_HocSinh;
	}
	public int getDiem() {
		return this.diem;
	}

	public void setDiem(int diem) {
		this.diem = diem;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		
		System.out.println("Diem: " + getDiem());
		System.out.println("ID " + getID());
		
	}



//	public Student(int iD_HocSinh, String chuyenNganh, int diem) {
//		super();
//		ID_HocSinh = iD_HocSinh;
//		ChuyenNganh = chuyenNganh;
//		this.diem = diem;
//	}

}
