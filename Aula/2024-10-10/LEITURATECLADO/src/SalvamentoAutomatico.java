import java.io.File;
import java.io.PrintWriter;

public class SalvamentoAutomatico implements Runnable, Observador {
    private Buffer buffer;
    private static final String PATH = "C:\\Users\\barba\\Desktop\\teste\\arquivo.txt";
    private static final Integer INTERVAL = 10000;
    private Boolean teveMudanca = Boolean.FALSE;

    public SalvamentoAutomatico(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(teveMudanca);
                if (teveMudanca) {
                    File file = new File(PATH);
                    String textoSalvar = buffer.lerConteudoBuffer();
                    PrintWriter pw = new PrintWriter(file);
                    pw.println(textoSalvar);
                    pw.close();
                    teveMudanca = Boolean.FALSE;
                }
                Thread.sleep(INTERVAL);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void notificaMudanca() {
        this.teveMudanca = true;
    }

}
