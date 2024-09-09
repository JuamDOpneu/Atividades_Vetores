import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {

        String[] vetor = new String[3];
        Scanner nome = new Scanner(System.in);
        System.out.println("Digite o nome de 3 amigos seus:");
        vetor[0] = nome.nextLine();
        vetor[1] = nome.nextLine();
        vetor[2] = nome.nextLine();
        System.out.println("seus amigos são");
        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);

    }
}
