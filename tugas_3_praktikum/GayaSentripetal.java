package tugas_3_praktikum;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GayaSentripetal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan massa benda (m): ");
        double m = Double.parseDouble(br.readLine());

        System.out.print("Masukkan kecepatan (v): ");
        double v = Double.parseDouble(br.readLine());

        System.out.print("Masukkan jari-jari (r): ");
        double r = Double.parseDouble(br.readLine());

        double fc = (m * (v * v)) / r;

        System.out.println("\n--- HASIL PERHITUNGAN ---");
        System.out.println("Gaya Sentripetal (Fc) = " + fc);
    }
}
