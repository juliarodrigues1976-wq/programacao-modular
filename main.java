import java.util.ArrayList;
import java.util.Scanner;

import clinica_veterinaria.src.model.Sala;
import clinica_veterinaria.src.model.Veterinario;

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    exibirMenu();
    definirAcaoMenu(teclado.nextInt());
    criaVeterinarios();
    criaSalas();


    teclado.close();
}

private static void exibirMenu(){
    System.out.println(
        "1. Cadastrar atendimento.\r\n" +
        "2. Associar um veterinário a uma sala.\r\n" +
        "3. Atribuir atendimento a uma sala.\r\n" +
        "4. Exibir todos os atendimentos atribuídos a uma sala específica.\r\n" +
        "5. Informar a quantidade total de atendimentos finalizados por cada sala.\r\n" +
        "6. Buscar atendimentos por status.\r\n" +
        "7. Exibir os detalhes completos de um atendimento específico."
    );
}

private static void criaVeterinarios(){
    Veterinario v1 = new Veterinario("Joao", "109809206457", "generalista", "31999999999");
    Veterinario v2 = new Veterinario("Ana", "109809206557", "generalista", "31999979999");
    Veterinario v3 = new Veterinario("Paulo", "109809206357", "generalista", "31999998999");
}

private static void criaSalas(){

}

public static void definirAcaoMenu(int valor) {
    switch (valor) {
        case 1:
            
            break;
        case 2:
            
            break;
        case 3:
            
            break;
        case 4:
            
            break;
        case 5:
            
            break;
        case 6:
            
            break;
    
        default:
            break;
    }
}
