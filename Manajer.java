package perusahaan;
public class Manajer extends Karyawan implements Pekerja, Pengelola{
private String departemen;

    // Constructor untuk kelas Manajer
    public Manajer(String nama, int usia, char jenis_kelamin, String alamat, double gaji, String departemen) {
        super(nama, usia, jenis_kelamin, alamat, gaji);  // memanggil constructor kelas induk
        this.departemen = departemen;
    }

    // Getter dan Setter untuk departemen
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
    
    public void biodata(){
        hitungGaji();
        System.out.println("Nama\t: "+getNama());
        System.out.println("Usia\t: "+getUsia());
        System.out.println("Alamat\t: "+getAlamat());
        System.out.println("Jenis Kelamin\t: "+getJenis_kelamin());
        System.out.println("Gaji\t: "+getGaji());
    }
    // Implementasi method bekerja dari interface Pekerja
    @Override
    public void bekerja() {
        System.out.println(getNama() + " sedang bekerja di departemen " + departemen + ".");
    }

    // Implementasi method mengelolaKaryawan dari interface Pengelola
    @Override
    public void mengelolaKaryawan() {
        System.out.println(getNama() + " sedang mengelola karyawan di departemen " + departemen + ".");
    }

    @Override
    public int hitungHariKerja(int hariDalamBulan) {
        int hariKerja = 0;

        // Mengasumsikan hari pertama bulan adalah Senin (1 = Senin, 7 = Minggu)
        int hariPertama = 1;

        for (int i = 1; i <= hariDalamBulan; i++) {
            if (hariPertama != 6 && hariPertama != 7) {  // Jika bukan Sabtu atau Minggu
                hariKerja++;
            }
            hariPertama++;
            if (hariPertama > 7) {
                hariPertama = 1;  // Reset ke hari Senin setelah Minggu
            }
        }

        return hariKerja;
    }
}
