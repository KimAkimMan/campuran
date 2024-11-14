
class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;

    public Mahasiswa(String nama, String nim, Double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public double getIpk() {
        return ipk;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setIpk(double ipk){
        this.ipk = ipk;
    }
    public void tampilkanInfo() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nim: " + nim );
        System.out.println("IPK: " + ipk);
    }
}
    class MahasiswaReguler extends Mahasiswa {
        private double Biayakuliah;
        public MahasiswaReguler(String nama, String nim, double ipk,double Biayakuliah) {
            super(nama, nim, ipk);
            this.Biayakuliah = Biayakuliah;
        }
        public void tampilkanInfo() {
            super.tampilkanInfo();
            System.out.println("biaya kuliah :"+Biayakuliah);
        }
    }
    class MahasiswaBeasiswa extends Mahasiswa{
        private double jumlahBeasiswa;
        public MahasiswaBeasiswa(String nama, String nim, double ipk,double biayakuliah,double jumlahBeasiswa) {
            super(nama, nim, ipk);
            this.jumlahBeasiswa = jumlahBeasiswa;
        }
        public void tampilkanInfo() {
            super.tampilkanInfo();
            System.out.println("jumlah beasiswa :"+jumlahBeasiswa);
        }
    }
    class Universitas{
        private Mahasiswa mahasiswa1;
        private Mahasiswa mahasiswa2;

        public Universitas(Mahasiswa mahasiswa1, Mahasiswa mahasiswa2) {
            this.mahasiswa1 = mahasiswa1;
            this.mahasiswa2 = mahasiswa2;
        }
        public void tampilkanSemuaMahasiswa() {
            mahasiswa1.tampilkanInfo();
            System.out.println("--------------------------------");
            mahasiswa2.tampilkanInfo();
        }
    }


