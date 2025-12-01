
 class GaraAstronavi {
    public static void main(String[] args) {
        Gestore g = new Gestore();

        Thread t1 = new Thread(new Astronave(1, g, "Falcon"));
        Thread t2 = new Thread(new Astronave(2, g, "Voyager"));
        Thread t3 = new Thread(new Astronave(3, g, "StarRunner"));

        t1.start();
        t2.start();
        t3.start();
    }
}


    try {
        a1.join();
        a2.join();
        a3.join();
        a4.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }



}