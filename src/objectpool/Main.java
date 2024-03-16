package objectpool;


public class Main {

    public static void main(String[] args) {
        DocumentoPool DocumentoPool = new DocumentoPool(3);

        Documento obj1 = DocumentoPool.acquireDocumento();
        Documento obj2 = DocumentoPool.acquireDocumento();
        Documento obj3 = DocumentoPool.acquireDocumento();

        obj1.setId("1");
        obj2.setId("2");
        obj3.setId("3");

        obj1.operar();
        obj2.operar();
        obj3.operar();

        DocumentoPool.releaseDocumento(obj1);
        DocumentoPool.releaseDocumento(obj2);
        DocumentoPool.releaseDocumento(obj3);

        System.out.println("Se crearon 3 documentos y se operaron sobre ellos");

        System.out.println("Ahora se implementan las mismas operaciones pero en un menor tiempo");

        Documento obj4 = DocumentoPool.acquireDocumento();
        Documento obj5 = DocumentoPool.acquireDocumento();
        Documento obj6 = DocumentoPool.acquireDocumento();

        obj4.setId("4");
        obj5.setId("5");
        obj6.setId("6");

        obj4.operar();
        obj5.operar();
        obj6.operar();
    }
    }
