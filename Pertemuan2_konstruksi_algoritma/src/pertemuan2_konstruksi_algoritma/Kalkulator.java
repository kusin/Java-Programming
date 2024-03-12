/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2_konstruksi_algoritma;

// deklarasi library
import java.util.Scanner;

// main class
class Kalkulator{

    // main method
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        // tipe yang umum digunakan
        // int, long, float, double, String, char, date, bool

        // deklarasi variabel
        float angka1;
        float angka2;
        float hasil_tambah, hasil_kurang, hasil_bagi, hasil_kali;
        int pilihan;

        do{
            
            //input program
            System.out.println("------------------------");
            System.out.println("\nAplikasi Kalkulator JAVA");
            System.out.println("------------------------");
            System.out.print("Masukan angka 1 : ");
            angka1 = sc.nextFloat();
            System.out.print("Masukan angka 2 : ");
            angka2 = sc.nextFloat();

            // Membersihkan buffer scanner
            sc.nextLine();

            System.out.println("------------------------");
            System.out.println("\nPilihan Menu ");
            System.out.println("1. Operasi Penjumlahan ");
            System.out.println("2. Operasi Pengurangan ");
            System.out.println("3. Operasi Pembagian ");
            System.out.println("4. Operasi Perkalian ");
            System.out.print("Masukan pilihan : ");
            pilihan = sc.nextInt();
            System.out.println("------------------------");

            switch (pilihan) {
                case 1 -> {
                    hasil_tambah = angka1 + angka2;
                    System.out.println("Hasil Penjumlahan : " +hasil_tambah);
                }
                case 2 -> {
                    hasil_kurang = angka1 - angka2;
                    System.out.println("Hasil Pengurangan : " +hasil_kurang);
                }
                case 3 -> {
                    hasil_bagi = angka1 / angka2;
                    System.out.println("Hasil Pembagian : " +hasil_bagi);
                }
                case 4 -> {
                    hasil_kali = angka1 * angka2;
                    System.out.println("Hasil Perkalian : " +hasil_kali);
                }
                default -> {
                    System.out.println("Pilihan menu salah");
                }
            }
            
            // Menanyakan apakah pengguna ingin menjalankan program lagi
            System.out.print("\nApakah Anda ingin ulangi lagi ? (y/n): ");
            pilihan = sc.next().charAt(0);
            
            // Membersihkan buffer scanner
            sc.nextLine();
        
        } while (Character.toLowerCase(pilihan) == 'y');
    }
}