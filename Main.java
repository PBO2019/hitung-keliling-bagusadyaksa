package sample;

public class Main{

    public static void main(String[] args){
        System.out.println("Menghitung Keliling Bujur Sangkar dan Lingkaran");
        BujurSangkar KBS = new BujurSangkar();
        Lingkaran ling = new Lingkaran();
        KBS.BujurSangkar(8);
        ling.HitungKelilingLingkaran(2);

    }
}

class BujurSangkar {
    private int Keliling;

    public void BujurSangkar(int sisi){
        Keliling = 4*sisi;
        System.out.println("Hitung Keliling Bujur Sangkar = "+sisi+" Adalah "+ Keliling);

    }
}

class Lingkaran {
    private double phi = 3.15;
    double Keliling;

    public void HitungKelilingLingkaran(int jari){
        Keliling = 2*phi*jari;
        System.out.println("Hitung Keliling Lingkaran = "+ jari+" Adalah "+Keliling);
    }
}