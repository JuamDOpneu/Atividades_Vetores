public class atividade3 {
    public static void main(String[] args) {

        int [] vetor = new int[2];

        vetor[0] = 10;
        vetor[1] = 5;

        System.out.println("valores sao "  +  vetor[1]  +  " e "  +  vetor[0] );

        vetor[1] = 5;
        vetor[0] = 10;
        System.out.println("troca feita " + vetor[0]  +  " e "  +  vetor[1] );

    }
}
