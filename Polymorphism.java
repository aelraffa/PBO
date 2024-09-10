class Mhs {
    private String NamaMhs;
    private int UmurMhs;

    public String getNamaMhs(){
        return NamaMhs;
    }

    public void setNamaMhs(String NamaMhs){
        this.NamaMhs = NamaMhs;
    }

    public int getUmurMhs(){
        return UmurMhs;
    }

    public void setUmurMhs(int UmurMhs){
        this.UmurMhs = UmurMhs;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Mahasiswa: " + NamaMhs);
        System.out.println("Umur: " + UmurMhs);
    }
}

class MhsJurusan extends Mhs {
    private String jurusan;

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();  
        System.out.println("Jurusan: " + jurusan);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
       
        MhsJurusan mahasiswa1 = new MhsJurusan();
        mahasiswa1.setNamaMhs("Toni");
        mahasiswa1.setUmurMhs(19);
        mahasiswa1.setJurusan("Teknik Informatika");

        MhsJurusan mahasiswa2 = new MhsJurusan();
        mahasiswa2.setNamaMhs("Budi");
        mahasiswa2.setUmurMhs(21);
        mahasiswa2.setJurusan("Teknik Elektro");

        mahasiswa1.tampilkanInfo();
        System.out.println("\n");
        mahasiswa2.tampilkanInfo();
    }
}
