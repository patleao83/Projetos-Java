package JoKenPo;

import java.util.Scanner;
import java.util.Random;

public class JoKenPo {
	
	public static void main(String[] args) {
	    
	    Scanner Scanner1 = new Scanner(System.in);
	    int iniciar = 0;
	    
	    System.out.println("     Jo-Ken-Po! v1.5");
	    
	    do {
	      
	      System.out.println("\n \nQuer jogar? \n \n1 - Sim \n2 - Não \n");
	      iniciar = Scanner1.nextInt();

	      if (iniciar == 1) {
	        jogar();
	        
	      } else {
	        
	        System.out.print("\nOk então né, estarei esperando você dizer que sim. \n");
	        intervalo();
	        intervalo();
	        
	      }
	      
	    } while (iniciar != 1);
	    
	    Scanner1.close();
	  }

	  public static void jogar() {
	    
	    Scanner Scanner2 = new Scanner(System.in);
	    Random random = new Random();

	    int jogada = 0, cpu = 0, menu = 0; 
	    boolean pedra = false, papel = false, tesoura = false;
	      
	      System.out.println("\nEscolhe sua jogada: \n \n1 - Pedra \n2 - Papel \n3 - Tesoura \n");
	      jogada = Scanner2.nextInt();

	      switch(jogada) {
	          
	        case 1:
	          pedra = true;
	          System.out.println("\nJo");
	          intervalo();
	          System.out.println("Ken");
	          intervalo();
	          System.out.println("Po!");
	          intervalo();
	          System.out.println("\nVocê escolheu pedra!");
	          break;

	        case 2:
	          papel = true;
	          System.out.println("\nJo");
	          intervalo();
	          System.out.println("Ken");
	          intervalo();
	          System.out.println("Po!");
	          intervalo();
	          System.out.println("\nVocê escolheu papel!");
	          break;

	        case 3:
	          tesoura = true;
	          System.out.println("\nJo");
	          intervalo();
	          System.out.println("Ken");
	          intervalo();
	          System.out.println("Po!");
	          intervalo();
	          System.out.println("\nVocê escolheu tesoura!");
	          break;

	        default:
	          System.out.println("\nOpção Inválida. Escolhe uma válida da próxima, por favor! :v");
	          intervalo();
	          jogar();
	          break;
	      }

	      
	      cpu = random.nextInt(3) + 1;

	    
	      //pedra
	      if (pedra == true && cpu == 1){
	        intervalo();
	        System.out.println("\nEu escolho pedra!");
	        intervalo();
	        intervalo();
	        System.out.println("\nUau, Empate! :O");
	        
	      }
	      if (pedra == true && cpu == 2){
	        intervalo();
	        System.out.println("\nEu escolho papel!");
	        intervalo();
	        intervalo();
	        System.out.println("\nPutz, você perdeu! :/");
	      }
	      if (pedra == true && cpu == 3){
	        intervalo();
	        System.out.println("\nEu escolho tesoura!");
	        intervalo();
	        intervalo();
	        System.out.println("\nParabéns, você ganhou! :>");
	      }

	    
	      //papel
	      if (papel == true && cpu == 1){
	        intervalo();
	        System.out.println("\nEu escolho pedra!");
	        intervalo();
	        intervalo();
	        System.out.println("\nParabéns, você ganhou! :>");
	      }
	      if (papel == true && cpu == 2){
	        intervalo();
	        System.out.println("\nEu escolho papel!");
	        intervalo();
	        intervalo();
	        System.out.println("\nUau, Empate! :O");
	      }
	      if (papel == true && cpu == 3){
	        intervalo();
	        System.out.println("\nEu escolho tesoura!");
	        intervalo();
	        intervalo();
	        System.out.println("\nPutz, você perdeu! :/");
	      }

	    
	      //tesoura
	      if (tesoura == true && cpu == 1){
	        intervalo();
	        System.out.println("\nEu escolho pedra!");
	        intervalo();
	        intervalo();
	        System.out.println("\nPutz, você perdeu! :/");
	      }
	      if (tesoura == true && cpu == 2){
	        intervalo();
	        System.out.println("\nEu escolho papel!");
	        intervalo();
	        intervalo();
	        System.out.println("\nParabéns, você ganhou! :>");
	      }
	      if (tesoura == true && cpu == 3){
	        intervalo();
	        System.out.println("\nEu escolho tesoura!");
	        intervalo();
	        intervalo();
	        System.out.println("\nUau, Empate! :O");
	      }

	    do {
	     intervalo();
	     intervalo();
	     System.out.println("\n \nQuer jogar de novo? \n \n1 - Sim \n2 - Não \n");
	     menu = Scanner2.nextInt();

	    switch(menu) {
	        
	      case 1:
	       jogar();
	       break;
	        
	      case 2:
	        System.out.println("\nObrigado por jogar! \nEncerrando o jogo...");
	        Scanner2.close();
	        System.exit(0);
	        break;
	        
	      default:
	        System.out.println("\nAh cara, escolhe 1 ou 2 por favor... :(");
	        intervalo();
	        
	     }
	      
	    } while (menu != 1 && menu != 2);
	    
	  }
	    
	 public static void intervalo() {
	   
	  try {
	    
	    Thread.sleep(1000);
	    
	  } catch (InterruptedException e) {
	    
	    System.out.println("ERRO!" + e);
	    
	  }
	   
	 }
}
