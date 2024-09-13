/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab7soal2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Bab7soal2 {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.print("NIM : ");
        String nim = scanner.nextLine();
        
        System.out.print("NAMA : ");
        String nama = scanner.nextLine();
        
        System.out.print("TAHUN : ");
        int tahun = scanner.nextInt();
        scanner.nextLine();  // Konsumsi newline
        
        System.out.print("PILIH PEMINATAN (M/T/P) : ");
        char peminatan = scanner.nextLine().charAt(0);
        
        // Proses berdasarkan tahun dan peminatan
        switch (tahun) {
            case 3:
                switch (peminatan) {
                    case 'M':
                        System.out.println("Mahasiswa " + nama + " dengan NIM " + nim + " memilih peminatan Manajemen.");
                        break;
                    case 'T':
                        System.out.println("Mahasiswa " + nama + " dengan NIM " + nim + " memilih peminatan Teknik.");
                        break;
                    case 'P':
                        System.out.println("Mahasiswa " + nama + " dengan NIM " + nim + " memilih peminatan Pendidikan.");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid untuk tahun ke-3.");
                        break;
                }
                break;
            default:
                System.out.println("PEMOGRAMAN MOBILE, PEMOGRAMAN JAVA 2");
                break;
        }
        
        scanner.close();
    }
}