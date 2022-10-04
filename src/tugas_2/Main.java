/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_2;

/**
 *
 * @author yusufkarback
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa(123, "ucup", "6 april", "TMJ");
        
        System.out.println(mahasiswa.getNama());
        System.out.println(mahasiswa.getNim());
        System.out.println(mahasiswa.getProdi().getNamaProdi());
        
        System.out.println("total hadir = " + mahasiswa.absenHarian(30));
        System.out.println("nilai rata-rata = " + mahasiswa.nilaiKuliah(90));
        
        
    }
}
