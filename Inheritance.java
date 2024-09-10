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
}

class MhsJurusan extends Mhs {
    private String jurusan;

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}

public class Inheritance {
    public static void main(String[] args) {
       
        MhsJurusan mahasiswa = new MhsJurusan();
        mahasiswa.setNamaMhs("Toni");
        mahasiswa.setUmurMhs(19);
        mahasiswa.setJurusan("Teknik Informatika");

        System.out.println("Nama Mahasiswa: " + mahasiswa.getNamaMhs());
        System.out.println("Umur: " + mahasiswa.getUmurMhs());
        System.out.println("Jurusan: " + mahasiswa.getJurusan());
    }
}
