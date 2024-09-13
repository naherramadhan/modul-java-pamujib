/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.burungmain;

/**
 *
 * @author halimah
 */

    // Abstract class Hewan
abstract class Hewan {
    // Method abstract suara
    public abstract void suara();
}

// Child class Burung yang meng-extend dari Hewan
class Burung extends Hewan {
    // Implementasi dari method abstract suara
    @Override
    public void suara() {
        System.out.println("Suara Burung mencicit");
    }
}

// Main class untuk menjalankan program
public class Burungmain {
    public static void main(String[] args) {
        // Membuat objek dari kelas Burung
        Hewan burung = new Burung();
        // Memanggil method abstract suara()
        burung.suara();
    }
}