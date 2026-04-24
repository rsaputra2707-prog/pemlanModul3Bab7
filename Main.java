public class Main {
    public static void main(String[] args) {

        Kue[] daftarKue = new Kue[20];

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                daftarKue[i] = new KuePesanan("Kue Pesanan " + i, 10000, i + 1);
            } else {
                daftarKue[i] = new KueJadi("Kue Jadi " + i, 5000, i + 2);
            }
        }

        double totalHargaSemua = 0;

        double totalHargaPesanan = 0;
        double totalBerat = 0;

        double totalHargaJadi = 0;
        double totalJumlah = 0;

        Kue kueTermahal = daftarKue[0];

        System.out.println("=== DAFTAR KUE ===");

        for (Kue k : daftarKue) {
            System.out.println(k);

            double hargaAkhir = k.hitungHarga();
            totalHargaSemua += hargaAkhir;

            if (k instanceof KuePesanan) {
                KuePesanan kp = (KuePesanan) k;
                totalHargaPesanan += hargaAkhir;
                totalBerat += kp.getBerat();

            } else if (k instanceof KueJadi) {
                KueJadi kj = (KueJadi) k;
                totalHargaJadi += hargaAkhir;
                totalJumlah += kj.getJumlah();
            }

            if (hargaAkhir > kueTermahal.hitungHarga()) {
                kueTermahal = k;
            }
        }

        System.out.println("\n=== HASIL ===");
        System.out.println("Total Harga Semua Kue: " + totalHargaSemua);

        System.out.println("\nKuePesanan:");
        System.out.println("Total Harga: " + totalHargaPesanan);
        System.out.println("Total Berat: " + totalBerat);

        System.out.println("\nKueJadi:");
        System.out.println("Total Harga: " + totalHargaJadi);
        System.out.println("Total Jumlah: " + totalJumlah);

        System.out.println("\nKue Termahal:");
        System.out.println(kueTermahal);
    }
}
