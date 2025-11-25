public class Astronave extends Thread {

    public int id ;
    public Gestore gestore = new Gestore();

    public Astronave(int id) {
        this.id = id;
    }


    @Override
    public void run() {
        System.out.println("Sono il giocatore numero: " + this.id + " ed inizio il gioco");
        gioca();
        System.out.println("Esco dal gioco");

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Errore sleeping");
        }
    }

 /*   private void gioca(){
        System.out.println("Giocatore" +this.id + ", inserisci un numero: ");
        int num = input.nextInt();
        System.out.println(nome + " ha scelto il numero: "+num);
        gestore.vincitore(num);

    }
}
*/
}