public class EX4 {
    public static void main(String[] args){
        batiment b=new batiment("av mohammed 5");
        System.out.println(b.toString());
        maison m=new maison(2,"av mohammed ben abdellah");
        System.out.println(m.toString());
        maison.immeuble I=new maison.immeuble("avenue france",12);
        System.out.println(I.toString());

    }
}
class batiment{
    private String adresse;
    public batiment(){}
    public batiment(String adresse){
        this.adresse=adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "adresse "+adresse;
    }
}
class maison extends batiment{
    private int nbreschambres;
    public maison(String adresse,int nbreschambres){
        super(adresse);
        this.nbreschambres=nbreschambres;
    }
    public maison(){}
    public maison(int nbreschambres,String adresse){
        this.nbreschambres=nbreschambres;
        this.setAdresse(adresse);
    }

    public void setNbreschambres(int nbreschambres) {
        this.nbreschambres = nbreschambres;
    }

    public int getNbreschambres() {
        return nbreschambres;
    }
    @Override
    public String toString() {
        return "adresse "+getAdresse()+"Le nombre de pièces de la maison :"+nbreschambres;
    }
    public static class immeuble extends batiment{
        private int nbAppart;
        public immeuble(String adresse,int nbAppart){
            super(adresse);
            this.nbAppart=nbAppart;
        }
        public immeuble(){}

        public void setNbAppart(int nbAppart) {
            this.nbAppart = nbAppart;
        }

        public int getNbAppart() {
            return nbAppart;
        }

        @Override
        public String toString() {
            return "adresse :"+getAdresse()+", Le nombre d'appartements de l'immeuble :"+nbAppart;
        }
    }
}
