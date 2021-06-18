package Model;

public class ChiTietDon {
	
	private int ID;
	private String MaHoaDon;
	private String MaMon;
	private int SoLuong;
	private int DonGia;
	private String MaGiamGia;
	
	public ChiTietDon(int ID, String MaHoaDon, String MaMon, int SoLuong, int DonGia, String MaGiamGia) {
		this.ID = ID;
		this.MaHoaDon = MaHoaDon;
		this.MaMon = MaMon;
		this.SoLuong = SoLuong;
		this.DonGia = DonGia;
		this.MaGiamGia = MaGiamGia;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getMaHoaDon() {
		return MaHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		MaHoaDon = maHoaDon;
	}

	public String getMaMon() {
		return MaMon;
	}

	public void setMaMon(String maMon) {
		MaMon = maMon;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	public int getDonGia() {
		return DonGia;
	}

	public void setDonGia(int donGia) {
		DonGia = donGia;
	}

	public String getMaGiamGia() {
		return MaGiamGia;
	}

	public void setMaGiamGia(String maGiamGia) {
		MaGiamGia = maGiamGia;
	}
	
}
