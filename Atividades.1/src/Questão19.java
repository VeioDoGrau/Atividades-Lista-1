import java.util.Scanner;
public class Questão19 {

    public static void main(String[] args) {

        Scanner nota = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = nota.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = nota.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = nota.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = nota.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas é: " + media);

        nota.close();
    }
}