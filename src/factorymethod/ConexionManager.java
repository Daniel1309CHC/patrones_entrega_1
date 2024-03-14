package factorymethod;

import factorymethod.conexiones.IConexionBd;

public abstract class ConexionManager {
        private String conexionType;
        private IConexionBd conexionBd;

        public ConexionManager(String conexionType) {
            this.conexionType = conexionType;
        }

        public abstract IConexionBd createConexion(String conexionType) ;

        public void openBd (){
            conexionBd = this.createConexion(this.conexionType);
            conexionBd.open();
        }

        public void closeBd (){
            conexionBd.close();
        }

    }
