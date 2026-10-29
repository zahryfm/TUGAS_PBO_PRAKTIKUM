/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

import java.util.Scanner;

public class GenapGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();
        
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah bilangan GENAP.");
        } else {
            System.out.println("Bilangan " + bilangan + " adalah bilangan GANJIL.");
        }
        
        input.close();
    }
}
