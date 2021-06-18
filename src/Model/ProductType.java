package Model;

public class ProductType {
	private String MaLoai;
	private String TenLoai;
	private String GhiChu;
	
	public ProductType(String MaLoai, String TenLoai, String GhiChu)
	{
		this.MaLoai = MaLoai;
		this.TenLoai = TenLoai;
		this.GhiChu = GhiChu;
	}

	public String getMaLoai() {
		return MaLoai;
	}

	public void setMaLoai(String maLoai) {
		MaLoai = maLoai;
	}

	public String getTenLoai() {
		return TenLoai;
	}

	public void setTenLoai(String tenLoai) {
		TenLoai = tenLoai;
	}

	public String getGhiChu() {
		return GhiChu;
	}

	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}
	
}
