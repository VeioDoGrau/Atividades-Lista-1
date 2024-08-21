import java.util.Scanner;

public class Questão20 {

    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora?: ");
        double valorHora = valores.nextDouble();

        System.out.print("Número de horas trabalhadas no mês: ");
        double horasTrabalhadas = valores.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double descontoIR = salarioBruto * 0.11;
        double descontoINSS = salarioBruto * 0.08;
        double descontoSindicato = salarioBruto * 0.05;
        double totalDescontos = descontoIR + descontoINSS + descontoSindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("IR (11%%): R$ %.2f%n", descontoIR);
        System.out.printf("INSS (8%%): R$ %.2f%n", descontoINSS);
        System.out.printf("Sindicato (5%%): R$ %.2f%n", descontoSindicato);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        valores.close();
    }
}