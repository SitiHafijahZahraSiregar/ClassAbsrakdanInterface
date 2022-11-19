package mainclass;

public class Toner extends Skincare {
    private int expired;
    private String brand;
    private String manfaat;
 
 public Toner(String brand, String manfaat, int expired) {
        this.brand = brand;
        this.manfaat = manfaat;
        this.expired = expired;
    }

public int getExpired() {
    return expired;
}

public void setExpired(int expired) {
    this.expired = expired;
}

public String getManfaat() {
    return manfaat;
}

public void setManfaat(String manfaat) {
    this.manfaat = manfaat;
}
    @Override
    public void print(){
    System.out.println("=== Toner ===");
    System.out.println("Jenis skincare : " + brand);
    System.out.println("Manfaat skincare : " + manfaat);
    System.out.println("Tanggal expired : " +  expired);
    System.out.println(" ");

}
}
