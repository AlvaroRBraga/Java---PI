import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Título do Jogo 
        System.out.println("OS 4 GRANDES");
        
        // Atribuição de Scanner
        Scanner entrada = new Scanner(System.in);
        int lçrepeat = 1;
        
        // Laço de repetição
        while (lçrepeat !=10){
    // Menu
    System.out.println("Menu do jogo:");
    System.out.println(" 1 - Instruções;");
    System.out.println("2 - Jogar;");
    System.out.println("3 - Desenvolvedores/Créditos;");
    System.out.println("4 - Sair.");
    
    // Ler valor do usuário - Menu
    System.out.print("Escolha a sua opção:");
    int opcao = entrada.nextInt();
    
    // Início dos casos
    switch (opcao) {
        // Instruções
        case 1:  
        System.out.print("\nOpção: Instruções\n");
        System.out.print("\nO jogo se trata de um quiz sobre os 4 principais times \n");
        System.out.print("\nSelecione o modo de jogo História dos times ou Clássicos e responda as perguntas \n");
        System.out.print("\nSão 7 perguntas sobre a História dos Times e 5 dos Clássicos \n");
        System.out.print("\nSelecione as alternativas \n");
        System.out.print("\nAlternativas corretas valem pontos 10 pts \n");
        System.out.print("\nAs erradas valem 0 pts \n");
        System.out.print("\nNo final você será classificado de acordo com sua pontuação \n");
        break;
    
        // Seleção de modo de jogo
    case 2:
    // Variáveis para o modo História dos Times
    int pts1 = 0;
    int resp1 = 0;

    // Variáveis para o modo Clássicos
    int pts2 = 0;
    int resp2 = 0;
    System.out.print("\nOpção: Jogar\n");
    
    //  Dados do Usuário
    System.out.print("\nNome do usuário: \n");
    String nome = entrada.next();
    
    // Seleção de modo de jogo
    int mdj = 0;
    System.out.print(" "+nome+" selecione o modo de Jogo");
    System.out.print("\n [1] História dos Times\n");
    System.out.print("\n [2] Clássicos\n");
    mdj = entrada.nextInt();
    
    // Switch case e brak para o modo de jogo
    switch(mdj){
        // Histórias dos times
            case 1:
            int times = 0;
            System.out.print("\n História dos Times\n");
            System.out.print("\n Escolha um dos quatro grandes\n");
            System.out.print("\n [1] Corinthians\n");
            System.out.print("\n [2] Palmeiras\n");
            System.out.print("\n [3] Santos\n");
            System.out.print("\n [4] São Paulo\n");
            times = entrada.nextInt();
            // Switch case e break para os times
            switch(times){
                case 1:
                System.out.println("\nVocê escolheu o Corinthians\n");
                System.out.println("\nPergunta 1\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 2\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 3\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 4\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 5\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 6\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                System.out.println("\nPergunta 7\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nSua pontuação foi de \n"+pts1);
                
                if(pts1 >=30 && pts1 <= 50){
                    System.out.println("\nVocê conhece o Corinthians");
                    System.out.println("\nOu é rival ou gosta de futebol\n");
                }
                else{
                    if(pts1 < 30){
                        System.out.println("\nVocê não conhece bem o Corinthians\n");
                    }
                    else{
                        System.out.println("\nVocê é Corinthiano ou gosta muito de futebol\n");
                    }
                }
                break;

                case 2:
                System.out.println("\nVocê escolheu o Palmeiras\n");
                System.out.println("\nPergunta 1\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 2\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 3\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 4\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 5\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 6\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                System.out.println("\nPergunta 7\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nSua pontuação foi de \n"+pts1);
                
                if(pts1 >=30 && pts1 <= 50){
                    System.out.println("\nVocê conhece o Palmeiras");
                    System.out.println("\nOu é rival ou gosta de futebol\n");
                }
                else{
                    if(pts1 < 30){
                        System.out.println("\nVocê não conhece bem o Palmeiras\n");
                    }
                    else{
                        System.out.println("\nVocê é Palmeirense ou gosta muito de futebol\n");
                    }
                }
                break;

                case 3:
                System.out.println("\nVocê escolheu o Santos\n");
                System.out.println("\nPergunta 1\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 2\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 3\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 4\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 5\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 6\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                System.out.println("\nPergunta 7\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nSua pontuação foi de \n"+pts1);
                
                if(pts1 >=30 && pts1 <= 50){
                    System.out.println("\nVocê conhece o Santos");
                    System.out.println("\nOu é rival ou gosta de futebol\n");
                }
                else{
                    if(pts1 < 30){
                        System.out.println("\nVocê não conhece bem o Santos\n");
                    }
                    else{
                        System.out.println("\nVocê é Santista ou gosta muito de futebol\n");
                    }
                }
                
                break;

                case 4:
                System.out.println("\nVocê escolheu o São Paulo\n");
                System.out.println("\nPergunta 1\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 2\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 3\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 4\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 5\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 6\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                System.out.println("\nPergunta 7\n");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa");
                System.out.println("\nAlternativa\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nSua pontuação foi de \n"+pts1);
                
                if(pts1 >=30 && pts1 <= 50){
                    System.out.println("\nVocê conhece o São Paulo");
                    System.out.println("\nOu é rival ou gosta de futebol\n");
                }
                else{
                    if(pts1 < 30){
                        System.out.println("\nVocê não conhece bem o São Paulo\n");
                    }
                    else{
                        System.out.println("\nVocê é São Paulino ou gosta muito de futebol\n");
                    }
                }
                
                break;

            }
            break;

            // // Clássicos
            //     case 2:
            //     int clássicos = 0;
            //     System.out.print("\n Clássicos\n");
            //     System.out.print("\n Escolha um dos quatro grandes\n");
            //     System.out.print("\n [1] Clássico Alvinegro\n");
            //     System.out.print("\n [2] Clássico da Saudade\n");
            //     System.out.print("\n [3] Choque-Rei\n");
            //     System.out.print("\n [4] Derby Paulista\n");
            //     System.out.print("\n [5] Majestoso\n");
            //     System.out.print("\n [6] Sansão\n");
            //     clássicos = entrada.nextInt();
                
            //     // Switch case e break para os clássicosq
            //     switch (clássicos){
            //         case 1:
            //         System.out.print("\nClássico Alvinegro\n");
                    
            //         break;
            //         case 2:
            //         System.out.print("\nClássico da Saudade\n");
                    
            //         break;
            //         case 3:
            //         System.out.print("\nChoque-Rei\n");
                    
            //         break;
            //         case 4:
            //         System.out.print("\nDerby Paulista\n");
                    
            //         break;
            //         case 5:
            //         System.out.print("\nMajestoso\n");
                    
            //         break;
            //         case 6:
            //         System.out.print("\nSansão\n");
                    
            //         break;
            //     }
            //     break;

            
        }
    
    break;

    // Créditos
    case 3:
    System.out.print("\nOpção: Desenvolvedores/Créditos\n");
    System.out.print("\nEsse jogo foi desenvolvido para fins avaliativos da disciplina Projeto Integrador\n");
    System.out.print("\nÁlvaro Rocha Braga - O matemático");
    System.out.print("\nFabrício Simão - O turirsta");
    System.out.print("\nGustavo Enrico - O Mano");
    System.out.print("\nJoão Vitor Veras - O Tigas");
    System.out.print("\nMatheus Araujo - O Candelabro");
    System.out.print("\nPaulo Henrique Tenório - Prefeito");
    System.out.print("\nRoberto Luiz Maciel Miranda - O Betin");
    break;
    
    case 4:
    System.out.print("Opção: Sair");
    System.out.print("\nDeseja sair mesmo?\n");
    System.out.print("\nSe sim digite 2 para sair\n");
    lçrepeat = entrada.nextInt();
    if(lçrepeat==2){
        System.exit(0);
    }
    break;
    
    default:
    System.out.print("Opção invalida.");
    break;
    // colchete while
    }
    }
}
}