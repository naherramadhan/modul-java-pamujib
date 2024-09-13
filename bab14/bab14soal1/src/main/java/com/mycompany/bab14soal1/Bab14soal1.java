/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab14soal1;

/**
 *
 * @author halimah
 */
public class Bab14soal1 {

       public static void main(String[] args) {
       // Abstract class
       abstract class AbstrakHewan {
           // Method abstract
           public abstract void suara();

           // Method non-abstract
           public void suara2() 
           {
               System.out.println("Ini method konkrit dari parent class");
           }
       }

       // Subclass Kucing yang mengimplementasikan class AbstrakHewan
       class Kucing extends AbstrakHewan {
           @Override
           public void suara() 
           {
               System.out.println("Kucing bersuara: Meow");
           }
       }

       // Subclass Anjing yang mengimplementasikan class AbstrakHewan
       class Anjing extends AbstrakHewan {
           @Override
           public void suara() 
           {
               System.out.println("Anjing bersuara: Guk Guk");
           }
       }

       // Main class untuk menjalankan program

               // Membuat objek Kucing
               AbstrakHewan kucing = new Kucing();
               kucing.suara(); // Panggil method abstract yang diimplementasikan
               kucing.suara2(); // Panggil method konkrit dari parent class

               // Membuat objek Anjing
               AbstrakHewan anjing = new Anjing();
               anjing.suara(); // Panggil method abstract yang diimplementasikan
               anjing.suara2(); // Panggil method konkrit dari parent class
       }
}