package Model;

public class Tokopedia {
    public String deskripsibarang;
    public int harga;
    public String asalbarang;
    public String stok;


    public Tokopedia(){

    }
    public Tokopedia(String desbarang, int hrg, String aslbarang, String stok){
        this.deskripsibarang = desbarang;
        this.harga = hrg;
        this.asalbarang = aslbarang;
    }
    public String getDeskripsibarang(){
        return this.deskripsibarang;
    }
    public void setDeskripsibarang(String deskripsibarang){
        this.deskripsibarang = deskripsibarang;
    }
    public int getHarga(){
        return this.harga;
    }
    public void setHarga( int harga){
        this.harga = harga;
    }
    public String getAsalbarang(String asalbarang){
        return this.asalbarang;
    }
    public void setAsalbarang(){
        this.asalbarang = asalbarang;
    }
    public String getStok(){
        return this.stok;
    }
    public void setStok(String stok){
        this.stok = stok;
    }
}