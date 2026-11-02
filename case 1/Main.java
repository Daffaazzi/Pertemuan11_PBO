public class Main {
    public static void main(String[] args) {
        System.out.println("=== Constructor (nama, nim) ===");
        Mahasiswa m1 = new Mahasiswa("Sugomi Tanaka", "230001");
        m1.tampilBiodata();

        System.out.println("=== Constructor (nama, nim, umur) ===");
        Mahasiswa m2 = new Mahasiswa("Hyamura", "230002", 20);
        m2.tampilBiodata();

        System.out.println("=== setBiodata (nama) ===");
        m1.setBiodata("Sugomi Tanaka");
        m1.tampilBiodata();

        System.out.println("=== setBiodata (nama, nim) ===");
        m1.setBiodata("Sugomi Tanaka", "230001");
        m1.tampilBiodata();

        System.out.println("=== setBiodata (nama, nim, umur) ===");
        m1.setBiodata("Sugomi Tanaka", "230001", 20);
        m1.tampilBiodata();
    }
}