/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2_konstruksi_algoritma;

// main class
public class Faktorial {
    
    // main method
    public static void main(String[]args){
        
        // deklarasi variabel
        int angka = 5;
        int faktorial = 1;
        int i;
        
        // proses hitung faktorial
        for(i=angka; i>=1; i--){
           faktorial = faktorial * i; 
	}
        
        // output program
        System.out.println("Hasil faktorial :" +faktorial);
        
    } // end main method
} // end main class
