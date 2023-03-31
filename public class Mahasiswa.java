public class Mahasiswa {
    String nim,nama,alamat,kontak;
    public class Mahasiswa(String nim, String nama, String alamat, Int kontak){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.kontak = kontak;
    }
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public Int getNama() {
        return kontak;
    }
    public static void main(String[] args) 
    {
        Mahasiswa mhs1 = new Mahasiswa("41821120030","agil putra","depok jawa barat","089510027002");
        System.out.println("NIM  : "+mhs1.getNim() ) ;
        System.out.println("Nama  : "+mhs1.getNama() ) ;
        System.out.println("Alamat : "+mhs1.getAlamat() ) ;
        System.out.println("Kontak : "+mhs1.getKontak() ) ;
    }
    {
        Mahasiswa mhs2 = new Mahasiswa("41821120021","Nabillah ","Limo depok jawa barat","0823232323");
        System.out.println("NIM  : "+mhs2.getNim() ) ;
        System.out.println("Nama  : "+mhs2.getNama() ) ;
        System.out.println("Alamat : "+mhs2.getAlamat() ) ;
        System.out.println("Kontak : "+mhs2.getKontak() ) ;
    }
}