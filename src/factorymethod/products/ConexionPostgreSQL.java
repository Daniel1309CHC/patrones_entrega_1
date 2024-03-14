package factorymethod.products;

public class ConexionPostgreSQL implements IConexionBd{

    private String host;
    private String puerto;
    private String usuario;
    private String password;

    public ConexionPostgreSQL() {
        this.host = "localhost";
        this.puerto = "8081";
        this.usuario = "admin";
        this.password = "admin123";
    }

    @Override
    public void open() {
        System.out.println("Conexion exitosa POSTGRESQL");
    }

    @Override
    public void close() {
        System.out.println("Se deconecto POSTGRESQL");
    }
}
