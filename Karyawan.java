public class Karyawan {
    protected int nip;
    protected String nama;
    protected String alamat;
    protected String tglLahir;
    protected int tahunMasuk;
    protected int gaji;
    protected String Jenkel;

    public String getJenkel() {
        return Jenkel;
    }

    public void setJenkel(String Jenkel) {
        this.Jenkel= Jenkel;
    }

    public int gajiPokok(){
        setGaji(2000000);
        return gaji;

    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public int getThnMasuk() {
        return tahunMasuk;
    }

    public void setThnMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
}
