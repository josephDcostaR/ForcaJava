import java.util.ArrayList;
import java.util.Random;


public class Game {

    Random r = new Random();
    Words p = new Words();
    Player j = new Player();

    String[] words = p.getWords();
    ArrayList<String> callWords = p.getCallWords();
    private String randomWord;
    private char letra;
    private boolean isWin = true;
    int life = j.getLife();

    public Game() {
        int randomIndex = r.nextInt(words.length);
        randomWord = words[randomIndex];
    }

    public void verificarPalavras() {
            for (int i = 0; i < randomWord.length(); i++) {
                letra = randomWord.charAt(i);
                if (callWords.contains(String.valueOf(letra))) {
                    System.out.print(letra + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println(); 
    }

    public void adicionarLetraChamada(String letra) {
        callWords.add(letra);
    }

    public boolean verificarSePlayerAcertou(String tentativas) {

        isWin = true; 

        for (char letra : randomWord.toCharArray()) {
            if (!callWords.contains(String.valueOf(letra).toLowerCase())) {
                isWin = false;
                break;
            }
        }
    
        if (!randomWord.contains(tentativas)) {
            life -= 1;
        }
    
        if (life == 0 || isWin) {
            verificarSePlayerGanhou(); 
            return false; 
        }
    
        return true; 
    }
        
    public void verificarSePlayerGanhou() {
        if (isWin) {
            System.out.println("Parabéns! Voce acertou. A palavra é " + randomWord + ". " );
            
        }else {
            System.out.println("Que pena voce errou. A palara era " + randomWord + ". ");
          
        }
    }

    public void ContagemDeVidas() {
        System.out.println(""
            + "Você tem "+ life +" chances\n"
            + "-Caso erre perde 1 chance.\n"
            + "-Só é permitido 1 letra do alfabeto.\n"
            + "-Digite '0' para sair.\n");
    }



    public int getLife() {
        return life;
    }
}

