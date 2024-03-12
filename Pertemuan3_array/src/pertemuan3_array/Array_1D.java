/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3_array;

/* PROGRAM Array
    Array adalah suatu cara yang digunakan untuk menyimpan banyak nilai dalam sebuah variabel.
    Jenis-jenis array terbagi menjadi
    - Array 1D, hanya baris
    - Array 2D, baris dan kolom
    - Array 3D, silahkan explore sendiri
*/

// deklarasi library
import java.io.Console;
import java.util.Scanner;

// main class
public class Array_1D {
    
    // main method
    public static void main(String[]args){
        
        // deklarasi object scanner
        Scanner sc = new Scanner(System.in);
        
        // deklarasi variabel
        String[] arr_nama = new String[5];
        
        // input data cara ke 1
        arr_nama[0] = "Aryajaya Alamsyah";
        arr_nama[1] = "Iim Karimah";
        arr_nama[2] = "Amalia Azatil Ismah";
        arr_nama[3] = "Farham Ilman Eve";
        arr_nama[4] = "Ahmad Bilal Maulana";
        
        // input data cara ke 2
        //arr_nama = new String[]{"Aryajaya Alamsyah", "Imam Marzuki Shofi", "Nurhayati", "Imas Sukaesih Sitanggang", "Annisa"};
        
        // input data cara ke 3
        // for(int i=0; i<5; i++){
            // System.out.print("Masukan nama mahasiswa ke-" +(i+1)+ " : ");
            // arr_nama[i] = sc.nextLine();
        // }
        
        // output program
        System.out.println("\nTanpa perulangan");
        System.out.println("Mahasiswa ke-1 adalah " +arr_nama[0]);
        System.out.println("Mahasiswa ke-2 adalah " +arr_nama[1]);
        System.out.println("Mahasiswa ke-3 adalah " +arr_nama[2]);
        System.out.println("Mahasiswa ke-4 adalah " +arr_nama[3]);
        System.out.println("Mahasiswa ke-5 adalah " +arr_nama[4]);
        
        // output program
        System.out.println("\nMenggunakan perulangan");
        for(int i=0; i<5; i++){
            System.out.println("Mahasiswa ke-" +(i+1)+ " adalah " +arr_nama[i]);
        }
        
        // clossing method scanner
        sc.close();
        
    } // end main method
} // end main clas
