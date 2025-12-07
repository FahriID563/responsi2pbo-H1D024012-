class UjiPengguna {
    public static void main(String[] args) {
        Pengguna p = new Pengguna("User1", 25, 60, 170);
        p.tampilInfo();

        System.out.println("\n--- Demonstrasi Konstanta Final ---");
        System.out.println("Nilai faktor aktivitas: " + p.FAKTOR_AKTIVITAS);
        System.out.println("Faktor aktivitas bersifat final (konstan)");
        System.out.println("Artinya nilai ini tidak bisa diubah setelah diinisialisasi");
    }
}
