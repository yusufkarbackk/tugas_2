/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_2;

/**
 *
 * @author yusufkarback
 */
public class Mahasiswa extends Nilai{
    private int nim;
    private String nama;
    private String tanggal_lahir;
    private Prodi prodi;
    
    public Mahasiswa(int nim, String nama, String tanggal_lahir, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
        this.prodi = new Prodi(prodi);
    }

    @Override
    public int absenHarian(int jumlah_absen_masuk) {
        return jumlah_absen_masuk;
    }

    @Override
    public int nilaiKuliah(int nilai_harian) {
        return nilai_harian;
    }
}
