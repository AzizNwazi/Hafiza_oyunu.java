package Udemy_hafiza_oyunu;

import java.io.Serializable;

// Kart sınıfı, hafıza oyunu kartlarını temsil eder
public class Kart implements Serializable {

    // Kartın üzerindeki değeri temsil eden karakter
    private char deger;
    
    // Kartın tahmin edilip edilmediğini tutan durumu
    private boolean tahmin = false;

    // Kart sınıfının yapıcı metodu (constructor)
    public Kart(char deger) {
        this.deger = deger;
    }

    // Kartın değerini getiren metot
    public char getDeger() {
        return deger;
    }

    // Kartın değerini set eden metot
    public void setDeger(char deger) {
        this.deger = deger;
    }

    // Kartın tahmin edilip edilmediğini kontrol eden metot
    public boolean isTahmin() {
        return tahmin;
    }

    // Kartın tahmin edilip edilmediğini set eden metot
    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }
}
