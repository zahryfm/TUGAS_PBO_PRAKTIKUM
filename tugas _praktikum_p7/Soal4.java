class SumpahPemuda {
    SumpahPemuda() {
        System.out.println("SUMPAH PEMUDA");
        System.out.println();
        System.out.println("Kami putra dan putri Indonesia");
    }

    void sumpahPertama() {
        System.out.println("Mengaku bertumpah darah yang satu, tanah air Indonesia.");
    }

    void sumpahKedua() {
        System.out.println("Kami putra dan putri Indonesia");
        System.out.println("Mengaku berbangsa yang satu, bangsa Indonesia.");
    }

    void sumpahKetiga() {
        System.out.println("Kami putra dan putri Indonesia");
        System.out.println("Menjunjung bahasa persatuan, bahasa Indonesia.");
    }
}

public class Soal4 {
    public static void main(String[] args) {
        SumpahPemuda sp = new SumpahPemuda();
        sp.sumpahPertama();
        System.out.println();
        sp.sumpahKedua();
        System.out.println();
        sp.sumpahKetiga();
    }
}
