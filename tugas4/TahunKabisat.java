/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();
        
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println("Tahun " + tahun + " adalah Tahun Kabisat.");
        } else {
            System.out.println("Tahun " + tahun + " BUKAN Tahun Kabisat.");
        }
        
        input.close();
    }
}
