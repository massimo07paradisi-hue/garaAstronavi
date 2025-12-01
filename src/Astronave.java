import static java.lang.Thread.sleep;

public class Astronave implements Runnable {

    private int id;
    private String modello;
    private Gestore g;

    private int giriPercorsi = 0;     // 🔥 OGNI astronave ha i propri giri

    public Astronave(int id, Gestore g, String modello) {
        this.id = id;
        this.g = g;
        this.modello = modello;
    }

    public int getId() { return id; }
    public String getModello() { return modello; }

    @Override
    public void run() {

        System.out.println("Sono il giocatore numero: " + this.id + " ed inizio il gioco");

        try {
            while (giriPercorsi < g.percorso) {
                System.out.printf("Il giocatore %d è nella posizione %d%n", id, giriPercorsi);
                giriPercorsi++;
                sleep(100); // più veloce
            }
        } catch (InterruptedException e) {
            System.out.println("Errore sleeping");
        }

        System.out.println("Giocatore " + id + " ha terminato!");
        g.segnalaArrivo(this);
    }
}

