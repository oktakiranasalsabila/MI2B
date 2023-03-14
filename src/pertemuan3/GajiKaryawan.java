/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;
import java.util.Scanner;

/**
 *
 * @author Plat Merah
 */
public class GajiKaryawan {
  public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.println("## program hitung gaji ##");
      System.out.println();
      
      String nama;
      char golongan;
      int jam_ker = 0, upah_perjam =0, total_upah;
      System.out.print("nama karyawn :");
      nama = input.nextLine();
      System.out.print("golongan :");
      golongan = input.next().charAt(0);
      System.out.print("jumlah jam kerja :");
      jam_ker = input.nextInt();
      
      System.out.println();
      
      switch (golongan){
          case 'A':
              upah_perjam =8500;
              break;
          case 'B':
              upah_perjam =10500;
              break;
          case 'C':
              upah_perjam =13000;
              break;
          case 'D':
              upah_perjam =15000;
              break;
              
      }
      
     total_upah = jam_ker * upah_perjam;
     
     if((jam_ker - 30)>0){
         total_upah = total_upah + ((jam_ker - 30)*3000);
     }
     System.out.println(nama + ""+" menerima upah Rp." + total_upah  + " "+"per minggu");
     
       
  }
}
