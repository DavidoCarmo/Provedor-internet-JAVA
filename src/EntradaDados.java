import java.util.Scanner;



public class EntradaDados {
    public static void main(String[] args) {


      
        //Scanner    //entrada
        Scanner scanner = new Scanner(System.in);



        //Texto
        System.out.print ("\nInforme seu nome:");
        String nome = scanner.next();
        


        //Caracter
        System.out.print("\nEscolha uma cor:(verde, azul, laranja, roxo)");
        char cor = scanner.next().charAt(0);



        //Numero 
        System.out.println ("\nInforme sua idade:");
        int idade = scanner.nextInt();


        //Altura
         System.out.println ("\nInforme sua altura:");
         double altura = scanner.nextDouble();


        //processamento
         nome = nome.toUpperCase();



        //saida
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(cor);
        scanner.close();
    }
}
