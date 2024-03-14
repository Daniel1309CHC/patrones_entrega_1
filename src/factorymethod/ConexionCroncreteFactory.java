package factorymethod;

import factorymethod.products.IConexionBd;
import factorymethod.products.ConexionMySql;
import factorymethod.products.ConexionPostgreSQL;
import factorymethod.products.ConexionOracle;

public class ConexionCroncreteFactory extends ConexionFactory {
    public ConexionCroncreteFactory(String conexionType) {
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

