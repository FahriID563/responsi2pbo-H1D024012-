class Karyawan {
    // Variabel dasar
    protected String nama;
    protected double gajiPokok;

    // Constructor
    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Method tampil info
    void tampilInfo() {
        System.out.print("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok);
    }
}
