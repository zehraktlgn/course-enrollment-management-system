//ZEHRA KUTLUGÜN
//22100011002

package odev2;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Anasayfa {

	public static void kursekle(ArrayList<Kurs> kurslar ) {
		//KURS EKLE
		int kontrol=0;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Kurs ID giriniz");
		int kursId=scan1.nextInt();
		System.out.println("Kurs ad giriniz");
		String kursAd=scan1.next();
		Kurs kurs = new Kurs(kursId, kursAd);
		 for(int i=0;i<kurslar.size();i++) {
	    		if(kurslar.get(i).getKursId()==kursId){
	    		System.out.println("Aynı ID ye sahip baska bir kurs var");
	    		kontrol=1;
	    		break;
	    		}	
		 }
		 if(kontrol==0)
			 kurslar.add(kurs);
        
        for(int i=0;i<kurslar.size();i++) {
    		System.out.println(kurslar.get(i));
        	}
		
	}
    public static void kursListele(ArrayList<Kurs> kurslar) {
    	//KURS LİSTELE	
		
        for(int i=0;i<kurslar.size();i++) {
    		System.out.println(kurslar.get(i));
        	}
    }
    public static void kursAra(ArrayList<Kurs> kurslar) {
    	//ADA GÖRE KURS ARA
        System.out.println("Aramak istediğiniz Kursun adini giriniz");
        Scanner scan=new Scanner(System.in);
		String kursAdi=scan.nextLine();
		String arananKursAdi = kursAdi.replace(" ", "");
		for(int i=0;i<kurslar.size();i++) {
			if(kurslar.get(i).getKursAd().replace(" ","").equals(arananKursAdi)) {
				System.out.println(kurslar.get(i).getKursId()+" "+kurslar.get(i).getKursAd());
			}
		}
    }
    public static void kursSil(ArrayList<Kurs> kurslar,ArrayList<Kurs> alinanKurslar) {
    	//KURS SİLME
		int kontrol1 = 0;
	    System.out.println("Silmek istediğiniz Kursun adini giriniz");
	    Scanner scan2 = new Scanner(System.in);
	    String KursAdi = scan2.nextLine();
	    String arananKursAdi2 = KursAdi.replace(" ", "");
	    for (int i = 0; i < alinanKurslar.size(); i++) {
	        if (alinanKurslar.get(i).getKursAd().replace(" ","").equals(arananKursAdi2)) {
	            System.out.println("Bu kursa kayıtlı kursiyer olduğu için silme işlemi gerçekleştirilemiyor");
	            kontrol1 = 1;
	            break;
	        }
	    }
	    if (kontrol1 == 0) {
	        kurslar.removeIf(k -> k.getKursAd().equals(KursAdi));
	    }
    }
    public static void kursiyerEkle(ArrayList<Kursiyer> kursiyerler) {
    	//KURSİYER EKLEME
    	Scanner scan1 = new Scanner(System.in);
		int kontrol2=0;
		System.out.println("Kursiyer ID giriniz");
	int kursiyerId=scan1.nextInt();
	scan1.nextLine();
	System.out.println("Kursiyer ad soyad giriniz");
	String kursiyerAd=scan1.nextLine();
	System.out.println("Kursiyer yas giriniz");
	int kursiyeryas=scan1.nextInt();
	Kursiyer kursiyer = new Kursiyer(kursiyerId, kursiyerAd,kursiyeryas);
	for(int i=0;i<kursiyerler.size();i++) {
		if(kursiyerler.get(i).getKursiyerId()==kursiyerId){
		System.out.println("Aynı ID ye sahip baska bir kursiyer var");
		kontrol2=1;
		break;
		}  	
 }
	if(kontrol2==0) {
		kursiyerler.add(kursiyer);
	}
    }
    public static void kursiyerAra(ArrayList<Kursiyer> kursiyerler) {
    	//KURSİYER ARAMA 
		int a = 0;
		Scanner scan11 = new Scanner(System.in);
		System.out.println("Aramak istediğiniz Kursiyer adını ve soyadını giriniz");     
		String kursiyerAdi = scan11.nextLine().toUpperCase();
		String arananKursiyerAdi = kursiyerAdi.replace(" ", "");

		for(Kursiyer kursiyerr : kursiyerler) {
		    if(kursiyerr.getKursiyerAdSoyad().replace(" ", "").equalsIgnoreCase(arananKursiyerAdi)) {
		        System.out.println("Kursiyer bulundu: " + kursiyerr.getKursiyerId() + " " + kursiyerr.getKursiyerAdSoyad());
		        a = 1;
		    }
		}

		if(a == 0) {
		    System.out.println("Aradığınız Kursiyer bulunamadı");
		}
    }
    public static void kursiyerSil(ArrayList<Kursiyer> kursiyerler) {
    	//KURSİYER SİLME
		System.out.println("Silmek istediğiniz Kursiyer ID giriniz");
    Scanner scan3=new Scanner(System.in);
	int KursiyerID2=scan3.nextInt();
	for(int i=0;i<kursiyerler.size();i++) {
		if(kursiyerler.get(i).getKursiyerId()==KursiyerID2) {
			kursiyerler.removeIf(Kursiyer -> Kursiyer.getKursiyerId()==KursiyerID2);
		}
	}
    }
    public static void kursiyerListele(ArrayList<Kursiyer> kursiyerler) {
    	//KURSİYER LİSTELEME
		for(int i=0;i<kursiyerler.size();i++) {
		System.out.println(kursiyerler.get(i));
    	}
    }
    public static void kursiyerAyriliListele(ArrayList<Kursiyer> kursiyerler,ArrayList<Kurs> alinanKurslar) {
    	//DETAYLI LİSTELEME					
		for (Kursiyer kursiyerr : kursiyerler) {
            System.out.println("Ad Soyad: " + kursiyerr.getKursiyerAdSoyad());
            System.out.println("Aldığı Kurslar:");

            for (Kurs alinanKurs : kursiyerr.getAlinanKurslar()) {
                System.out.println("- " + alinanKurs.getKursAd());
            }}
    }
    public static void kursiyerBorcHesapla(ArrayList<Kursiyer> kursiyerler,ArrayList<Kurs> alinanKurslar) {
    	System.out.println("Kursiyer ID giriniz");
    	Scanner scan1=new Scanner(System.in);
		int kursiyerId1=scan1.nextInt();
		
		Kursiyer arananKursiyer = null;
        for (Kursiyer k : kursiyerler) {
            if (k.getKursiyerId() == kursiyerId1) {
                arananKursiyer = k;
                break;
            }
        }        
        if (arananKursiyer != null) {
            arananKursiyer.BorcHesapla(kursiyerId1);;
        } else {
            System.out.println("Kursiyer bulunamadı.");
        }
    }
    public static void Cikis(ArrayList<Kursiyer> kursiyerler,ArrayList<Kurs> alinanKurslar,ArrayList<Kurs> kurslar) {
    	System.out.println("CIKIS yapılıyor");
		
		try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("kurs.txt")))) {
            for (Kurs kurs1 : kurslar) {
                writer.write(kurs1.getKursId() + "+" + kurs1.getKursAd());
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println("Kurslar dosyasına yazılırken bir hata oluştu");
        }
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("kursiyer.txt"))) {
            for (Kursiyer kursiyer4 : kursiyerler) {
                writer.write("*" + kursiyer4.getKursiyerId() + "+" + kursiyer4.getKursiyerAdSoyad() + "+" + kursiyer4.getKursiyerYas());
                writer.newLine();
                for (Kurs alinanKurs : kursiyer4.getAlinanKurslar()) {
                    writer.write("%" + alinanKurs.getKursId() + "+" + alinanKurs.getKursAd());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Kursiyerler dosyasına yazılırken bir hata oluştu");
        }
    }
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileInputStream file=null;
		ArrayList<Kursiyer> kursiyerler =new ArrayList<Kursiyer>();
		ArrayList<Kurs> kurslar =new ArrayList<Kurs>();
		ArrayList<Kurs> alinanKurslar=new ArrayList<Kurs>();
		
		try {
			file= new FileInputStream("kurs.txt");
			
			Scanner scan = new Scanner(new FileReader("kurs.txt"));
			while (scan.hasNextLine()) {
                String satir = scan.nextLine();
                String[] kursBilgileri = satir.substring(0).split("\\+");
                int kurs2Id = Integer.parseInt(kursBilgileri[0]);
                String kurs2Ad = kursBilgileri[1];
                Kurs kurs = new Kurs(kurs2Id, kurs2Ad);
                kurslar.add(kurs);}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		}
		finally {
			if(file!=null) {
				try {
					file.close();
				} catch (IOException e) {
					System.out.println("dosya kapatılırken bir hata oluştu");
				}
			}
		}
		
		
		try {
			fis=new FileInputStream("kursiyer.txt");
			try {
				Scanner scanner = new Scanner(new FileReader("kursiyer.txt"));
				Kursiyer kursiyer=null;
				 while (scanner.hasNextLine()) {
		                String satir = scanner.nextLine();
		                
						if(satir.charAt(0) == '*') {					
							String newLine = satir.substring(1,satir.length());
							 String[] KursiyerBilgi = newLine.split("\\+");
							kursiyer = new Kursiyer(Integer.parseInt(KursiyerBilgi[0]),KursiyerBilgi[1],Integer.parseInt(KursiyerBilgi[2]));	
							kursiyerler.add(kursiyer);
						}
						
						else if(satir.startsWith("%")) {
							String newLine = satir.substring(1,satir.length());
							String[] KursBilgi = newLine.split("\\+");
							Kurs alinankurslar = new Kurs(Integer.parseInt(KursBilgi[0]),KursBilgi[1]);
							kursiyer.kursEkle(alinankurslar);
			
						} 		                
				 }					
				
			} catch (IOException e) {
				System.out.println("dosya okunurken hata oluştu");
			}
		} catch (FileNotFoundException e) {
			System.out.println("file bulunamadı");
		}
		finally {
			try {
				if(fis!=null) {
				fis.close();
				}
			} catch (IOException e) {
				System.out.println("dosya kapatılırken bir hata oluştu");
			}
		}
			
		try (Scanner scan1 = new Scanner(System.in)) {
			while(true) {
				System.out.println("1-Kurs Ekle\n"
						+ "2-Kursları Listele\n"
						+ "3-Kurs Ara\n"
						+ "4-Kurs Sil\n"
						+ "5-Kursiyer Ekle\n"
						+ "6-Kursiyer Ara\n"
						+ "7-Kursiyer Sil\n"
						+ "8–Kursiyerleri Listele\n"
						+ "9–Kursiyerleri Ayrıntılı Listele\n"
						+ "10–Kursiyerin Ödeyeceği Tutarı Hesapla\n"
						+ "11–Çıkış\r\n"
						+ "");
				int secim=scan1.nextInt();
				switch(secim) {
				case 1:kursekle(kurslar);
				break;
				case 2:	kursListele( kurslar);
			    break;
				case 3:kursAra(kurslar);
				break;
				case 4:kursSil(kurslar,alinanKurslar);					
				break;
				case 5:kursiyerEkle(kursiyerler);
				break;
				case 6:kursiyerAra(kursiyerler);
				break;					
				case 7:kursiyerSil(kursiyerler);					
				break;
				case 8:kursiyerListele(kursiyerler);					
				break;
				case 9:kursiyerAyriliListele(kursiyerler,alinanKurslar);	
				break;
				case 10:kursiyerBorcHesapla(kursiyerler,alinanKurslar);					
		        break;
				case 11:Cikis(kursiyerler,alinanKurslar,kurslar);
				System.exit(0);
				break;
				
				}	
					
				}
		}                 
        
		
	}

	private static Readable newFileReader(String string) {
		return null;
	}

}

