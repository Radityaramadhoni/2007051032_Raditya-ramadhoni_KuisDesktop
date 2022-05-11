
package buku.model;

public class model {
    private String id;
    private String nama;
    private String nama_penerbit;
    private String nama_pengarang;
    private String tgl_terbit;
    private String harga_buku;
    private String jenis;

    public model(String id, String nama, String nama_penerbit, String nama_pengarang, String tgl_terbit, String harga_buku) {
        this.id = id;
        this.nama = nama;
        this.nama_penerbit = nama_penerbit;
        this.nama_pengarang = nama_pengarang;
        this.tgl_terbit = tgl_terbit;
        this.harga_buku = harga_buku;
        this.jenis = jenis;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama_penerbit() {
        return nama_penerbit;
    }

    public void setNama_penerbit(String nama_penerbit) {
        this.nama_penerbit = nama_penerbit;
    }

    public String getNama_pengarang() {
        return nama_pengarang;
    }

    public void setNama_pengarang(String nama_pengarang) {
        this.nama_pengarang = nama_pengarang;
    }
    
     public String getjenis() {
        return jenis;
    }

    public void setjenis(String nama_pengarang) {
        this.jenis = jenis;
    }

    public String getTgl_terbit() {
        return tgl_terbit;
    }

    public void setTgl_terbit(String tgl_terbit) {
        this.tgl_terbit = tgl_terbit;
    }

    public String getHarga_buku() {
        return harga_buku;
    }

    public void setHarga_buku(String harga_buku) {
        this.harga_buku = harga_buku;
    }
    
}
