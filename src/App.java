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
        System.out.print("\nSão 7 perguntas sobre a História dos Times e 3 dos Clássicos \n");
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
                System.out.println("\nO Corinthians completou 100 anos em qual ano?\n");
                System.out.println("\n[1] 2009");
                System.out.println("\n[2] 2010");
                System.out.println("\n[3] 2011");
                System.out.println("\n[4] 2012");
                System.out.println("\n[5] 2008\n");
                resp1 = entrada.nextInt();

                if(resp1 == 2){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\nO Corinthians fez 100 anos em 2010");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nQual foi o placar do 2º jogo pela Copa do Brasil, em 2009, que deu a taça ao Corinthians?\n");
                System.out.println("\n[1] 1 x 2");
                System.out.println("\n[2] 1 x 1");
                System.out.println("\n[3] 3 x 2");
                System.out.println("\n[4] 2 x 1");
                System.out.println("\n[5] 2 x 2");
                resp1 = entrada.nextInt();
                
                if(resp1 == 5){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\nINTERNACIONAL 2X2 CORINTHIANS\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nQuem foi o artilheiro do Corinthians na campanha campeã na Copa Libertadores de 2012?\n");
                System.out.println("\n[1] Emerson Sheik");
                System.out.println("\n[2] Paulinho");
                System.out.println("\n[3] Alex");
                System.out.println("\n[4] Jorge Henrique");
                System.out.println("\n[5] Guerrero");
                resp1 = entrada.nextInt();
                
                if(resp1 == 1){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\nEmerson Sheik foi o artilheiro com 5 gols");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nO Corinthians foi fundado por um grupo de _____ ?\n");
                System.out.println("\n[1] Dentistas");
                System.out.println("\n[2] Moradores do centro de São Paulo");
                System.out.println("\n[3] Operários");
                System.out.println("\n[4] Comerciantes");
                System.out.println("\n[5] Fazendeiros\n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 3){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\no Corinthians foi fundado por operários");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nQual o nome do jogador corinthiano conhecido como Doutor?\n");
                System.out.println("\n[1] Rivelino");
                System.out.println("\n[2] Sócrates");
                System.out.println("\n[3] Marcelinho Carioca");
                System.out.println("\n[4] Neto");
                System.out.println("\n[5] Vampeta\n");
                resp1 = entrada.nextInt();

                if(resp1 == 2){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("Sócrates se formou em medicina na USP, por isso o apelido");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nEm qual ano o Corinthians ganhou seu primeiro troféu em uma competição oficial?\n");
                System.out.println("\n[1] 1910 - Campeonato Paulista");
                System.out.println("\n[2] 1990 - Campeonato Brasileiro");
                System.out.println("\n[3] 1962 - Libertadores");
                System.out.println("\n[4] 1914 - Campeonato Paulista");
                System.out.println("\n[5] 1978 - Campeonato Brasileiro\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("O título foi conquistado em 1914 de forma invicta");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                System.out.println("\nO Corinthians é o maior campeão Paulista com o total de :\n");
                System.out.println("\n[1] 28");
                System.out.println("\n[2] 31");
                System.out.println("\n[3] 27");
                System.out.println("\n[4] 30");
                System.out.println("\n[5] 29\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("O 30º e último título paulista do Corinthians foi conquistado em 2019 em cima do São Paulo");
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
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 2\n");
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    System.out.println("\n");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 3\n");
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 4\n");
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 5\n");
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 6\n");
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                System.out.println("\nPergunta 7\n");
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
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
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
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
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 3\n");
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 4\n");
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 5\n");
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 6\n");
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                System.out.println("\nPergunta 7\n");
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
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
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 2\n");
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 3\n");
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 4\n");
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 5\n");
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nPergunta 6\n");
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                System.out.println("\nPergunta 7\n");
                System.out.println("\n[1] ");
                System.out.println("\n[2] ");
                System.out.println("\n[3] ");
                System.out.println("\n[4] ");
                System.out.println("\n[5] \n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 4){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\n");
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

            // Clássicos
                case 2:
                int clássicos = 0;
                System.out.print("\n Clássicos\n");
                System.out.print("\n Escolha um dos quatro grandes\n");
                System.out.print("\n [1] Clássico Alvinegro\n");
                System.out.print("\n [2] Clássico da Saudade\n");
                System.out.print("\n [3] Choque-Rei\n");
                System.out.print("\n [4] Derby Paulista\n");
                System.out.print("\n [5] Majestoso\n");
                System.out.print("\n [6] Sansão\n");
                clássicos = entrada.nextInt();
                
                // Switch case e break para os clássicosq
                switch (clássicos){
                    case 1:
                    System.out.print("\nClássico Alvinegro\n");
            System.out.println("\nPergunta 1\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] "); 
              resp2 = entrada.nextInt();
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nPergunta 2\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] ");
            resp2 = entrada.nextInt();
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nPergunta 3\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] ");
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nSua pontuação foi de \n"+pts2);
            
                    break;
                    case 2:
                    System.out.print("\nClássico da Saudade\n");
            System.out.println("\nPergunta 1\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] "); 
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nPergunta 2\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] ");  
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nPergunta 3\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] ");           
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nSua pontuação foi de \n"+pts2);
            
                    break;
                    case 3:
                    System.out.print("\nChoque-Rei\n");
            System.out.println("\nPergunta 1\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] "); 
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nPergunta 2\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] "); 
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nPergunta 3\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] ");           
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nSua pontuação foi de \n"+pts2);
            
                    break;
                    case 4:
                    System.out.print("\nDerby Paulista\n");
            System.out.println("\nPergunta 1\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] ");   
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nPergunta 2\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] ");   
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nPergunta 3\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] ");           
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nSua pontuação foi de \n"+pts2);
            
                    break;
                    case 5:
                    System.out.print("\nMajestoso\n");
            System.out.println("\nPergunta 1\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] "); 
            resp2 = entrada.nextInt();
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nPergunta 2\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] "); 
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nPergunta 3\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] "); 
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nSua pontuação foi de \n"+pts2);
            
                    break;
                    case 6:
                    System.out.print("\nSansão\n");
            System.out.println("\nPergunta 1\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] "); 
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nPergunta 2\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] "); 
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nPergunta 3\n");
            System.out.println("\n[1] ");
            System.out.println("\n[2] ");  
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                // valor da resposta ilustrativo, será alterado conforme a alternativa
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nSua pontuação foi de \n"+pts2);

                    break;
                }
                break;

            
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