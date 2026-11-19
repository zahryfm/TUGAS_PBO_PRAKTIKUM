import java.util.Scanner;


class ThreadAnak extends Thread {
    private final int jumlahThread;

    ThreadAnak(int jumlahThread) {
        super("Thread-Anak");
        this.jumlahThread = jumlahThread;
    }

    @Override
    public void run() {
        System.out.println("[" + getName() + "] dimulai, akan membuat " + jumlahThread + " thread.");

        Thread[] daftar = new Thread[jumlahThread];
        for (int i = 0; i < jumlahThread; i++) {
            final int nomor = i + 1;
            daftar[i] = new Thread(() -> {
                System.out.println("   -> Thread ke-" + nomor + " berjalan ("
                        + Thread.currentThread().getName() + ")");
            }, "Thread-" + nomor);
            daftar[i].start();
        }

        // tunggu semua thread selesai
        for (Thread t : daftar) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("[" + getName() + "] selesai.");
    }
}

public class Soal8 {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("[" + Thread.currentThread().getName() + "] thread utama dimulai.");

        System.out.print("Masukkan jumlah thread yang diinginkan: ");
        int n = input.nextInt();

        ThreadAnak anak = new ThreadAnak(n);
        anak.start();
        anak.join(); // thread utama menunggu thread anak selesai

        System.out.println("[" + Thread.currentThread().getName() + "] thread utama selesai.");
        input.close();
    }
}
