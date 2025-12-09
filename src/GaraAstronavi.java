class GaraAstronavi {

    public static void main(String[] args) {
        Gestore g = new Gestore();

        Thread t1 = new Thread(new Astronave(1, g, "Falcon"));
        Thread t2 = new Thread(new Astronave(2, g, "Voyager"));
        Thread t3 = new Thread(new Astronave(3, g, "StarRunner"));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
