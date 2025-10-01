package pres;

import dao.IDao;
import dao.IDaoImpl;
import metier.IMetier;
import metier.MetierImpl;

public class Pres {
    public static void main(String[] args) {
        IDao dao = new IDaoImpl();
        IMetier metier = new MetierImpl(dao);

        System.out.println(metier.calculate());
    }
}
