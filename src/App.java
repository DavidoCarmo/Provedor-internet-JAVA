import java.util.Scanner;
 
public class App {
    public static void main(String[] args) throws Exception {
 
        // Atividade proposta - 05/04/2024 - Sexta-Feira
        // System.out.println("Olá, bem-vindo a central de atendimento {provedor}");
 
        // System.out.println("Meu nome é {atendente}, sou seu assistente virtual");
 
        // System.out.println("Durante o atendimento siga minhas instruções");
 
        // System.out.println("Primeiramente informe seu nome");
 
        // System.out.println("Obrigado {nome}, como posso lhe ajudar?");
 
 
        // Resolução da atividade
        Scanner scanner = new Scanner(System.in);
 
        String provedor = "Titanic";
        String atendente = "Rose";
 
        System.out.printf("Olá, bem-vindo a central de atendimento %s %s\n\n", provedor, "!");
 
        System.out.printf("Meu nome é %s, %s", atendente, "sou seu assistente virtual!\n");
 
        System.out.println("\nDurante o atendimento siga minhas instruções abaixo:");
 
        System.out.printf("\nPrimeiramente informe seu nome: ");
        String nome = scanner.next();
 
        System.out.printf("\nObrigado %s, %s", (nome),"como posso lhe ajudar? ");
        String nome2 = scanner.next();
       
        nome = nome.toUpperCase();
        nome2 = nome2.toUpperCase();
 
        System.out.println(nome);
        System.out.println(nome2);
 
        scanner.close();
    }
}
 