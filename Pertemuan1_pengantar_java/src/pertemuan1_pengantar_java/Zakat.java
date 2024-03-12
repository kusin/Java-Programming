/* PROGRAM Zakat
    Buatlah program untuk menghitung zakat. Dimana masukan program adalah nama, penghasilan dan keluaran adalah zakat yang dibayarkan.
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1_pengantar_java;

import java.util.Scanner;

// main class
public class Zakat {
    
    // main method
    public static void main(String[]args){
        
        // deklarasi object scanner
        Scanner sc = new Scanner(System.in);
        
        // deklarasi variabel
        String nama;
        double penghasilan;
        double jumlah_zakat;
        
        // masukan program
        System.out.print("Nama muzakki : ");
        nama = sc.nextLine();
        System.out.print("Jumlah penghasilan : ");
        penghasilan = sc.nextDouble();
        
        // proses program
        // rumus zakat adalah 2,5% dari jumlah penghasilan
        jumlah_zakat = penghasilan * 0.025;
        
        // keluaran program
        System.out.println("Total zakat anda : " +jumlah_zakat);
        
        
    }
}
