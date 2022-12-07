
import java.util.Scanner;


public class Test {
    private static  String islemler = 
            "0- İslemleri görüntüle\n"+
            "1- Şarkı ekle\n"+
            "2- Şarkı sil\n"+
            "3- Şarkı güncelle\n"+
            "4- Şarkı ara\n"+
            "5- Şarkı listesini görüntüle\n"+
            "6- Çıkış\n";
    
    public static void main(String[] args) { 
       
        String name; // döngüde çok amaçlı kullanmak için
        int deger; // döngüde çok amaçlı kullanmak için
        
        Sarkilar sarkilar = new Sarkilar();                 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(islemler);
        
        
        boolean kontrol = true;
        while(kontrol)
        {
            System.out.println("işlem seçiniz: ");
            int islem = scanner.nextInt();
            scanner.nextLine(); // enter tuşunu boşa atamak için
            
                switch (islem) {
                    case 0:
                        System.out.println(islemler);
                        break;
                    
                    case 1:
                        System.out.println("Eklencek şarkı adını giriniz: ");
                        name = scanner.nextLine();
                        sarkilar.sarkiEkle(name); 
                        break;
                        
                    case 2:
                        System.out.println("Silinecek şarkının numarasını giriniz: ");
                        deger = scanner.nextInt();
                        sarkilar.sarkiSil((deger-1));
                        break;
                        
                    case 3:
                        System.out.println("güncellemek istediğiniz şarkının numarasını giriniz: ");
                        deger = scanner.nextInt();
                        scanner.nextLine(); // enter tuşunu boşa atamak için
                        System.out.println("Yeni eklenecek şarkının adını giriniz: ");
                        name = scanner.nextLine();
                        sarkilar.sarkiGüncelle((deger-1), name);
                        break;
                        
                    case 4:
                        System.out.println("Aranacak şarkı adını giriniz: ");
                        name = scanner.nextLine();
                        sarkilar.sarkiAra(name); 
                        break;
                        
                    case 5:
                        sarkilar.sarkilariBastir();
                        break;
                        
                    case 6:
                        System.out.println("Programdan çıkılıyor...");
                        kontrol = false;
                        break;
                        
                        
                        
                default:
                    System.out.println("GEÇERSİZ İŞLEM..!");
            }
        }
    }
    
}
