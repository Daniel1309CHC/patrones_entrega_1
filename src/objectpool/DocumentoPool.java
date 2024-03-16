package objectpool;

import java.util.ArrayList;
import java.util.List;

public class DocumentoPool {

    private List<Documento> pool;
    private int maxSize;

    public DocumentoPool(int maxSize) {

            this.maxSize = maxSize;
            this.pool = new ArrayList<>();
    }

    public synchronized Documento acquireDocumento() {
        if (pool.isEmpty()) {
            return new Documento();
        } else {
            return pool.remove(pool.size() - 1);
        }
    }

    public synchronized void releaseDocumento(Documento documento) {
        if (pool.size() < maxSize) {
            pool.add(documento);
        }

    }

}
