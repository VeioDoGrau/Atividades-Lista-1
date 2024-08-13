import java.util.Scanner;

public class aaaa {

    public static void main(String[] args) {

        char[] nome = new char[5];

        nome[0] = 'K';
        nome[1] = 'e';
        nome[2] = 'v';
        nome[3] = 'i';
        nome[4] = 'n';

        for (int i = 0; i < nome.length; i++){
            System.out.print(nome[i]);
        }
        System.out.println("\n");
        for (int i = nome.length-1; i >= 0; i--){
            System.out.print(nome[i]);
        }
        System.out.println("\n");
        System.out.println("While");
        int count = 0;
        while (true){

            if (count == nome.length) {
                break;
            }
            System.out.print("\nFor Infinito");
            count = 0;
            for(;;){
            }
        }
    }
}