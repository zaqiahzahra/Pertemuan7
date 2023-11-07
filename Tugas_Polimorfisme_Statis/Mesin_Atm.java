package Tugas_Polimorfisme_Statis;

public class Mesin_Atm {
    int total (int totalUang){
     return (int) (totalUang * 200);  
    }
    
    
    float tunai (float ambilTunai) {
    return (float) (ambilTunai * 400);
    }
    public static void main(String[] args) {
    Mesin_Atm MA = new Mesin_Atm();
            int totalUang = 500;
            float ambilTunai = 700;
        System.out.println("Menampilkan jumlah Uang : " + MA.total(totalUang));
        System.out.println("Menampilkan jumlah uang yang diambil : " + MA.tunai(ambilTunai));
    }
}
    

