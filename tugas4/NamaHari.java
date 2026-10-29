/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4;

import java.util.Scanner;

public class NamaHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kode hari (1-7): ");
        int kodeHari = input.nextInt();
        
        switch (kodeHari) {
            case 1:
                System.out.println("Hari ke-" + kodeHari + " adalah Senin");
                break;
            case 2:
                System.out.println("Hari ke-" + kodeHari + " adalah Selasa");
                break;
            case 3:
                System.out.println("Hari ke-" + kodeHari + " adalah Rabu");
                break;
            case 4:
                System.out.println("Hari ke-" + kodeHari + " adalah Kamis");
                break;
            case 5:
                System.out.println("Hari ke-" + kodeHari + " adalah Jumat");
                break;
            case 6:
                System.out.println("Hari ke-" + kodeHari + " adalah Sabtu");
                break;
            case 7:
                System.out.println("Hari ke-" + kodeHari + " adalah Minggu");
                break;
            default:
                System.out.println("Kode hari tidak valid! Masukkan angka 1 sampai 7.");
        }
        
        input.close();
    }
}