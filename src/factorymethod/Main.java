package factorymethod;

public class Main {

    static ConexionFactory conexionBd;

    public static void configure(String type){
        conexionBd = new ConexionCroncreteFactory(type);
    }


    public static void main(String[] args) {
        configure("ORACLE");
        conexionBd.openBd();
        conexionBd.closeBd();

        configure("POSTGRE");
        conexionBd.openBd();
        conexionBd.closeBd();

        configure("MYSQL");
        conexionBd.openBd();
        conexionBd.closeBd();

        }
    }
