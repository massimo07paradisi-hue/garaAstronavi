import java.util.concurrent.ThreadLocalRandom;

public class Gestore {

    public final int percorso;
    private Astronave vincitore = null;  // niente volatile

    public Gestore() {
        this.percorso = ThreadLocalRandom.current().nextInt(30, 301);
    }

    // Metodo sincronizzato per evitare race condition
    public synchronized void segnalaArrivo(Astronave a) {
        if (vincitore == null) {
            vincitore = a;
            System.out.println("🏆 Vincitore: " + a.getModello() + " (ID " + a.getId() + ")");
        }
    }
}

