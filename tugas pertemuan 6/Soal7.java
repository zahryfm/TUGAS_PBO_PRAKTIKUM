
class MyThread extends Thread {
    @Override
    public void run() {
        // run() adalah titik masuk (entry point) thread baru
        System.out.println("Thread baru berjalan: " + Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hitungan ke-" + i + " dari " + getName());
        }
    }
}

public class Soal7 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // memulai eksekusi thread (memanggil run())
        System.out.println("Thread utama selesai: " + Thread.currentThread().getName());
    }
}
