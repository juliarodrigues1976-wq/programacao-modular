import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.print("Altura (em metros, ex: 1.75): ");
        double altura = Double.parseDouble(scanner.nextLine());

        System.out.print("Peso (em kg): ");
        double peso = Double.parseDouble(scanner.nextLine());

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);
        pessoa.calculaIMC();

        System.out.println();
        System.out.printf("%s %s, seu IMC é: %.2f%n", pessoa.getNome(), pessoa.getSobrenome(), pessoa.getImc());
        System.out.println("Classificação: " + pessoa.informaObesidade());

        scanner.close();
    }
}