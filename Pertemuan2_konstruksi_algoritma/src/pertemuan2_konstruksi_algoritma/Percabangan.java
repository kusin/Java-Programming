/* PROGRAM Percabangan
    # Percobangan adalah suatu kode program akan dieksekusi apabila kondisi bernilai benar.
    # Jenis-jenis percabangan
        1. IF Tungal
        2. IF then ELSE
        3. IF then ELSE IF then ELSE
        4. Switch Case
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2_konstruksi_algoritma;

// main class
public class Percabangan {
    
    // main method
    public static void main(String[]args){
        
        // deklarasi variabel
        double nilai_ujian;
        
        // ---------------------------
        // 1. IF Tunggal, => 1 kondisi
        // ---------------------------
        
        // input program
        nilai_ujian = 73;
        
        // proses program, cek kondisi
        if(nilai_ujian >= 75){
            // output program
            System.out.println("Lulus");
        }

// ----------------------------
// 2. IF then ELSE => 2 kondisi
// ----------------------------

        // input program
        nilai_ujian = 73;
        
        // proses program, cek kondisi
        if(nilai_ujian >= 75){
            // output program
            System.out.println("Lulus");
        }
        else{
            // output program
            System.out.println("Remedial");
        }
        
//        ----------------------------------------------------
//        3. IF then ELSE IF then ELSE => lebih dari 2 kondisi
//        ----------------------------------------------------

        // input program
        nilai_ujian = 61;
        
        // proses program, cek kondisi
        if(nilai_ujian >= 80){
            // output program
            System.out.println("Sangat Bagus");
        }
        else if(nilai_ujian >= 70){
            // output program
            System.out.println("Cukup");
        }
        else{
            // output program
            System.out.println("Kurang Bagus;");
        }
        
        // 4. Switch Case => lebih dari 2 kondisi, dengan operator perbandingan ==
        // konversi kode warna menjadi warna.
        // ex. kode warna 1 == Merah, 2 == Kuning, 3 == Hijau, Selain 1,2,3 maka Biru
        // -----------------------------------------------------------------------
        
        // deklarasi variabel
        int kode_warna = 99;
        
        // cek kondisi percabangan
        switch(kode_warna){
            case 1 -> {
                System.out.println("Merah");
            }
            case 2 -> {
                System.out.println("Kuning");
            }
            case 3 -> {
                System.out.println("Hijau");
            }
            default -> {
                System.out.println("Biru");
            }
        }

    } // end main method
  
} // end main class
