    
import java.util.ArrayList;


public class Sarkilar {
    
    private ArrayList<String> sarkici_listesi = new ArrayList<String>();
    
    public void sarkilariBastir()
    {
        System.out.println("Listede " + sarkici_listesi.size() + " adet şarkı bulunmaktadır");
        
        for(int i = 0 ; i < sarkici_listesi.size() ; i++)
        {
            System.out.println((i+1) +". Şarkı: " + sarkici_listesi.get(i));
        } 
    }
    
    public void sarkiEkle(String sarki_adi)
    {
        System.out.println(sarki_adi + " adli şarkı başarıyla eklendi..");
        sarkici_listesi.add(sarki_adi);
    }
    
    public void sarkiSil(int pozisyon)
    {
         System.out.println(sarkici_listesi.get(pozisyon) + " adli şarkı başarıyla silindi..");
         sarkici_listesi.remove(pozisyon);
    }
    
    public void sarkiGüncelle(int pozisyon, String sarki_adi)
    {
        System.out.println(pozisyon + ". Şarkı " + sarki_adi + " ile güncellendi.. ");
        sarkici_listesi.set(pozisyon, sarki_adi);
    }
    
    public void sarkiAra(String sarki_adi)
    {
        int pozisyon = sarkici_listesi.indexOf(sarki_adi); // şarkı listede yoksa -1 dönüyor
        
           if(pozisyon >=0)            
               System.out.println(sarki_adi + " adli şarkı " + (pozisyon+1) +". sırada bulunuyor..");
          
           else
               System.out.println(sarki_adi + " adli şarkı listede bulunmamaktadır..");
    }
    
    
    
}




