class Manajer extends Karyawan {
    // Variabel tambahan
    private double tunjangan;

    // Constructor menggunakan super
    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    // Method Override
    @Override
    void tampilInfo() {
        // Tampilkan info dasar, lalu tambahkan info tunjangan
        System.out.print("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok);
        System.out.println(" | Tunjangan: Rp " + tunjangan);
        System.out.println("Total Pendapatan: Rp " + (gajiPokok + tunjangan));
    }
}
