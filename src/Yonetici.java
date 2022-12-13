
public class Yonetici extends Calisan{// subclass
    
    
    private  int sorumluKisi; // ekstra özellik 
    public Yonetici(String isim,int maas, String departman,int sorumluKisi){
        
        
        /*this.isim = isim;
        this.maas = maas;
        this.departman = departman;*/
        super(isim ,maas,departman);
        this.sorumluKisi = sorumluKisi ;
    }
    public void zamYap(int zamMiktari){
        
        System.out.println("çalışanlara " + zamMiktari+ " zam yapıldı");
        
    }public void BilgilerGoster(){
        
       /* System.out.println("isim :"+ getIsim());
        System.out.println("maas :"+ getMaas());    
        System.out.println("departman :"+getDepartman());
        */
       
       super.BilgileriGoster();
        System.out.println("sourmlu olduğu kişi sayısı" +this.sorumluKisi);
        
    }
        
    
}
