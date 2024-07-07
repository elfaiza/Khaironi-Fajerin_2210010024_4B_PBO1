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
public class PariwisataDetail extends Pariwisata{
    //overriding
    public PariwisataDetail(String nama, String kode, String wisata) {
        super(nama, kode, wisata);
    }
    
    public int getTahunRelease (){
        return Integer.parseInt (getKode().substring(2, 4))+ 2000;
    } 
    
    public String getKec (){
        String kodeKec = getKode().substring(0, 2);
        if(kodeKec.equals("10")){
            return "Kecamatan Batu Benawa";
        } else {
            return "Kecamatan Lain";
        }
    }
    
    public String getKend(){
        //seleksi swicth
        String kodeKend = getKode().substring(4, 6);
        switch(kodeKend){
            case "01":
                return "Semua Kendaraan";
            case "02":
                return "Cuma Roda 2";
            default:
                return "Jalan Kaki Saja";
           
         }
    }
    //polymorpism
    @Override
    public String displayinfo(){
        return super.displayinfo()+
                "\nTahun Release : "+getTahunRelease()+
                "\nKecamatan: "+getKec()+
                "\nKendaraan : "+getKend();
    }
}
