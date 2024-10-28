import java.util.Random;
//implementar runnable é para implementar uma tread
public class Corrida implements Runnable {
    private Random random = new Random();

    private String nome;

    Corrida(String nome) {
        this.nome = nome;
    }

    // método run é obrigatório e pertence a interface Runnable

    @Override
    public void run() {
        for (int i = 1; i < 20; i++) {
            System.out.println("Piloto " + nome + " Completou " + i + " voltas");
            try {
                //tempo de bloquei da thread em milisegundos (0 a 2000) a condição é o limite superior
                Thread.sleep(random.nextInt(2001));
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Piloto " + nome + " terminou a corrida!");
    }
}
