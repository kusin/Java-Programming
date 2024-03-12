/* PROGRAM GanjilGenap
    Apabila suatu bilangan habis dibangi 2 maka genap dan
        jika tidak habis dibagi 2 maka bilangan tersebut ganjil.
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2_konstruksi_algoritma;

// deklarasi library
import java.util.Scanner;

// main class 
public class GanjilGenap {
    
    // main method
    public static void main(String[]args){
        
        // deklarasi object
        Scanner sc = new Scanner(System.in);
        
        // deklarasi variabel
        int bilangan = 4;
        
        if(bilangan % 2 == 0){
            System.out.println("Genap");
        }
        else{
            System.out.println("Ganjil");
        }

        sc.close(); 
    
    } // end main method
} // end main clas
