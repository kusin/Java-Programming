/* PROGRAM Konversi Suhu
    Buatlah program ini akan mengkonversi suhu dari Celcius menjadi Reamur, Fahrenheit, Kelvin.
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2_konstruksi_algoritma;

// deklarasi library
import java.util.Scanner;

// main class
public class KonversiSuhu {
    
    // main method
    public static void main(String[]args){
        
        // deklarasi object scanner
        Scanner sc = new Scanner(System.in);
        
        // deklarasi variabel
        double celcius, reamur, fahrenheit, kelvin;
        
        // masukan program
        System.out.println("================================================================");
        System.out.println("PROGRAM konversi suhu dari celcius ke reamur, fahrenheit, kelvin");
        System.out.println("================================================================");
        System.out.print("Masukan suhu celcius : ");
        celcius = sc.nextDouble();
        
        // proses program
        reamur = celcius * 0.8;
        fahrenheit = (celcius * 1.8) + 32;
        kelvin = celcius + 273.15;
       
        // keluaran program
        System.out.println("\nOutput Program");
        System.out.println("Suhu Reamur " +reamur);
        System.out.println("Suhu Fahrenheit " +fahrenheit);
        System.out.println("Suhu Kelvin " +kelvin);
    }
}
