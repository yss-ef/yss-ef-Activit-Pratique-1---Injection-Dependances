package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Utilisation de la BDD");
        double data = 31;
        return data;
    }
}
