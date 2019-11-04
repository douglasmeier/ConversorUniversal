import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
	
	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	// Instancia a nova Janela
            	ConversorUniversal conversor =  new ConversorUniversal();
            	// Finaliza o programa quando fechar a janela
            	conversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	// Exibe a janela
            	conversor.show();
            }
        });
	}

}