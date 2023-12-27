public class EX7 {
    public static void main(String[] args) {
        Patron patron = new Patron("noussir" , "rihab ", 20000);
        TravailleurCommission tc = new TravailleurCommission("NOUSSIR ", "RIHAB ", 20000, 4000);
        TravailleurHoraire th = new TravailleurHoraire("noussir", "rihab" , 2000);
        System.out.println(patron.toString());
        patron.setSalaire(47000);
        System.out.println(patron.toString());
        System.out.println(tc.toString());
        tc.gains();
        System.out.println(tc.toString());
        th.gains();
    }
    public abstract class Employe {

        private String nom ;
        private String prenom ;

        public Employe() {
        }

        public Employe(String nom , String prenom){
            this.nom=nom;
            this.prenom=prenom;
        }

        @Override
        public String toString() {
            return "Employe{" +
                    "nom='" + getNom()+ '\'' +
                    ", prenom='" + getPrenom()+ '\'' +
                    '}';
        }

        public abstract void gains();


        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }
    }
    class Patron extends Employe{

        private float salaire ;

        public Patron(){
            super();
        }

        public Patron(String nom, String prenom , float salaire) {
            super(nom, prenom);
            this.salaire=salaire;
        }


        @Override
        public void gains() {
            System.out.println(this.salaire);
        }

        @Override
        public String toString() {
            return "Patron{ nom : " +getNom()+
                    " , prenom "+getPrenom()+
                    " , salaire=" +getSalaire()+
                    '}';
        }

        public float getSalaire() {
            return salaire;
        }

        public void setSalaire(float salaire) {
            this.salaire = salaire;
        }
    }
    class TravailleurCommission extends Employe{

        private float salaire ;
        private float commision ;
        private int quantite ;

        public TravailleurCommission(){

        }

        public TravailleurCommission(String nom,String  prenom,float salaire, float commision){
            super(nom , prenom);
            this.salaire=salaire;
            this.commision=commision;
        }


        @Override
        public void gains() {
            System.out.println("votre salaire est "+getCommision()+getSalaire());
        }

        @Override
        public String toString() {
            return "TravailleurCommission{ Nom : " +getNom()+
                    " prenom : "+getPrenom()+
                    "salaire=" + getSalaire() +
                    ", commision=" +getCommision()+
                    ", quantite=" + getQuantite() +
                    '}';
        }

        public float getSalaire() {
            return salaire;
        }

        public float getCommision() {
            return commision;
        }

        public int getQuantite() {
            return quantite;
        }

        public void setSalaire(float salaire) {
            this.salaire = salaire;
        }

        public void setCommision(float commision) {
            this.commision = commision;
        }

        public void setQuantite(int quantite) {
            this.quantite = quantite;
        }
    }
    class TravailleurHoraire extends Employe{

        private int retribution ;
        private  int heures ;

        public TravailleurHoraire() {
        }

        public TravailleurHoraire(String nom, String prenom, int retribution) {
            super(nom, prenom);
            this.retribution = retribution;
        }

        @Override
        public void gains() {
            System.out.println("Mr."+getNom()+" "+getPrenom()+ " travvaille  "+getHeures()+" heures " +
                    "et son salaire est "+getRetribution());
        }

        @Override
        public String toString() {
            return "TravailleurHoraire{" +
                    "retribution=" + this.getRetribution() +
                    ", heures=" + this.getHeures() +
                    '}';
        }

        public int getRetribution() {
            return retribution;
        }

        public void setRetribution(int retribution) {
            this.retribution = retribution;
        }

        public int getHeures() {
            return heures;
        }

        public void setHeures(int heures) {
            this.heures = heures;
        }
    }


}
