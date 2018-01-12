package trabalho.lucas;
import java.util.Random;
import java.util.Scanner;

public class Controlador {
   private int numeroSorteado = 0;
   
   public void iniciaJogo(int modoJogo){
      numeroSorteado = sorteiaNumero(modoJogo);
      int qtdTentativas = buscaTentativas(modoJogo);
      System.err.println("Modo de jogo ["+modoJogo+"] Selecionado, Você tem "+qtdTentativas+" Tentativas"); 
      for (int i = 1; i < qtdTentativas + 1; i++) {
            System.err.println("Tentativa "+i+" de "+qtdTentativas+" \n");
            Scanner scanner = new Scanner(System.in);
            int numeroDigitado = scanner.nextInt();

            if (numeroSorteado == numeroDigitado){
                System.err.println("Parabéns, você acertou \n");
                break;
            }else{
                if (numeroDigitado < numeroSorteado){
                  System.err.println("O Numero sorteado é MAIOR \n");
                }else{
                  System.err.println("O Numero sorteado é MENOR \n");
                }
                if (i==qtdTentativas){
                   System.err.println("O Numero sorteado foi "+numeroSorteado+" \n");
                }   
            }
        } 
    }
    public int sorteiaNumero (int modoJogo) {
        Random random = new Random();
        switch (modoJogo){
            case 1: numeroSorteado = random.nextInt(21);break;
            case 2: numeroSorteado = random.nextInt(101);break;
            case 3: numeroSorteado = random.nextInt(1000);break;
        }
        return numeroSorteado;    
    }
    public int buscaTentativas (int modoJogo) {
        int qtdTentativas = 3;
        switch (modoJogo){
                case 1: qtdTentativas = 5;
                        break;
                case 2: qtdTentativas = 6;
        }                      
        return qtdTentativas;
    }
}
