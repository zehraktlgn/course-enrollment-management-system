//ZEHRA KUTLUGÜN
//22100011002

package odev2;

public class Kurs {
	private int kursId;
	private String kursAd;
	public Kurs(int kursId, String kursAd) {
        this.kursId = kursId;
        this.kursAd = kursAd;
    }
	public String toString() {
        return "Kurs [ID: " + kursId + ", Ad: " + kursAd + "]";
    }
	public int getKursId() {
		return kursId;
	}
	public void setKursId(int kursId) {
		this.kursId = kursId;
	}
	public String getKursAd() {
		return kursAd;
	}
	public void setKursAd(String kursAd) {
		this.kursAd = kursAd;
	}
	

}
