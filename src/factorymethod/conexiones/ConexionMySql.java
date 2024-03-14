package factorymethod.conexiones;

public class ConexionMySql implements IConexionBd {

    private String host;
    private String puerto;
    private String usuario;
    private String password;

    public ConexionMySql() {
        this.host = "localhost";
        this.puerto = "8083";
        this.usuario = "admin";
        this.password = "45523";
    }

    @Override
    public void open() {
        System.out.println("Conexion exitosa MYSQL");
    }

    @Override
    public void close() {
        System.out.println("Se deconecto MYSQL");
    }
}
