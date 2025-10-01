package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    //Initialiser un objet de type IDao, sa valeur sera null
    IDao dao;

    //Constructeur sans paramètre
    public MetierImpl() {
    }

    //Constructeur avec paramètre


    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calculate() {
        double t = dao.getData();
        double result = t * 21 * Math.PI;
        return result;
    }

    /*
    l'objet dao est null donc on ne peu pas l'appeler. il faut
    lui injecter une valeur, pour ça deux methode existe:
    1. constructeur avec paramètre (méthode conseillé)
    2. getters
     */

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
