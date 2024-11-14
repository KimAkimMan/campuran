public class Main{
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new MahasiswaReguler("Dede", "12345678", 3.5, 2000000.0);
        Mahasiswa mahasiswa2 = new MahasiswaBeasiswa("Husen", "12345679", 3.8, 2000000.0, 100000000.0);
        Universitas universitas = new Universitas(mahasiswa1, mahasiswa2);
        universitas.tampilkanSemuaMahasiswa();
}
}