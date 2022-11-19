package mainclass;


public class MainClass {

    public static void main(String[] args) {
        Skincare serum = new Serum ("Luxcrime","Mencerahkan Kulit", 2024);
        Skincare sunscreen = new Sunscreen ("Emina", "Melembabkan Kulit", 2023);
        Skincare toner = new Toner ("Emina", "Melembabkan Kulit", 2023);
        
        Skincare[] skincare = new Skincare[3];
        skincare[0] = serum;
        skincare [1] = sunscreen;
        skincare [2] = toner;
        
        for (int i = 0; i < 3; i++){
            skincare[i].print();
        }
        
        
    }
    
}
