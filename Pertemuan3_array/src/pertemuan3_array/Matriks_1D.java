/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3_array;

/* PROGRAM Matriks 1D
    Program ini digunakan untuk menjumlahkan matriks 1D. Dimana matriks tersebut berukuran 5 baris x 1 kolom.
*/

// main class
public class Matriks_1D {
    
    // main method
    public static void main(String[]args){
        
        // deklarasi variabel
        int[] matriks_A = new int[5];
        int[] matriks_B = new int[5];
        int[] hasil = new int[5];
        
        
        // input data matriks A
        // cara ke 1
        matriks_A[0] = 1;
        matriks_A[1] = 2;
        matriks_A[2] = 3;
        matriks_A[3] = 4;
        matriks_A[4] = 5;
        
        // cara ke 2
        // matriks_A = new int[]{1, 2, 3, 4, 5};
        
        // input data matriks B
        // cara ke 1
        matriks_B[0] = 6;
        matriks_B[1] = 7;
        matriks_B[2] = 8;
        matriks_B[3] = 9;
        matriks_B[4] = 10;
        
        // cara ke 2
        // matriks_B = new int[]{6, 7, 8, 9, 10};
        
        // proses penjumlahan matriks_A dan matriks_B
        for(int i=0; i<5; i++){
            hasil[i] = matriks_A[i] + matriks_B[i];
        }        
        
        // output program
        System.out.println("\nMatriks A");
        for(int i=0; i<5; i++){
            System.out.println(matriks_A[i]);
        }
        
        System.out.println("\nMatriks B");
        for(int i=0; i<5; i++){
            System.out.println(matriks_B[i]);
        }
        
        System.out.println("\nHasil Penjumlahan Matriks");
        for(int i=0; i<5; i++){
            System.out.println(hasil[i]);
        }
    }
}
