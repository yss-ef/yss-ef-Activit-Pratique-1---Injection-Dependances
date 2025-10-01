package pres;

import dao.IDao;
import dao.DaoImpl;
import metier.IMetier;
import metier.MetierImpl;

public class Pres {
    public static void main(String[] args) {
        IDao dao = new DaoImpl();
        IMetier metier = new MetierImpl(dao);

        System.out.println(metier.calculate());
    }
}
