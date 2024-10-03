package perusahaan;
public class PerusahaanMain {
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek Manajer
        Manajer manajer1 = new Manajer("Budi", 35, 'L', "Jl HS ROnggo Waluyo No.15", 15000000, "IT");

        // Menampilkan informasi
        manajer1.bekerja();
        manajer1.mengelolaKaryawan();
        // Menghitung hari kerja dengan asumsi 30 hari dalam bulan tersebut
        int hariKerja = manajer1.hitungHariKerja(30);
        System.out.println("Jumlah hari kerja dalam sebulan: " + hariKerja);    }
    
}
