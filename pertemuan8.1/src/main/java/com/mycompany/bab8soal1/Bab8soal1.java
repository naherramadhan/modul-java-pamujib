/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8soal1;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Bab8soal1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Meminta input nilai awal dan nilai akhir
        System.out.print("Nilai Awal ?: ");
        int nilaiAwal = scanner.nextInt();

        System.out.print("Nilai Akhir ?: ");
        int nilaiAkhir = scanner.nextInt();

        // Pengulangan for untuk menampilkan bilangan dengan pertambahan 5
        int nomor = 1;  // Inisialisasi nomor urut
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(nomor + ". " + i);
            nomor++;  // Increment nomor urut
        }

        scanner.close();
    }
}