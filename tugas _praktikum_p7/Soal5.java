import java.util.Scanner;

class Rekursif {
    long faktorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * faktorial(n - 1);
    }
}

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rekursif r = new Rekursif();

        System.out.print("Masukkan bilangan : ");
        int n = input.nextInt();

        System.out.println(n + "! = " + r.faktorial(n));
        input.close();
    }
}
