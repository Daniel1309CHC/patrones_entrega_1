package factorymethod;

import factorymethod.products.IConexionBd;

public abstract class ConexionFactory {
        private String conexionType;
        private IConexionBd conexionBd;

        public ConexionFactory(String conexionType) {
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
