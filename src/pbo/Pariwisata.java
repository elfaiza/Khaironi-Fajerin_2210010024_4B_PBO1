/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author Disporapar HST
 */
//class
public class Pariwisata {
    //atribut dan encapsulation
    private String nama;
    private String kode;
    private String wisata;
    
    //constructor
    public Pariwisata (String nama, String kode, String wisata){
        this.nama = nama;
        this.kode = kode;
        this.wisata = wisata;
    }
    //mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setKode (String kode) {
        this.kode = kode;
    }
    public void setWisata (String wisata) {
        this.wisata = wisata;
    }
    
    //accessor (getter)

    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }

    public String getWisata() {
        return wisata;
    }
      
    public String displayinfo() {
        return "Nama: "+getNama()+"\nKode: "+getKode()+"\nWisata: "+getWisata();
    }
    //polymorpism (overloading)
    public String displayinfo (String jarak){
        return displayinfo() + "\nJarak: "+jarak;
    }
}
