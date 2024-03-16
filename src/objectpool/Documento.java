package objectpool;

public class Documento {

    private String header;
    private String body;

    private String footer;

    private String id;


    public Documento() {
        this.header = header;
        this.body = body;
        this.footer = footer;
        this.id = id;

        try {
            System.out.println("Se ha creado un documento");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void setId(String id) {
        this.id = id;
    }

    public void operar() {
        System.out.println("Se ha operado sobre el documento con ID: "+this.id);
    }
}
