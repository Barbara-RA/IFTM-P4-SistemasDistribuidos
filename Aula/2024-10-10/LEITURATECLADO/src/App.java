import java.util.List;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Buffer buffer = new Buffer();
        SalvamentoAutomatico salvamento = new SalvamentoAutomatico(buffer);
        List<Observador> observadores = Arrays.asList(salvamento);
        LeituraTeclado leituraTeclado = new LeituraTeclado(buffer, observadores);
        Thread t1 = new Thread(leituraTeclado);
        
        t1.start();
        Thread t2 = new Thread(salvamento);
        t2.start();
        System.out.println("Acabou");

    }
}
