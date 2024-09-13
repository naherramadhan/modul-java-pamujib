/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab9soal1;

/**
 *
 * @author HP
 */
public class Bab9soal1 {

    public static void main(String[] args) {
        
        int i = 1; // Inisialisasi variabel untuk loop luar
        
        while (i <= 5) { // Loop luar untuk jumlah baris
            int j = 1; // Inisialisasi variabel untuk loop dalam
            
            while (j <= i) { // Loop dalam untuk jumlah bintang di setiap baris
                System.out.print("* ");
                j++;
            }
            
            System.out.println(); // Pindah ke baris baru setelah mencetak semua bintang di baris saat ini
            i++;
        }
    }
}