/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3_array;

import java.util.Scanner;

// main class
public class Array {
    
    // main method
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        // deklarasi variabel
        double[] bilangan = new double[3];
        double hasil = 0;
        
        
        
        // input program
        for(int i=0; i<3; i++){
            System.out.print("Masukan bilangan ke-"+(i+1)+" : ");
            bilangan[i] = sc.nextDouble();
        }
        
        // proses program
        for(int i=0; i<3; i++){
            hasil = hasil + bilangan[i];
        }
        
        hasil = hasil / 3;
        
        
        System.out.println(hasil);
        //}
        
        
        
        
        
        
        
        
        
    }
}
