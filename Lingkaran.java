public class Lingkaran {
    private double phi = 3.14;
    private double Keliling;
    private int radius;

    public void HitungKelilingLingkaran() {
        this.Keliling = 2 * phi*radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getKeliling(){
        return Keliling;
    }

}
