package factorymethod.conexiones;

public class ConexionOracle implements IConexionBd{

    private String host;
    private String puerto;
    private String usuario;
    private String password;

    public ConexionOracle() {
        this.host = "localhost";
        this.puerto = "8082";
        this.usuario = "root";
        this.password = "root123";
    }

    @Override
    public void open() {
        System.out.println("Conexion exitosa ORACLE");
    }

    @Override
    public void close() {
        System.out.println("Se deconecto ORACLE");
    }

}
