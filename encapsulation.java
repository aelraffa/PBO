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


    public class encapsulation {
        public static void main(String[] args){
            Mhs Mahasiswa = new Mhs();
            Mahasiswa.setNamaMhs("Toni");
            Mahasiswa.setUmurMhs(19);

            System.out.println("Nama Mahasiswa: " + Mahasiswa.getNamaMhs());
            System.out.println("Umur: " + Mahasiswa.getUmurMhs());
        }
    }


}