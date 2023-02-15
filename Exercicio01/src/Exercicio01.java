import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int velocidadeM, tempo, consumo, distancia, media;

        System.out.println(" Digite a velocidade media: ");
        velocidadeM = ler.nextInt();
        System.out.println(" Digite o tempo gasto: ");
        tempo = ler.nextInt();
        System.out.println(" Digite o consumo: ");
        consumo = ler.nextInt();

        distancia = velocidadeM*tempo;
        media = distancia/consumo;
        System.out.println(" A media de consumo foi de : " + media);




    }
}
