
public class Biodata {
	private String nama;
	private String tempatlahir;
	private String tanggallahir;
	private String alamat;
	
	Biodata(String nama,String tempatlahir,String tanggallahir,String alamat){
		this.nama=nama;
		this.tempatlahir=tempatlahir;
		this.tanggallahir=tanggallahir;
		this.alamat=alamat;
		
		
	}
	
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getTempatlahir() {
		return tempatlahir;
	}

	public void setTempatlahir(String tempatlahir) {
		this.tempatlahir = tempatlahir;
	}

	public String getTanggallahir() {
		return tanggallahir;
	}

	public void setTanggallahir(String tanggallahir) {
		this.tanggallahir = tanggallahir;
	}

	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
}
