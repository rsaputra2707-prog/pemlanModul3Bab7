public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Abstract method
    public abstract double hitungHarga();

    @Override
    public String toString() {
        return "Nama Kue: " + nama + ", Harga: " + harga;
    }
}