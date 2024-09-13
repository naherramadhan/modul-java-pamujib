/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab13soal1;

/**
 *
 * @author halimah
 */
public class Bab13soal1 {

    // Kelas CalculatorSederhana sebagai kelas bersarang statis
    static class CalculatorSederhana {
        // Metode untuk penambahan dengan dua parameter
        int tambah(int a, int b) {
            return a + b;
        }

        // Metode untuk penambahan dengan tiga parameter
        int tambah(int a, int b, int c) {
            return a + b + c;
        }

        // Metode untuk pengurangan dengan dua parameter
        int pengurangan(int a, int b) {
            return a - b;
        }

        // Metode untuk perkalian dengan dua parameter
        int perkalian(int a, int b) {
            return a * b;
        }
        
        // Metode untuk pembagian dengan dua parameter
        double pembagian(int a, int b) {
            if (b != 0) {
                return (double) a / b;
            } else {
                System.out.println("Pembagian dengan nol tidak diperbolehkan.");
                return 0;
            }
        }
    }
    
    // Kelas utama yang menjalankan aplikasi
    public static void main(String[] args) {
        // Membuat objek CalculatorSederhana
        CalculatorSederhana objek = new CalculatorSederhana();

        // Menampilkan hasil operasi
        System.out.println("Hasil Pertambahan : " + objek.tambah(10, 20));
        System.out.println("Hasil Pertambahan (3 angka) : " + objek.tambah(10, 20, 30));
        System.out.println("Hasil Pengurangan : " + objek.pengurangan(20, 10));
        System.out.println("Hasil Perkalian : " + objek.perkalian(20, 10));
        System.out.println("Hasil Pembagian : " + objek.pembagian(20, 10));
    }
}