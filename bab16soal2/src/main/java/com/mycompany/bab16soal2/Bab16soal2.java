/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab16soal2;

/**
 *
 * @author PC RPL - R1
 */
public class Bab16soal2 {

   // Base class
   class ArithmeticOperation {
       protected double a;
       protected double b;

       public ArithmeticOperation(double a, double b) {
           this.a = a;
           this.b = b;
       }

       protected double calculate() {
           return 0; // Method ini akan di-override oleh subclass
       }
   }

   // Derived class untuk penjumlahan
   class Addition extends ArithmeticOperation {

       public Addition(double a, double b) {
           super(a, b);
       }

       @Override
       protected double calculate() {
           return a + b;
       }
   }

   // Derived class untuk pengurangan
   class Subtraction extends ArithmeticOperation {

       public Subtraction(double a, double b) {
           super(a, b);
       }

       @Override
       protected double calculate() {
           return a - b;
       }
   }

   // Derived class untuk perkalian
   class Multiplication extends ArithmeticOperation {

       public Multiplication(double a, double b) {
           super(a, b);
       }

       @Override
       protected double calculate() {
           return a * b;
       }
   }

   // Derived class untuk pembagian
   class Division extends ArithmeticOperation {

       public Division(double a, double b) {
           super(a, b);
       }

       @Override
       protected double calculate() {
           if (b == 0) {
               throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
           }
           return a / b;
       }
   }

   // Class utama untuk menjalankan program
   public static void main(String[] args) {
       Bab16soal2 program = new Bab16soal2();
       
       double A = 9.5;
       double B = 2.5;

       ArithmeticOperation addition = program.new Addition(A, B);
       ArithmeticOperation subtraction = program.new Subtraction(A, B);
       ArithmeticOperation multiplication = program.new Multiplication(A, B);
       ArithmeticOperation division = program.new Division(A, B);

       System.out.println("Penjumlahan: " + addition.calculate());
       System.out.println("Pengurangan: " + subtraction.calculate());
       System.out.println("Perkalian: " + multiplication.calculate());
       System.out.println("Pembagian: " + division.calculate());
   }
}