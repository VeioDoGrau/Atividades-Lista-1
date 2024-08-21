import java.util.Scanner;
public class Aula2 {

    public static int somar(int a, int b) {
        return a + b;
    }
    public static double dividir(int a, int b) {
        return a / b;
    }
    public static String texto(){
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.next();
        return nome;
    }
    public static void main(String[] args) {
        int resultado = somar(10,3);
        System.out.println(resultado);

        double resultDiv = dividir(7, 3);
        System.out.printf("%.2f", resultDiv);

        texto();
    }
}
