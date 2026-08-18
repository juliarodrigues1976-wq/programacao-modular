import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Jogo[] jogos = new Jogo[16]; 
        

    for (int i = 1; i <= 15; i++) {
        jogos[i] = new Jogo();
    }

        
    char[] letras = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P'};

    for (int i = 1; i <= 8; i++) {
        jogos[i].time1 = letras[(i - 1) * 2];
        jogos[i].time2 = letras[(i - 1) * 2 + 1];
    }

       
    int[][] dependencias = {
        {1,2}, {3,4}, {5,6}, {7,8},
        {9,10}, {11,12},
        {13,14},
        15
     };

        
     for (int i = 9; i <= 15; i++) {
       int[] dep = dependencias[i - 9];
       jogos[i].time1 = jogos[dep[0]].vencedor;
       jogos[i].time2 = jogos[dep[1]].vencedor;
     }

       
     for (int i = 1; i <= 15; i++) {
         if (i >= 9) {
            int[] dep = dependencias[i - 9];
            jogos[i].time1 = jogos[dep[0]].vencedor;
            jogos[i].time2 = jogos[dep[1]].vencedor;
     }

     jogos[i].golsTime1 = sc.nextInt();
     jogos[i].golsTime2 = sc.nextInt();

     jogos[i].vencedor = (jogos[i].golsTime1 > jogos[i].golsTime2)
                    ? jogos[i].time1
                    : jogos[i].time2;
     }

     System.out.println(jogos[15].vencedor);
}

static class Jogo {
        char time1;
        char time2;
        int golsTime1;
        int golsTime2;
        char vencedor;
}
