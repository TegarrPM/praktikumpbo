/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author T E G A R 
 */
public class SiswaObj {
    
    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        Siswa s1 = new Siswa();
        s1.setNama("Tegar");
        s1.setNilai(90);
        s1.setKelas("XI RPL B");
        s1.setAlamat("Karanganyar'Ant");
        
        s1.getAll();
    }
        
}
