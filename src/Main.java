import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String menu = "1 - Entrar\n2 - Sair\nEscolha uma opção:";

        System.out.print(menu);

        byte op = entrada.nextByte();

        switch (op) {
            case 1:
                System.out.println("Bem-Vindo, Moreno.");
                break;
            case 2:
                System.out.println("Até mais, cria.");
                break;
            default:
                System.out.println("Opção inválida, doido.");
                break;

                /*
                * switch (op) {
                *   case 1 -> System.out.println("Bem-Vindo, Moreno.");
                *   case 2 -> System.out.println("Até mais, cria.");
                *   case 3 -> System.out.println("Opção inválida, doido.");
                 *
                *
                *
                *
                *
                * */
        }

    }

}