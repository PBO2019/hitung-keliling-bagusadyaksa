public class Main {
    public static void main(String[] args){
        System.out.println("Menghitung Keliling Bujur Sangkar dan Lingkaran");

        BujurSangkar KBS = new BujurSangkar();
        Lingkaran ling = new Lingkaran();

        KBS.setSisi(6);
        KBS.BujurSangkar();
        System.out.println("Bujur Sangkar = "+ KBS.getKeliling());
        ling.setRadius(190);
        ling.HitungKelilingLingkaran();
        System.out.println("Luas Lingkaran = "+ling.getKeliling());



    }
}
