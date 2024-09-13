/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab10soal1;

/**
 *
 * @author hp
 */
public class Bab10soal1 {

    public static void main(String[] args) {
        // Membuat objek Aritmatika dan memanggil metode di dalamnya
        Aritmatika aritmatika = new Aritmatika();

        System.out.println("Penjumlahan: " + aritmatika.penjumlahan(5, 3)); // Output: 8
        System.out.println("Pengurangan: " + aritmatika.pengurangan(5, 3)); // Output: 2
        System.out.println("Perkalian: " + aritmatika.perkalian(5, 3)); // Output: 15
        System.out.println("Pembagian: " + aritmatika.pembagian(6, 3)); // Output: 2
        System.out.println("Pangkat: " + aritmatika.pangkat(2, 3)); // Output: 8
    }
}

class Aritmatika {

    // Metode penjumlahan
    public int penjumlahan(int a, int b) {
        return a + b;
    }

    // Metode pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Metode perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Metode pembagian
    public int pembagian(int a, int b) {
        // Memastikan b tidak 0 untuk menghindari ArithmeticException
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diizinkan");
        }
        return a / b;
    }

    // Metode pangkat
    public int pangkat(int a, int b) {
        int hasil = 1;
        for (int i = 0; i < b; i++) {
            hasil *= a;
        }
        return hasil;
    }
}