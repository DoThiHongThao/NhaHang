package Model;

public class Order {
	private String MaOrder;
	private String Ten;
	private String GhiChu;
	
	public Order(String MaOrder, String Ten, String GhiChu)
	{
		this.MaOrder = MaOrder;
		this.Ten = Ten;
		this.GhiChu = GhiChu;
	}

	public String getMaOrder() {
		return MaOrder;
	}

	public void setMaOrder(String maOrder) {
		MaOrder = maOrder;
	}

	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public String getGhiChu() {
		return GhiChu;
	}

	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}
	
}
