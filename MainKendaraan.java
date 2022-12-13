/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package w01_kendaraan;

/**
 *
 * @author Intan Aisyah Wulandari
 * TI-A
 */
public class MainKendaraan extends Kendaraan {

    //ovveride = menindihkan
    @Override
    public void jalankan(){
        System.out.println("Matic");
    }
    @Override
     public String getMesin(){
          return super.getMesin();
      }
    
     //super mengembalikan kepada induk
     //karena dpanggil oleh anak terloncat ke induk
    @Override
      public void setMesin(String mesin){
          System.out.println("Besar mesin : "+mesin);
      }
    
    public static void main(String[]args){
        MainKendaraan mainkendaraan = new MainKendaraan();
        //mainkendaraan.jalankan();
        mainkendaraan.setMesin("150 cc");
        System.out.println(mainkendaraan.getMesin());
    }
}


