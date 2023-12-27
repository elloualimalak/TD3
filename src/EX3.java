public class EX3 {
    public static void main(String[] args){
        Pointex3 P=new Pointex3(5,8);
        Centre C=new Centre(2,1,"omar");
        cercle c=new cercle(4,9,"d",5);
        P.affCoord();
        C.affiche();
        c.aff();
       System.out.println(C.affNom());


    }
}
class Pointex3 {
    private int x, y;
    public Pointex3(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
class Centre extends Pointex3{
    private int x,y;
    private String nom;
    public Centre(int x,int y,String nom) {
        super(x, y);
        this.nom = nom;
    }
        public String affNom(){
            return nom;
        }
        public void affich(){
            System.out.println("le nom :"+nom+", les coordonnees :"+x+", "  +y);
        }
    }


class cercle extends Centre{
        private int rayon;
        public cercle(int x, int y, String nom,int rayon) {
            super(x, y, nom);
            this.rayon=rayon;

        }
        public void aff(){
            System.out.println("le rayon :"+rayon);
        }
    }


