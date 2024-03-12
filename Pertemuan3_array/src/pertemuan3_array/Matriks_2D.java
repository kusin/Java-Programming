/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3_array;

/* PROGRAM Matriks 2D
    Program ini digunakan untuk menjumlahkan matriks 2D. Dimana matriks tersebut berukuran 3 baris x 3 kolom
*/

// main class
public class Matriks_2D {
    
    // main method
    public static void main(String[]args){
        
        // deklarasi variabel
        int[][] matriks_A = new int[3][3];
        int[][] matriks_B = new int[3][3];
        int[][] hasil = new int[3][3];
        
        // input data
        matriks_A = new int[][]{
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        
        matriks_B = new int[][]{
            {1, 0, 0}, {0, 1, 0}, {0, 0, 1}
        };
        
        // proses program
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                hasil[i][j] = matriks_A[i][j] + matriks_B[i][j];
            }
        }
        
        // output program
        System.out.println("\nMatriks A");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(+matriks_A[i][j] +"\t");
            }
            System.out.println("");
        }
        
        System.out.println("\nMatriks B");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(+matriks_B[i][j] +"\t");
            }
            System.out.println("");
        }
        
        System.out.println("\nHasil penjumlahan matriks");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(+hasil[i][j] +"\t");
            }
            System.out.println("");
        }
    }
}
