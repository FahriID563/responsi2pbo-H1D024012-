class UjiBarang {
    public static void main(String[] args) {
        // Buat objek barang pertama gitar (Cara 1: Kode & Nama saja)
        BarangMusik gitar = new BarangMusik("GTR-001", "Gitar Akustik Yamaha");

        // Atur harga gitar & Tambah stok gitar
        gitar.ubahHarga(1500000);
        gitar.tambahStok(5);

        // Buat objek drum (Cara 3: Lengkap)
        BarangMusik drum = new BarangMusik("DRM-001", "Drum Set Pearl", 8500000, 3);

        // Tampilkan informasi kedua barang
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        gitar.tampilInfo();
        drum.tampilInfo();
    }
}
