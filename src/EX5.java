public class EX5 {
    public static void main(String[] args){
moto m=new moto(2);
System.out.println(m.toString());
    }
}
class vehicule{
    private int nbPassager;

    public int getNbPassager() {
        return nbPassager;
    }

    public void setNbPassager(int nbPassager) {
        this.nbPassager = nbPassager;
    }

    public vehicule(int n){
        this.nbPassager=n;
    }
    public String toString(){
        return "le nbre de passager :"+nbPassager;
    }

}
class moto extends vehicule{
    public moto(int nbRoues){
        super(nbRoues);
    }

    private int nbRoues=2;

    public int getNbRoues() {
        return nbRoues;
    }

    public void setNbRoues(int nbRoues) {
        this.nbRoues = nbRoues;
    }
}
class avion extends vehicule{
    private int nbMoteur;
    private int nbM;
    public int nbP;
    public avion(int nbP){
        super(nbP);
        this.nbMoteur=nbP;

    }
    public avion(int nbP,int nbM){
        super(nbP);
        this.nbM=nbM;
    }
}
class triporteur extends moto{
    private int nbrtri;
    public triporteur(int nbRoues,int nbrtri){
        super(nbRoues);
        this.nbrtri=nbrtri;
    }

    public void setNbrtri(int nbrtri) {
        this.nbrtri = nbrtri;
    }

    public int getNbrtri() {
        return nbrtri;
    }
    public String toString(){
        return "triporteur nbrtri "+getNbrtri()+"nbroues "+getNbRoues();
    }
}
