package main;

class PersegiPanjang{
    int panjang = 50;
    int lebar = 45;
   
    
    void hitungluas(){
    int luas = panjang * lebar;
        System.out.println("luas : " + luas);
    }         
}

class PersamaanKuadrat{
    int a =2;
    int b =10;
    int c =5;
    
    void hitung(){
        int hasil = (b*b)-(4*a*c);
        System.out.println("Persamaan Kuadrat : " + hasil);
    }
}

class OprasiMatematika{
    double x =22;
    double y =33;
    double hasil;
    
    void penjumlahan(){
        hasil = x+y;
        System.out.println("Penjumlahan : " + hasil);
    }

    void pengurangan(){
        hasil = x-y;
        System.out.println("Pengurangan : " + hasil);
    }

    void perkalian(){
        hasil = x*y;
        System.out.println("Perkalian : " + hasil);
    }

    void pembagian(){
        hasil = x/y;
        System.out.println("Penjumlahan : " + hasil);
    }

} 

class Segitiga{
    double alas = 8;
    double tinggi = 6;
    double sisi ;
    
    void hitungluas(){
       double hasil = 0.5* alas *tinggi;
        System.out.println("hitung luas : "+ hasil);
    }


void hitungsisikeliling(){
    sisi = (alas * alas) + (tinggi * tinggi);
    int akar =0;
    while (akar* akar < sisi){
        ++akar;
    }
    System.out.println("Sisis Kemiringan : "+ akar);
    double keliling = alas + tinggi + akar;
    System.out.println("Keliling : " +keliling);
    }
}

class KonversiSuhu{
    double c =10;
    double f = 15;
    double r = 5;
    
    void celciuskefarenheit(){
        //C ke F
      double ckf = (c*1.8) + 32;
        System.out.println("10 Celcius ke Farenheit : " + ckf);
        //F ke C
      double fkc = (f-32) / 1.8;
        System.out.println("15 Farenheit ke Celsius : " + fkc);
    }
    
    void celciuskereamur(){
        //C ke R
      double ckr = c*0.8;
        System.out.println("10 Celcius ke Reamur : " + ckr);
      // R ke C
      double rkc = 1.25*r;
        System.out.println("5 Reamur ke Celcius : " + rkc);
              
    }
    void farenheitkereamur(){
        //F ke R
      double fkr = 4*(f-32)/9;
        System.out.println("15 Farenheit ke Reamur : " + fkr);
        // R Ke F
      double rfk = (r * 2.25)+32;
        System.out.println("5 Reamur ke Farenheit: " + rfk);
            
    }
}

class Main {
    public static void main(String[] args) {
        
        int i =1;
        System.out.println("----------No 1 -----------");
        System.out.println("increment : "+ ++i);
        System.out.println("increment : "+ i++);
        
        System.out.println("----------No 2 -----------");
        PersegiPanjang luas =new PersegiPanjang();
        luas.hitungluas();
        
        System.out.println("----------No 3 -----------");
        PersamaanKuadrat hasil = new PersamaanKuadrat();
        hasil.hitung();
        
        System.out.println("----------No 4 -----------");
        OprasiMatematika hasilnya = new OprasiMatematika();
        hasilnya.penjumlahan();
        hasilnya.pengurangan();
        hasilnya.perkalian();
        hasilnya.pembagian();
        
        System.out.println("----------No 5 -----------");
        Segitiga hitung = new Segitiga();
        hitung.hitungluas();
        
        System.out.println("----------No 6 -----------");
        hitung.hitungsisikeliling();
        
        System.out.println("----------No 7 -----------");
        String a = "Saya Belajar Java";//menjadi "saya belajar Java" (lower)
        String b = "Saya Belajar Java";//menjadi "SAYA BELAJAR JAVA" (upper)
        
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        
         System.out.println("----------No 8 -----------");
         double jarakbulan =384400;
         double jarakmatahari = 152100000;
         double kecepatancahaya = 300000;
         
         double waktubulan = jarakbulan / kecepatancahaya; 
         double waktumatahari = jarakmatahari / kecepatancahaya;
         
         System.out.println("Jarak waktu bumi ke bulan : " + waktubulan + "detik");
         System.out.println("Jarak waktu bumi ke matahari : " + waktumatahari + "detik");
         
          System.out.println("----------No 9 -----------");
          KonversiSuhu suhu = new KonversiSuhu();
          suhu.celciuskefarenheit();
          suhu.celciuskereamur();
          suhu.farenheitkereamur();
    }
}