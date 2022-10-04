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
        
        System.out.println("total hadir = " + mahasiswa.absenHarian(30));
    }
}
