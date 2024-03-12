/* PROGRAM InputOutput
    ex. Program Perkenalan Diri, seperti nama, umur, asal sekolah, cita-cita
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1_pengantar_java;

// deklarasi library
import java.util.Scanner;

// main class
public class InputOutput {
    
    // main method
    public static void main(String[]args){
        
        // deklarasi object scanner
        Scanner sc = new Scanner(System.in);
        
        // deklarasi variabel
        String nama; int umur; String asal_sekolah; String cita_cita;
        
        // Input Program
        System.out.println("\nPerkenalan Diri Mahasiswa Baru CCIT-FTUI");
        
        System.out.print("Siapa nama anda ? ");
        nama = sc.nextLine();
        
        System.out.print("Berapa umur anda ? ");
        umur = sc.nextInt(); sc.nextLine();
        
        System.out.print("Dari mana asal sekolah anda ? ");
        asal_sekolah = sc.nextLine();
        
        System.out.print("Apa cita-cita anda ? ");
        cita_cita = sc.nextLine();
        
        // Output program
        System.out.println("\nKeluaran program");
        System.out.println("Nama mahasiswa : " +nama);
        System.out.println("Umur Anda : " +umur);
        System.out.println("Asal Sekolah : " +asal_sekolah);
        System.out.println("Cita-Cita : " +cita_cita);
    }
}
