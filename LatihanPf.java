class Kasir {
    private String namabarang;
    private int jumlahbarang;
    private int hargabarang;
    private int pembayaran;
    private int total;

    public Kasir(String namabarang, int jumlahbarang, int hargabarang, int pembayaran, int total) {
        this.namabarang = namabarang;
        this.jumlahbarang = jumlahbarang;
        this.hargabarang = hargabarang;
        this.pembayaran = pembayaran;
        this.total = total;
    }

    public void tampilkanNota() {
        System.out.println("Nama Barang: " + namabarang);
        System.out.println("Harga Barang: " + jumlahbarang);
        System.out.println("Jumlah Barang: " + hargabarang);
        System.out.println("Pembayaran: " + pembayaran);
        System.out.println("Kembalian: " + total);
    }
}

public class LatihanPf {
    public static void main(String[] args) {
        Kasir kasir1 = new Kasir("Buku", 12, 5000, 100000, 60000);
        kasir1.tampilkanNota();

    }
}




