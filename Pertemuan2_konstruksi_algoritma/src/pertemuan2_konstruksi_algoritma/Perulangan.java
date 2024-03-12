/* PROGRAM Perulangan
    # Perulangan adalah suatu kode program akan dieksekusi secara TERUS MENERUS selama kondisi perulangan bernilai benar,
    # Jenis-jenis perulangan
        1. For
        2. While
        3. Do-While
    
    # contoh perulangan, Bagaimana cara menampilkan bilangan 1 sampai 5.
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2_konstruksi_algoritma;

// main class
public class Perulangan {
    
    // main method
    public static void main(String[]args){
        
        // Perulangan FOR
        int x;
        System.out.println("Perulangan FOR");
        System.out.println("--------------");
        for(x=11; x<=10; x++){
            System.out.println("Bilangan ke-" +x);
        }
            
        // Perulangan WHILE
        int y = 11;
        System.out.println("\n\nPerulangan WHILE");
        System.out.println("----------------");
        while(y <= 10){
            System.out.println("Bilangan ke-" +y);
            y++;
        }
       
        // // Perulangan DO-WHILE
        int z = 11;
        System.out.println("\n\nPerulangan DO-WHILE");
        System.out.println("----------------");
        do{
            System.out.println("Bilangan ke-" +z);
            z++;
        }while(z <= 10);
        
    } // end main method
    
} // end main class
