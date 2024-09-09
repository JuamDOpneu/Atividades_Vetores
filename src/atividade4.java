import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {

        int[] vetor = new int[3];
        System.out.println("digite 3 numeros");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        vetor[0] = sc.nextInt();
        System.out.println("Digite um numero: ");
        vetor[1] = sc.nextInt();
        System.out.println("Digite  numero: ");
        vetor[2] = sc.nextInt();

        System.out.println("os numeros que voce digitou " + vetor[0] +"," + vetor[1] +"," + vetor[2]);
    }
}
