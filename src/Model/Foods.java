package Model;

public class Foods {
	private String MaMon;
	private String TenMon;
	private int Gia;
	private String Anh;
	
	public Foods(String MaMon, String TenMon, int Gia, String Anh) {
		this.MaMon = MaMon;
		this.TenMon = TenMon;
		this.Gia = Gia;
		this.Anh = Anh;
	}

	public String getMaMon() {
		return MaMon;
	}

	public void setMaMon(String maMon) {
		MaMon = maMon;
	}

	public String getTenMon() {
		return TenMon;
	}

	public void setTenMon(String tenMon) {
		TenMon = tenMon;
	}

	public int getGia() {
		return Gia;
	}

	public void setGia(int gia) {
		Gia = gia;
	}

	public String getAnh() {
		return Anh;
	}

	public void setAnh(String anh) {
		Anh = anh;
	}
	
	
}
