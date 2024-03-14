package factorymethod;

import factorymethod.conexiones.IConexionBd;
import factorymethod.conexiones.ConexionMySql;
import factorymethod.conexiones.ConexionPostgreSQL;
import factorymethod.conexiones.ConexionOracle;

public class ConexionCreate extends ConexionManager {
    public ConexionCreate(String conexionType) {
        super(conexionType);
    }

    @Override
    public IConexionBd createConexion(String type) {
        if (type.equalsIgnoreCase("MYSQL")) {
            return new ConexionMySql();
        } else if (type.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        } else if (type.equalsIgnoreCase("POSTGRE")) {
            return new ConexionPostgreSQL();
        }
        return null;
    }
    }

