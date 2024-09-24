/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab18soal1;

/**
 *
 * @author PC RPL - R1
 */
public class Bab18soal1 {

    // Contoh menggunakan try-catch untuk menangkap dan menangani exception
    public static void exampleTryCatch() {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Angka ke-4: " + numbers[3]); // Akan menyebabkan ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception tertangkap: " + e.getMessage());
        }
        System.out.println("Program terus berjalan setelah menangkap exception di blok try-catch.");
    }

    // Contoh menggunakan throw untuk melempar exception
    public static void exampleThrow() throws ArithmeticException {
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol!"); // Melempar exception
        }
        int result = a / b;
        System.out.println("Hasil pembagian: " + result);
    }

    public static void main(String[] args) {
        System.out.println("Contoh 1: Try-Catch (Menangkap Exception)");
        exampleTryCatch();
        
        System.out.println("\nContoh 2: Throw (Melempar Exception)");
        try {
            exampleThrow();
        } catch (ArithmeticException e) {
            System.out.println("Exception tertangkap: " + e.getMessage());
        }
    }
}