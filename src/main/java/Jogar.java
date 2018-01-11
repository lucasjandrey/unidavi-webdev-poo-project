/*Casos de Uso

Escolha do menu;
Sorteio de 3 tipos de faixa de número;
Informar tentativa;
Quantidades de tentativas restantes;
Dicas de número Maior ou Menor;

Entidade de Domínio

Jogo
Jogador
Controlador
*/

package trabalho.lucas;

import java.util.Scanner;

public class Jogar extends Controlador{
    private int modoJogo;
    
    private void Menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primeiro Programa com Java - Lucas Jandrey \n");
        System.out.println("Selecione o modo de Jogo \n");
        System.out.println("[1] - 1 à 20 - 5 Tentativas \n");
        System.out.println("[2] - 1 à 100 - 6 Tentativas \n");
        System.out.println("[3] - 1 à 999 - 3 Tentativas(Hard) \n");
        setModoJogo(scanner.nextInt());
    }
    
    public void iniciaAdivinhaNumero() {
        Menu();
        iniciaJogo(getModoJogo());
    }

    public int getModoJogo() {
        return modoJogo;
    }

    public void setModoJogo(int modoJogo) {
        this.modoJogo = modoJogo;
    }
    
}
