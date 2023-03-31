public class Dosen {
    String nid,nama,alamat,kontak,latarpendidikan;
    public class Mahasiswa(String nid, String nama, String alamat, Int kontak,string latarpendidikan){
        this.nid = nid;
        this.nama = nama;
        this.alamat = alamat;
        this.kontak = kontak;
        this.latarpendidikan = latarpendidikan;
    }
    public String getNid() {
        return nid;
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
    public String getLatarpendidikan() {
        return latarpendidikan;
    }
    public static void main(String[] args) 
    {
        Dosen dsn1 = new Dosen("000001","marpuah","depok jawa barat","0895555","S.p");
        System.out.println("NID  : "+dsn1.getNid() ) ;
        System.out.println("Nama  : "+dsn1.getNama() ) ;
        System.out.println("Alamat : "+dsn1.getAlamat() ) ;
        System.out.println("Kontak : "+dsn1.getKontak() ) ;
        System.out.println("Latar pendidikan : "+dsn1.getLatarpendidikan() ) ;
    }
    {
        Dosen dsn1 = new Dosen("000002","maroko","Jakarta","0896666","S.par");
        System.out.println("NID  : "+dsn1.getNid() ) ;
        System.out.println("Nama  : "+dsn1.getNama() ) ;
        System.out.println("Alamat : "+dsn1.getAlamat() ) ;
        System.out.println("Kontak : "+dsn1.getKontak() ) ;
        System.out.println("Latar pendidikan : "+dsn1.getLatarpendidikan() ) ;
    }
}