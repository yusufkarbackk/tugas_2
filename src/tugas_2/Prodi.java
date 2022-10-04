/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_2;

/**
 *
 * @author yusufkarback
 */
public class Prodi extends Jurusan{
    private Jurusan jurusan;
    private String nama_prodi;
    
    public Prodi(String nama_prodi){
        this.nama_prodi = nama_prodi;
    }
    
    public String getNamaProdi(){
        return this.nama_prodi;
    }
}
