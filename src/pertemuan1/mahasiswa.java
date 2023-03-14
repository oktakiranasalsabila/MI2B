/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;


public class mahasiswa {
    String nama,nobp,kelas,jurusan,prodi;
    
    public static void main(String[] args){
        mahasiswa mhs =new mahasiswa();
        mhs.nama="salsabila okta kirana";
        mhs.nobp="2101092068";
        mhs.kelas="mi2b";
        mhs.jurusan="teknologi informasi";
        mhs.prodi="manajemen informatika";
        System.out.println("nama :"+mhs.nama+"\n"+"nobp :"+mhs.nobp+"\n"+"jurusan:"+mhs.jurusan
        +"\n"+"prodi:"+mhs.prodi+"\n"+"kelas:"+mhs.kelas+"\n");
    }
    
}
