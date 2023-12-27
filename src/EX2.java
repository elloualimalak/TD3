public class EX2 {
    public static void main(String[] args){
        Pointex2 p=new Pointex2();
        p.Pointex2(2,12);
        p.affCoord();
        PointNom a=new PointNom();
        a.setPointNom(3,15,'A');
        a.affCoordNom();
    }
    static class Pointex2 {
        private int x, y;
        public void Pointex2(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void deplace(int dx, int dy) {
            x += dx;
            y += dy;
        }
        public void affCoord() {
            System.out.println("Coordonnees : " + x + " " + y);
        }
    }
    public static class PointNom extends Pointex2{
        private char nom;
        public void setPointNom(int x,int y,char nom){
            Pointex2(x,y);
            this.nom=nom;
        }
        public void setNom(char nom){
            this.nom=nom;
        }
        public char getNom(){
            return nom;
        }
        public void affCoordNom(){
            System.out.println("les coordonnes "+getNom());
            affCoord();
        }
    }

}
