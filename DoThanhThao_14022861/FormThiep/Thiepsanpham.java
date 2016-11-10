package FormThiep;

public class Thiepsanpham {
	private int makh;
	private String tenkh;
	private int mabt;
	private String sodienthoai;
	private String gmail;
	private String diachi;
	private String yeucau;
	public Thiepsanpham(int makh, String tenkh, int mabt, String sodienthoai, String gmail, String diachi,
			String yeucau) {
		super();
		this.makh = makh;
		this.tenkh = tenkh;
		this.mabt = mabt;
		this.sodienthoai = sodienthoai;
		this.gmail = gmail;
		this.diachi = diachi;
		this.yeucau = yeucau;
	}
	public int getMakh() {
		return makh;
	}
	public void setMakh(int makh) {
		this.makh = makh;
	}
	public String getTenkh() {
		return tenkh;
	}
	public void setTenkh(String tenkh) {
		this.tenkh = tenkh;
	}
	public int getMabt() {
		return mabt;
	}
	public void setMabt(int mabt) {
		this.mabt = mabt;
	}
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getYeucau() {
		return yeucau;
	}
	public void setYeucau(String yeucau) {
		this.yeucau = yeucau;
	}
	public Thiepsanpham() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
