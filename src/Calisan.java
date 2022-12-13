
public class Calisan {// super class veya base class
    
    
    private String isim ;
    
    private int maas ;
    
    
    private  String departman;
    
    
    public Calisan (String isim,int maas,String departman)
    {
        
        this.isim = isim ;
        this.maas = maas;
        this.departman = departman ;
        
      
    }
            
    public void Calis(){
        
        System.out.println("çalışan çalışıyor ");
        
    }
    public void BilgileriGoster(){
        
            System.out.println("isim :");
            System.out.println("maas :");
            System.out.println("departman :");

    }
    public void departmanDegistir(String YeniDepartman){
        
        System.out.println("departman değistiriliyor ...");
        setDepartman(YeniDepartman);
        
        System.out.println("yeni departman : "+ getDepartman());
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the maas
     */
    public int getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(int maas) {
        this.maas = maas;
    }

    /**
     * @return the departman
     */
    public String getDepartman() {
        return departman;
    }

    /**
     * @param departman the departman to set
     */
    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
