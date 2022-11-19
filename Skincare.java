package mainclass;

///kata kunci untuk menyatakan abstact class
public abstract class Skincare implements ViewData {

    //method biasa
        protected String brand;
        
    //method abstract
        public String getBrand() {
            return brand;
        }
    
        public void setBrand(String brand){
            this.brand = brand;
        }
    }
