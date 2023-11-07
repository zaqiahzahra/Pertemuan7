package Pertemuan7_Polimorfisme_statis;

public class Lingkaran {
    float luas (float jarijari){
        return (float) (Math.PI * jarijari * jarijari);
    }
    double luas (double diameter){
        return (double) (Math.PI * diameter * 1/4);
    }
    public static void main(String[] args) {
     Lingkaran L = new Lingkaran();
            float jarijari = 14;
            double diameter = 7;
            
        System.out.println("Menghitung Luas Lingkaran menggunakan jarijari : " + L.luas(jarijari)); 
        System.out.println("Menghitung Luas Lingkaran Menggunakan diameter : " + L.luas(diameter));
        
            
     
    }
    
}
