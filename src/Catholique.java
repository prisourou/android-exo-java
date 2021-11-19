public class Catholique extends Religion implements Peleriner{

    public String samuels;
    public String chorales;
    public String manguiers;

public Catholique(String nom, String reverant, String samuels, String chorales,String manguiers){

   super(nom,reverant); 
   this.samuels = samuels;
   this.chorales = chorales;
   this.manguiers = manguiers;  
}


     public String getsamuels(){
         return samuels;
     }

     public void  setsamuels(String samuels){
         this.samuels = samuels;
     }

       public String getchorales(){
           return chorales;
       }
       public void setchorales(String chorales){
           this.chorales = chorales;
       }

       public String getmanguiers(){
           return manguiers;
       }

       public void setmanguiers(String manguiers){
           this.manguiers = manguiers;
       }
        
        public void noel(){
           System.out.println("c'est la fete de noel");
       }

       public void prier(){
           System.out.println("aleluuh uhfk");
       }
       public void jeuner(){
           System.out.println("Crememe");
       }
}