public class UjiCustomer {
    public static void main(String[] args) {
        // Buat object Customer
        Customer c = new Customer("Budi Santoso", "CST-001", 500000);

        // Buat object Member
        Member m = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        // Tampilkan judul
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        // Info Customer Biasa
        System.out.println("Status: Customer Biasa");
        c.tampilkanInfo();
        System.out.println();

        // Info Member
        System.out.println("Status: Member");
        m.tampilkanInfo();
    }
}
