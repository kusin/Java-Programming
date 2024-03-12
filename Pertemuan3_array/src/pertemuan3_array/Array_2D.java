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
import java.util.Scanner;

// main class
public class Array_2D {
    
    // main method
    public static void main(String[]args){
        
        // deklarasi object scanner
        Scanner sc = new Scanner(System.in);
        
        // deklarasi variabel
        String[][] arr_mahasiswa = new String[2][3];
        
        // input data
        arr_mahasiswa = new String[][]{
            {"Aryajaya Alamsyah", "Web Development", "2"},
            {"Iim Karimah", "Software Engineering", "2"},
        };
        
        // output program
        System.out.println("\nTanpa perulangan");
        System.out.println(arr_mahasiswa[0][0] + ", " + arr_mahasiswa[0][1] + ", " +arr_mahasiswa[0][2]);
        System.out.println(arr_mahasiswa[1][0] + ", " + arr_mahasiswa[1][1] + ", " +arr_mahasiswa[1][2]);
        
        
        System.out.println("\nMenggunakan perulangan");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr_mahasiswa[i][j]);
                if(j<2)System.out.print(", ");
            }
            System.out.println("");
        }
        
        // clossing method scanner
        sc.close();
        
    } // end main method
} // end main class