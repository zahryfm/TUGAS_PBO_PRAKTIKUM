import java.util.Scanner;

class PersegiPanjang {
    double panjang;
    double lebar;

    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PersegiPanjang pp = new PersegiPanjang();

        System.out.print("Masukkan panjang : ");
        pp.panjang = input.nextDouble();
        System.out.print("Masukkan lebar   : ");
        pp.lebar = input.nextDouble();

        System.out.println("Keliling persegi panjang = " + pp.hitungKeliling());
        input.close();
    }
}
