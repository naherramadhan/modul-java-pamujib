/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8soal2;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Bab8soal2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Meminta input nilai awal dan nilai akhir
        System.out.print("Tahun Akhir ?: ");
        int tahunAkhir = scanner.nextInt();

        System.out.print("Tahun Awal ?: ");
        int tahunAwal = scanner.nextInt();

        // Pengulangan for untuk menampilkan tahun dari tahun akhir ke tahun awal
        for (int i = tahunAkhir; i >= tahunAwal; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}