/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2_konstruksi_algoritma;

// deklarasi library
import java.io.IOException;
import java.util.Scanner;

// main class
public class HitungNilai_Perulangan {
    
    // main method
    public static void main(String[]args){
        
        // deklarasi object scanner
        Scanner sc = new Scanner(System.in);
        
        // deklarsi object
        String nama;
        double formatif, uts, uas, nilai_akhir;
        char huruf_mutu;
        char pilihan;
        
        do{
            
            // menghapus layar, apabila pengguna masih ingin menggunakan program ini.
            clearConsole();
                    
            // masukan program
            System.out.println("\nPROGRAM Hitung Nilai");
            System.out.println("====================");
            System.out.print("Masukan nama mahasiswa : ");
            nama = sc.nextLine();
            System.out.print("Nilai Formatif : ");
            formatif = sc.nextDouble();
            System.out.print("Nilai UTS : ");
            uts = sc.nextDouble();
            System.out.print("Nilai UAS : ");
            uas = sc.nextDouble();

            // menentukan nilai akhir
            nilai_akhir = (formatif * 0.4) + (uts * 0.3) + (uas * 0.3);

            // menentukan huruf mutu
            if(nilai_akhir >= 80){
                huruf_mutu = 'A';
            }
            else if(nilai_akhir >= 70){
                huruf_mutu = 'B';
            }
            else if(nilai_akhir >= 60){
                huruf_mutu = 'C';
            }
            else if(nilai_akhir >= 50){
                huruf_mutu = 'D';
            }
            else{
                huruf_mutu = 'E';
            }

            // output program
            System.out.println("\nOutput Program");
            System.out.println("==============");
            System.out.println("Nama mahasiswa " +nama);
            System.out.println("Nilai akhir " +nilai_akhir);
            System.out.println("Huruf mutu " +huruf_mutu);
            
            // Menanyakan apakah pengguna ingin menjalankan program lagi
            System.out.print("\nApakah Anda ingin mengkonversi suhu lagi? (y/n): ");
            pilihan = sc.next().charAt(0);
            
            // Membersihkan buffer scanner
            sc.nextLine();
            
        } while (Character.toLowerCase(pilihan) == 'y');
            
    } // end main method  
    
    // method untuk menghpaus layar
    private static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                // Clear screen for Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Clear screen for Unix/Linux/Mac
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch(IOException | InterruptedException e) {
            // Handle exceptions
            System.out.println(e);
        }
    } // end clearConsole
    
} // end main class