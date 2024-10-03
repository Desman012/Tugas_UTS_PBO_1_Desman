package perusahaan;
public abstract class Karyawan {
    private String nama, alamat;
    private int usia;
    private double gaji;
    private char jenis_kelamin;

    // Constructor untuk kelas Karyawan
    public Karyawan(String nama, int usia, char jenis_kelamin, String alamat, double gaji) {
        this.nama = nama;
        this.usia = usia;
        this.jenis_kelamin = jenis_kelamin;
        this.alamat = alamat;
        this.gaji = gaji;
    }

    // Getter dan Setter dengan konsep Encapsulation
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public char getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(char jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
    
    public void hitungGaji(){
        if(usia > 35){
            gaji = gaji*2;
        }
    }
    // Abstract method untuk hitung hari kerja
    public abstract int hitungHariKerja(int hariDalamBulan);
}
