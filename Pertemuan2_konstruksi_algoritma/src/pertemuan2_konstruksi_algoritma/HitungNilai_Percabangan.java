/* PROGRAM Hitung Nilai dengan Percabangan
    Buatlah program untuk menentukan nilai akhir dan huruf mutu untuk mahasiswa CCIT.
        Dimana input program adalah nama, nilai formatif, nilai UTS, nilai UAS.
        Kemudian untuk menghitung nilai akhir menggunakan rumus
            nilai akhir = 40% formatif + 30% UTS + 30% UAS
                                  80        77         78
              78,5                    32        23.1        
        Kemudian untuk menentukan huruf mutu menggunakan rumus
            Jika nilai akhir lebih dari 80 maka A
            Jika nilai akhir lebih dari 70 maka B
            Jika nilai akhir lebih dari 60 maka C
            Jika nilai akhir lebih dari 50 maka D
            Jika nilai akhir kurang dari 50 maka E
*/ 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2_konstruksi_algoritma;

// deklarasi library
import java.util.Scanner;

// main class
public class HitungNilai_Percabangan {
    
    // main method
    public static void main(String[]args){
        
        // deklarasi object scanner
        Scanner sc = new Scanner(System.in);
        
        // deklarsi object
        String nama;
        double formatif;
        double uts;
        double uas;
        double nilai_akhir;
        char huruf_mutu;
        
        // masukan 
        System.out.println("PROGRAM Hitung Nilai");
        System.out.println("====================");
        System.out.print("Masukan nama mahasiswa : ");
        nama = sc.nextLine();
        System.out.print("Nilai Formatif : ");
        formatif = sc.nextDouble();
        System.out.print("Nilai UTS : ");
        uts = sc.nextDouble();
        System.out.print("Nilai UAS : ");
        uas = sc.nextDouble();
        
        // menentukan nilai akhir
        nilai_akhir = (formatif * 0.4) + (uts * 0.3) + (uas * 0.3);
        
        // menentukan huruf mutu
        if(nilai_akhir >= 80){
            huruf_mutu = 'A';
        }
        else if(nilai_akhir >= 70){
            huruf_mutu = 'B';
        }
        else if(nilai_akhir >= 60){
            huruf_mutu = 'C';
        }
        else if(nilai_akhir >= 50){
            huruf_mutu = 'D';
        }
        else{
            huruf_mutu = 'E';
        }
        
        // output program
        System.out.println("\n\nOutput Program");
        System.out.println("==============");
        System.out.println("Nama mahasiswa " +nama);
        System.out.println("Nilai akhir " +nilai_akhir);
        System.out.println("Huruf mutu " +huruf_mutu);
        
    } // end main method
} // end main class
