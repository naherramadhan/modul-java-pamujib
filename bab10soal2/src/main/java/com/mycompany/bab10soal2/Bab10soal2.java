/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab10soal2;

/**
 *
 * @author hp
 */
public class Bab10soal2 {

     // Class Aritmatika yang berisi method untuk operasi aritmatika
    static class Aritmatika {
        private double bilangan1;
        private double bilangan2;

        // Constructor
        public Aritmatika(double bilangan1, double bilangan2) {
            this.bilangan1 = bilangan1;
            this.bilangan2 = bilangan2;
        }

        // Method untuk pengurangan
        public double pengurangan() {
            return bilangan1 - bilangan2;
        }

        // Method untuk perkalian
        public double perkalian() {
            return bilangan1 * bilangan2;
        }

        // Method untuk pembagian
        public double pembagian() {
            return bilangan1 / bilangan2;
        }

        // Method untuk pangkat
        public double pangkat() {
            return Math.pow(bilangan1, bilangan2);
        }
    }

    // Class utama untuk membuat objek dan mengakses method pada class Aritmatika
    public static void main(String[] args) {
        // Membuat objek Aritmatika dengan nilai bilangan1 dan bilangan2
        Aritmatika aritmatika = new Aritmatika(8, 2);

        // Mengakses method pengurangan
        System.out.println("Pengurangan: " + aritmatika.pengurangan());

        // Mengakses method perkalian
        System.out.println("Perkalian: " + aritmatika.perkalian());

        // Mengakses method pembagian
        System.out.println("Pembagian: " + aritmatika.pembagian());

        // Mengakses method pangkat
        System.out.println("Pangkat: " + aritmatika.pangkat());
    }
}