package Calculadora;

import java.util.Scanner;

public class Calculadora {
  
  public static void main(String[] args) {
    
    System.out.println("                 Calculadora Simples v1.3");

    calcula();
    
  }
 public static void calcula() {

  Scanner input = new Scanner(System.in);
   
  int escolhaOperacao, escolhaMenu; 
  double num1, num2, resultado;
   
   
      System.out.println("\nEscolha a operação que deseja realizar: "
                        + "\n \n1 - Soma"
                        + "\n2 - Subtração"
                        + "\n3 - Multiplicação"
                        + "\n4 - Divisão"
                        + "\n \n5 - Sair \n");

      escolhaOperacao = input.nextInt();
    
    switch(escolhaOperacao){

      case 1:
        System.out.println("\nDigite o primeiro número: \n");
        num1 = input.nextDouble();
        
        System.out.println(" Digite o segundo número: \n");
        num2 = input.nextDouble();

        resultado = num1 + num2;
        
        System.out.println("\n \n \nO resultado é " + resultado);

        System.out.println("\n \n \nDeseja continuar? \n \n1 - Sim \n2 - Não \n");
        escolhaMenu = input.nextInt();
        
        if (escolhaMenu == 1) {
          calcula();
        } else { 
          System.out.println("\nEncerrando o programa...");
          System.exit(0);
        }
  
        break;
        
      case 2:

        System.out.println("\nDigite o número a ser subtraído: \n");
        num1 = input.nextDouble();

        System.out.println("Digite o número a subtrair: \n");
        num2 = input.nextDouble();

        resultado = num1 - num2;

        System.out.println("O resultado é " + resultado);

        System.out.println("\n \n \nDeseja continuar? \n \n1 - Sim \n2 - Não \n");
        escolhaMenu = input.nextInt();

        if (escolhaMenu == 1) {
          calcula();
        } else { 
          System.out.println("\nEncerrando o programa...");
          System.exit(0);
        }

       break;
        
      case 3:

        System.out.println("\nDigite o primeiro número: \n");
        num1 = input.nextDouble();

        System.out.println("Digite o segundo número: \n");
        num2 = input.nextDouble();

        resultado = num1 * num2;

        System.out.println("O resultado é " + resultado);

        System.out.println("\n \n \nDeseja continuar? \n \n1 - Sim \n2 - Não \n");
        escolhaMenu = input.nextInt();

        if (escolhaMenu == 1) {
          calcula();
        } else { 
          System.out.println("\nEncerrando o programa...");
          System.exit(0);
        }
        
      break;
        
      case 4:
        
        System.out.println("\nDigite o dividendo: \n");
        num1 = input.nextDouble();

        System.out.println("Digite o divisor: \n");
        num2 = input.nextDouble();

        resultado = num1 / num2;

        System.out.println("O resultado é " + resultado);

        System.out.println("\n \n \nDeseja continuar? \n \n1 - Sim \n2 - Não \n");
        escolhaMenu = input.nextInt();

        if (escolhaMenu == 1) {
          calcula();
        } else { 
          System.out.println("\nEncerrando o programa...");
          System.exit(0);
        }
        
      break;

      case 5:
        
        System.out.println("\nEncerrando o programa...");
        System.exit(0);
        
        break;

      default:
        
        System.out.println("\nOpção Inválida. Por favor, digite uma opção válida. \n");
        calcula();
        
        break;

    } 
    
 input.close();
  
 }

} 
