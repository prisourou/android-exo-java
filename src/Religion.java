abstract public class Religion{

    protected String nom;
    protected String reverant;


    public Religion (String nom,String reverant){

        this.nom = nom;
        this.reverant = reverant;
    }

    public String getnom() {
        return nom;
    }
    public void setnom(String nom){
        this.nom = nom;
    }
    public String getreverant(){
        return reverant;

    }
    public void setreverant(String reverant){
        this.reverant = reverant;
    }

    abstract public void noel();

    public static void main(String[]args){

        Catholique cath = new Catholique("St Michel", "Prête", "dine", "madep", "diacre");

        System.out.println(cath.nom);
        System.out.println(cath.reverant);
        System.out.println(cath.samuels);
        System.out.println(cath.chorales);
        System.out.println(cath.manguiers);
        
    }

}
