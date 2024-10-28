public class App {
    public static void main(String[] args) throws Exception {
        Corrida shumacher= new Corrida("Shumacher");
        Corrida senna = new Corrida("Senna");
        Corrida barrichelo= new Corrida("Barrichelo");
        Thread thread = new Thread(shumacher);
        Thread thread1 = new Thread(senna);
        Thread thread2 = new Thread(barrichelo);
        // começa a corrida
        thread.start();
        thread1.start();
        thread2.start();
        // espera a corrida acabar para continuar o main.
        thread.join();
        thread1.join();
        thread2.join();
        System.out.println("Acabou a corrida");
    }
}
