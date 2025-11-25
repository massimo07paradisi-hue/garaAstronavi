public static void main(String[] args) {
    Gestore gestore = new Gestore();


    // Create multiple threads to increment the counter
    Astronave a1 = new Astronave(() -> gestore.increment());
    Astronave a2 = new Astronave(() -> gestore.increment());
    Astronave a3 = new Astronave(() -> gestore.increment());
    Astronave a4 = new Astronave(() -> gestore.increment());

    a1.start();
    a2.start();
    a3.start();
    a4.start();

    try {
        a1.join();
        a2.join();
        a3.join();
        a4.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }



}