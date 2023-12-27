public class EX1 {
    public static void main(String[] args){
        Pointex1 p = new Pointex1() ;
        p.Pointex1 (2, 5);
        System.out.println ("Coordonnees : " + p.getX() + " " + p.getY() ) ;
        pointA pa = new pointA() ;
        pa.Pointex1 (1, 8);
        pa.afficher() ;
        pa.deplace(12,4);
        pa.afficher() ;
    }
    public static class Pointex1 {
        private int x, y;
        public void Pointex1(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void deplace(int dx, int dy) {
            x += dx;
            y += dy;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }

    }
    public static class pointA extends Pointex1{
        public void afficher(){
            System.out.println("coordonnees "+getX()+" "+getY());
        }
    }

}


