
public class Soal2 {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        int indeksDiubah = -1;
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                mobil[i] = "Toyota"; // nilai baru
                indeksDiubah = i;
                break;
            }
        }

        System.out.println("Indeks yang diubah : " + indeksDiubah);
        System.out.println("Isi array sekarang :");
        for (int i = 0; i < mobil.length; i++) {
            System.out.println("mobil[" + i + "] = " + mobil[i]);
        }
    }
}
