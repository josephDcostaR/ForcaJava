
import java.util.Scanner;

import Game.Game;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Jogo da Forca \n");
        try (Scanner sc = new Scanner(System.in)) {
            Game g = new Game();
            int life = g.getLife();


            while (life != 0) 
            { 
                g.ContagemDeVidas();
                g.verificarPalavras();

                System.out.print("Digite uma letra: ");

                if(sc.hasNextLine()) {
                    String entrada = sc.nextLine().toLowerCase();

                    if (entrada.equals("0")) {
                        System.out.println("Você saiu do jogo.");
                        return;
                    }

                    if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) { 
                        g.adicionarLetraChamada(entrada);
                    } else {
                        System.out.println("Por favor, insira uma única letra válida.");
                    }
   
                    if (!g.verificarSePlayerAcertou(entrada)) {
                        break; 
                    }

                } else {
                    System.out.println("Erro de entrada");
                    break;
                }
            }

            sc.close();
        }
    }
}
