import java.util.Scanner;

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    exibirMenu();
    definirAcaoMenu(teclado.nextInt());


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
