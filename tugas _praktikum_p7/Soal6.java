class Civitas {
    String nama;
    String fakultas = "Fakultas Teknik";

    Civitas(String nama) {
        this.nama = nama;
    }

    String getStatus() {
        return "Civitas Akademika";
    }

    void tampilkanData() {
        System.out.println("Nama     : " + nama);
        System.out.println("Status   : " + getStatus());
        System.out.println("Fakultas : " + fakultas);
    }
}

class Dosen extends Civitas {
    String nidn;

    Dosen(String nama, String nidn) {
        super(nama);
        this.nidn = nidn;
    }

    String getStatus() {
        return "Dosen";
    }

    void tampilkanData() {
        super.tampilkanData();
        System.out.println("NIDN     : " + nidn);
    }
}

class MahasiswaFT extends Civitas {
    String npm;

    MahasiswaFT(String nama, String npm) {
        super(nama);
        this.npm = npm;
    }

    String getStatus() {
        return "Mahasiswa";
    }

    void tampilkanData() {
        super.tampilkanData();
        System.out.println("NPM      : " + npm);
    }
}

class Staff extends Civitas {
    String bagian;

    Staff(String nama, String bagian) {
        super(nama);
        this.bagian = bagian;
    }

    String getStatus() {
        return "Staff";
    }

    void tampilkanData() {
        super.tampilkanData();
        System.out.println("Bagian   : " + bagian);
    }
}

public class Soal6 {
    public static void main(String[] args) {
        Civitas[] daftar = {
            new Dosen("Budi Santoso", "0412038801"),
            new MahasiswaFT("Siti Aminah", "2310631170001"),
            new Staff("Andi Wijaya", "Tata Usaha")
        };

        System.out.println("DATA CIVITAS AKADEMIKA FAKULTAS TEKNIK");
        System.out.println("======================================");
        for (Civitas c : daftar) {
            c.tampilkanData();
            System.out.println("--------------------------------------");
        }
    }
}
