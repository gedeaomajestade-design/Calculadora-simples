import java.util.Scanner;
public class Main{
    public static void main(String[] args){
         Scanner sc = new Scanner (System.in);
         System.out.println("====\n CALCULADORA === ");

         System.out.println (" Digite o primeiro numero: ");
         double x = sc.nextDouble();
        System.out.println(" Digite o Segundo numero: ");
         double y = sc.nextDouble();

         System.out.println("\n Escolha uma opcao");
         System.out.println("1- soma: ");
         System.out.println("2- Subtracap: ");
         System.out.println("3- Multipliocacao:  ");
         System.out.println("4 - Divisao: ");
          int opcao = sc.nextInt();
          double resultado;

          if(opcao == 1){
              resultado = x + y;
              System.out.println("Resultado = " + resultado );
          }else if (opcao == 2){
              resultado = x - y;
              System.out.println("Resultado = " + resultado );
          } else if(opcao == 3){
              resultado = x * y;
              System.out.println("Resultado = " + resultado );
          } else if (opcao == 4)
              if(y != 0){
                  resultado = x / y ;
                  System.out.println("Resultado = " + resultado );
              }else{
                  System.out.println(" Impossivel Dividir por 0 (Zero) ");
              }

    }
}