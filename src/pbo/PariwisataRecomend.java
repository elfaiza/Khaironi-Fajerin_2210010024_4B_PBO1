/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author Disporapar HST
 */
public class PariwisataRecomend {
    public static void main(String[] args){
        //objek
       // Pariwisata pws = new Pariwisata ("Goa Limbuhang","102201","Alam");
    
        //System.out.println(pws.displayinfo()); 
        //System.out.println(pws.displayinfo("4km")); 
    try {
            //io sederhana
            Scanner scanner = new Scanner (System.in);

            //array
            PariwisataDetail[] pws = new PariwisataDetail[2];
            for(int i=0; i<pws.length; i++){

            System.out.print("Masukkan Nama Pariwisata " + (i+1)+": ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Kode Pariwisata" + (i+1)+": ");
            String kode = scanner.nextLine();
            System.out.print("Masukkan Jenis Wisata:" + (i+1)+": ");
            String wisata = scanner.nextLine();

           //objek
           pws[i] = new PariwisataDetail(nama, kode, wisata);
            }

            for(PariwisataDetail data: pws){
                System.out.println("========================");
                System.out.println("Data Pariwisata");
            System.out.println(data.displayinfo());
        }
        }catch (NumberFormatException e){
            System.out.println("Kesalahan Format Nomor: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Kesalahan Umum"+e.getMessage());
        }
    }
}