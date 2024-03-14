package factorymethod;

public class Main {

    static ConexionManager conexionBd;

    public static void configure(String type){
        conexionBd = new ConexionCreate(type);
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
