public class Soal7 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3) {
            System.out.println("i++ : " + (i++));   // tampil dulu, baru naik
        }

        int j = 0;
        while (j < 3) {
            System.out.println("++j : " + (++j));   // naik dulu, baru tampil
        }
    }
}
