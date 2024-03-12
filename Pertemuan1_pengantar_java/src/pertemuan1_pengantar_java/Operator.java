/* PROGRAM Operator
    Operator dalam bahasa pemrograman Java adalah simbol atau tanda yang digunakan untuk melakukan operasi tertentu pada operand.
        Operand adalah nilai atau variabel yang terlibat dalam operasi.
        Java mendukung berbagai jenis operator yang dapat digunakan untuk melakukan operasi aritmatika, perbandingan, logika, bitwise, dan lainnya.

    Berikut adalah beberapa jenis operator yang umum digunakan dalam Java:
        1. Operator Aritmatika = tambah, kurang, kali, bagi, modulus
        2. Operator Perbandingan = sama dengan, tidak sama dengan, lebih dari, kurang dari.
        3. Operator Logika = And, Or, Not
        4. Operator Increment dan Decrement
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1_pengantar_java;

// main class
public class Operator {
       
    // main method
    public static void main(String[]args){
        
        // Pertambahan
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Nilai c = " +c);

        System.out.println("------------------------------");
        // Pengurangan
        int n1 = 10;
        int n2 = 2;
        int n3 = n1 - n2;
        System.out.println("Nilai n3 = " +n3);

        System.out.println("------------------------------");
        // Perkalian
        int n4 = 10;
        int n5 = 15;
        int n6 = n4 * n5;
        System.out.println("Nilai n6 = " +n6);

        System.out.println("------------------------------");
        // Perkalian
        int n7 = 100;
        int n8 = 20;
        int n9 = n7 / n8;
        System.out.println("Nilai n9 = " +n9);
    }
}
