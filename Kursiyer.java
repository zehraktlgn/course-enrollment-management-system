//ZEHRA KUTLUGÜN
//22100011002

package odev2;

import java.util.ArrayList;


public class Kursiyer implements Hesaplama {
	private int kursiyerId;
	private String kursiyerAdSoyad;
	private int kursiyerYas;
	private ArrayList<Kurs> alinanKurslar;

	public Kursiyer(int kursiyerId, String kursiyerAdSoyad, int kursiyerYas) {
        this.kursiyerId = kursiyerId;
        this.kursiyerAdSoyad = kursiyerAdSoyad;
        this.kursiyerYas = kursiyerYas;
        this.alinanKurslar = new ArrayList<>();
    }
	 @Override
	    public String toString() {
	        return "ID: " + kursiyerId + " Ad Soyad: " + kursiyerAdSoyad + " Yaş: " + kursiyerYas ;
	    }
	public int getKursiyerId() {
		return kursiyerId;
	}
	public void setKursiyerId(int kursiyerId) {
		this.kursiyerId = kursiyerId;
	}
	public String getKursiyerAdSoyad() {
		return kursiyerAdSoyad;
	}
	public void setKursiyerAdSoyad(String kursiyerAdSoyad) {
		this.kursiyerAdSoyad = kursiyerAdSoyad;
	}
	public int getKursiyerYas() {
		return kursiyerYas;
	}
	public void setKursiyerYas(int kursiyerYas) {
		this.kursiyerYas = kursiyerYas;
	}
	public ArrayList<Kurs> getAlinanKurslar() {
		return alinanKurslar;
	}
	public void setAlinanKurslar(ArrayList<Kurs> alinanKurslar) {
		this.alinanKurslar = alinanKurslar;
	}
	public void getDetayliList(ArrayList<Kurs> alinanKurslar) {

		System.out.println(kursiyerId+" "+kursiyerAdSoyad+" "+kursiyerYas+" "+alinanKurslar+"\n");
	}
	public void kursEkle(Kurs alinanKurslar) {
		this.alinanKurslar.add(alinanKurslar);
	}
	public void BorcHesapla(int kursiyerId) {
        double fiyat=500;
        if(alinanKurslar.size()==2) {
        	fiyat=900;
        	
        }
        else if(alinanKurslar.size()==3) {
        	fiyat=1375;
        }
        else if(alinanKurslar.size()>3) {
        	fiyat=(500*alinanKurslar.size())-(alinanKurslar.size()*0.1);
        }
        System.out.println("Kurs Ücretinin:"+fiyat);
    }
	 
}
