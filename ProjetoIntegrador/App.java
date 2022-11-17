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
                System.out.println("\nO Palmeiras antes era chamado de Palestra Itália, e teve que mudar seu nome. Qual foi o ano dessa mudança?\n");
                System.out.println("\n[1] 1939");
                System.out.println("\n[2] 1940");
                System.out.println("\n[3] 1941");
                System.out.println("\n[4] 1942");
                System.out.println("\n[5] 1927\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    System.out.println(nome+", você acertou");
                    System.out.println("\nPor conta do período de Guerra Mundial na Europa, o nome Palestra Itália teve que ser substituido");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nO Palmeiras participou de 6 finais de Libertadores mas ganhou 3. Os times que o Palmeiras bateu na final foram:\n");
                System.out.println("\n[1] Deportivo Cali, Santos e Flamengo");
                System.out.println("\n[2] Boca Juniors, Santos e Flamengo");
                System.out.println("\n[3] River Plate, Santos e Flamengo");
                System.out.println("\n[4] América de Cali, Santos e Flamengo");
                System.out.println("\n[5] Olimpia, Santos e Flamengo\n");
                resp1 = entrada.nextInt();

                if(resp1 == 1){
                    System.out.println(nome+", você acertou");
                    System.out.println("Deportivo Cali em 1999 em pleno Parque Antártica, Santos em 2020 em pleno Maracanã e Flamengo em 2021");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    System.out.println("\n");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nQuais são os mascotes do Palmeiras?\n");
                System.out.println("\n[1] Porco e Papagaio");
                System.out.println("\n[2] Porco e Flamingo");
                System.out.println("\n[3] Periquito e Porco");
                System.out.println("\n[4] Periquito e Papagaio");
                System.out.println("\n[5] Baleia e Urubu\n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 3){
                    System.out.println(nome+", você acertou");
                    System.out.println("\n O primeiro mascote foi o Periquito, e adoção do porco veio após campanha de marketing na década de 80 por João Roberto Gobbato");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nOs técnicos que tiveram mais títulos sob comando do clube foram:\n");
                System.out.println("\n[1] Felipão, Luxemburgo e Abel Ferreira");
                System.out.println("\n[2] Humberto Cabelli, Luxemburgo e Abel Ferreira");
                System.out.println("\n[3] Humberto Cabelli, Felipão e Cuca");
                System.out.println("\n[4] Oswaldo Brandão, Luxemburgo e Abel Ferreira");
                System.out.println("\n[5] Oswaldo Brandão, Luxemburgo e Ventura Cambon\n");
                resp1 = entrada.nextInt();

                if(resp1 == 5){
                    System.out.println(nome+", você acertou");
                    System.out.println("\nOswaldo com 10, Luxemburgo com 8 e Cambon com 7");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nA era mais vitoriosa do Palmeiras é a era:\n");
                System.out.println("\n[1] Parmalat");
                System.out.println("\n[2] Academia de 60");
                System.out.println("\n[3] Academia de 70");
                System.out.println("\n[4] Crefisa");
                System.out.println("\n[5] FIAT\n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 1){
                    System.out.println(nome+", você acertou");
                    System.out.println("\nA era Parmalat trouxe 11 títulos seguido da Crefisa (até o momento) com 10 títulos conquistados");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nQual é o maior ídolo (estatísticas em consideração) do Palmeiras no século XXI e está entre os 5 de todos os tempos? \n");
                System.out.println("\n[1] Gustavo Gómez");
                System.out.println("\n[2] Valdívia");
                System.out.println("\n[3] Dudu");
                System.out.println("\n[4] Marcos");
                System.out.println("\n[5] Fernando Prass\n");
                resp1 = entrada.nextInt();

                if(resp1 == 3){
                    System.out.println(nome+", você acertou");
                    System.out.println("\nDudu é o ídolo com a maior marca de gols, assistências, vitórias, partidas realizadas e títulos conquistados no século 21 e na lista de todos os tempos");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                System.out.println("\nDe quem foram os gols do Palmeiras na vitória por 2 x 1 sobre o Flamengo na Libertadores de 2021?\n");
                System.out.println("\n[1] Rony e Deyverson");
                System.out.println("\n[2] Raphael Veiga e Deyverson");
                System.out.println("\n[3] Gustavo Scarpa e Deyverson");
                System.out.println("\n[4] Dudu e Deyverson");
                System.out.println("\n[5] Breno Lopes e Deyverson\n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 2){
                    // valor da resposta ilustrativo, será alterado conforme a alternativa
                    System.out.println(nome+", você acertou");
                    System.out.println("\nApós falha de Andreas Pereira, Deyverson rouba a bola e marca o gol já na prorrogação da final");
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
                System.out.println("\nQuantos títulos oficiais o Santos conquistou na década de 60, a década mais vitoriosa da história do clube?\n");
                System.out.println("\n[1] 20");
                System.out.println("\n[2] 21");
                System.out.println("\n[3] 22");
                System.out.println("\n[4] 23");
                System.out.println("\n[5] 24\n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 3){
                    System.out.println(nome+", você acertou");
                    System.out.println("\n22 títulos sendo eles 8 paulistas, 6 equivalentes ao brasileiro, 3 Rio-SP, 2 Libertadores, 1 Recopa e 2 Mundiais");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nontra qual clube Pelé marcou seu primeiro gol com a camisa do Santos?\n");
                System.out.println("\n[1] São Paulo");
                System.out.println("\n[2] Ferroviária");
                System.out.println("\n[3] Corinthians de Santo André");
                System.out.println("\n[4] Portuguesa Santista");
                System.out.println("\n[5] Bahia\n");
                resp1 = entrada.nextInt();

                if(resp1 == 3){
                    System.out.println(nome+", você acertou");
                    System.out.println("\nFoi contra o já extinto Corinthians de Santo André, Santos venceu por 7 a 1");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nEm qual país e ano, no continente africano o Santos jogou e fez parar uma guerra?\n");
                System.out.println("\n[1] Alemanha - 1943");
                System.out.println("\n[2] Rep. Dem. do Congo - 1969");
                System.out.println("\n[3] Egito - 1965");
                System.out.println("\n[4] Vietnã - 1968");
                System.out.println("\n[5] Angola - 1970\n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 2){
                    System.out.println(nome+", você acertou");
                    System.out.println("\nEm 1969, na atual Rep. Democrática do congo, parou a guerra entre Kinshasa e Brazzaville");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nEm qual ano o Santos atingiu a marca de 10 mil gols marcados?\n");
                System.out.println("\n[1] 2007");
                System.out.println("\n[2] 1995");
                System.out.println("\n[3] 2004");
                System.out.println("\n[4] 2001");
                System.out.println("\n[5] 1998\n");
                resp1 = entrada.nextInt();

                if(resp1 == 5){
                    System.out.println(nome+", você acertou");
                    System.out.println("\nEm 1998 o meia Jorginho marcou o gol 10 mil da história do clube");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nQuais foram os anos dos 3 títulos da Libertadores que o Santos tem?\n");
                System.out.println("\n[1] 1962, 1963 e 2011");
                System.out.println("\n[2] 1961, 1962 e 2011");
                System.out.println("\n[3] 1971, 1972 e 2010");
                System.out.println("\n[4] 1975, 1976 e 2012");
                System.out.println("\n[5] 1967, 1968 e 2011\n");
                resp1 = entrada.nextInt();

                if(resp1 == 4){
                    System.out.println(nome+", você acertou");
                    System.out.println("\nFoi campeão consecutivo em 1962 e 1963, o terceiro vindo em 2011");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nEm qual ano foi construído o estádio emblemático da Vila Belmiro (Estádio Urbano Caldeira)?\n");
                System.out.println("\n[1] 1913");
                System.out.println("\n[2] 1914");
                System.out.println("\n[3] 1915");
                System.out.println("\n[4] 1916");
                System.out.println("\n[5] 1917\n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 4){
                    System.out.println(nome+", você acertou");
                    System.out.println("\nA construção do Estádio Urbano Caldeira, a Vila Belmiro, foi concluída em 1916 e sua inauguração ocorreu em 12 de outubro do mesmo ano\n");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                System.out.println("\nQual foi o jogador do Santos que marcou mais gols em uma partida oficial?\n");
                System.out.println("\n[1] Neymar");
                System.out.println("\n[2] Coutinho");
                System.out.println("\n[3] Diego Ribas");
                System.out.println("\n[4] Pelé");
                System.out.println("\n[5] Madson\n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 4){
                    System.out.println(nome+", você acertou");
                    System.out.println("\nNuma partida contra o Botafogo de Ribeirão Preto, em 1964, Pelé marcou oito gols pelos Santos");
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
                System.out.println("\nO São Paulo foi campeão seguido da Libertadores em 92 e 93, naquela ocasião quem era o técnico?\n");
                System.out.println("\n[1] Rogério Ceni");
                System.out.println("\n[2] Tele Santana");
                System.out.println("\n[3] Leão");
                System.out.println("\n[4] Muricy Ramalho");
                System.out.println("\n[5] Carlos Alberto Silva\n");
                resp1 = entrada.nextInt();

                if(resp1 == 2){
                    System.out.println(nome+", você acertou");
                    System.out.println("\nTele ainda foi considerado o treinador Sul-Americano de 1992");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nQuem foi o jogador que mais atuou pelo São Paulo?\n");
                System.out.println("\n[1] Raí");
                System.out.println("\n[2] Rogério Ceni");
                System.out.println("\n[3] Miranda");
                System.out.println("\n[4] Aloísio Chulapa");
                System.out.println("\n[5] Richarlyson\n");
                resp1 = entrada.nextInt();

                if(resp1 == 2){
                    System.out.println(nome+", você acertou");
                    System.out.println("\nRogério Ceni atuou em 1237 partidas enttre 1990 e 2015");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nO título Mundial de 2005 foi conquistado em cima de qual Clube e quem fez o gol do título?\n");
                System.out.println("\n[1] Liverpool - Rogério Ceni");
                System.out.println("\n[2] Liverpool - Amoroso");
                System.out.println("\n[3] Barcelona");
                System.out.println("\n[4] Milan - Josué");
                System.out.println("\n[5] Liverpool - Mineiro\n");
                resp1 = entrada.nextInt();

                if(resp1 == 5){
                    System.out.println(nome+", você acertou");
                    System.out.println("\n O Liverpool sofreu o gol do até então volante Mineiro");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nO título de caráter nacional ou internacional mais recente que o São Paulo conquistou foi:\n");
                System.out.println("\n[1] Copa Sul Americana 2012");
                System.out.println("\n[2] Campeonato Brasileiro 2008");
                System.out.println("\n[3] Copa Sul Americana 2013");
                System.out.println("\n[4] Recopa 2013");
                System.out.println("\n[5] Recopa 2012\n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 1){
                    System.out.println(nome+", você acertou");
                    System.out.println("\nO título da Copa Sul Americana de 2012 veio em cima do Tigre da Argentina");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nO São Paulo foi fundado em 1930 pela união de duas instituições espostivas. Quais?\n");
                System.out.println("\n[1] Clube Atlético Paulistano e Associação Atlética das Palmeiras");
                System.out.println("\n[2] Clube Athetico Audax e Clube Atlético Paulistano");
                System.out.println("\n[3] Clube Atlético Albion e Esporte Clube Americano");
                System.out.println("\n[4] Clube Athletico Audax e Associação Atlética das Palmeiras");
                System.out.println("\n[5] Club Sportivo América e Esporte Clube Americano\n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 1){
                    System.out.println(nome+", você acertou");
                    System.out.println("\nAs cores vermelhas vieram dos sócios do Clube Atlético Paulistano e o preto e branco da Associação Atlética das Palmeiras");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                
                System.out.println("\nQual título acabou com o recente jejum de quase 9 anos?\n");
                System.out.println("\n[1] Copa do Brasil 2020");
                System.out.println("\n[2] Campeonato Paulista 2020");
                System.out.println("\n[3] Flórida Cup");
                System.out.println("\n[4] Campeonato Brasileiro de 2020/2021");
                System.out.println("\n[5] Campeonato Paulista 2021\n");
                resp1 = entrada.nextInt();

                if(resp1 == 5){
                    System.out.println(nome+", você acertou");
                    System.out.println("\nO título do Campeonato Paulista veio no segundo jogo contra o Palmeiras, por uma vitória de 2 x 0");
                    pts1 = pts1 + 10;
                }
                else{
                    System.out.println(nome+", você errou");
                    pts1 = pts1 + 0;
                }
                System.out.println("\nMuricy Ramalho foi tricampeão do Campeonato Brasileiro na era de pontos corridos nos anos de:\n");
                System.out.println("\n[1] 2005, 2006 e 2007");
                System.out.println("\n[2] 2007, 2008 e 2009");
                System.out.println("\n[3] 2006, 2007 e 2008");
                System.out.println("\n[4] 2004, 2005 e 2006");
                System.out.println("\n[5] 2000, 2001 e 2002\n");
                resp1 = entrada.nextInt();
                
                if(resp1 == 3){

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
                System.out.print("\n [6] San-São\n");
                clássicos = entrada.nextInt();
                
                // Switch case e break para os clássicosq
                switch (clássicos){
                    case 1:
                    System.out.print("\nClássico Alvinegro\n");
            System.out.println("\nO clássico Alvinegro é o mais antigo de São Paulo.\n");
            System.out.println("\n[1] Verdadeiro ");
            System.out.println("\n[2] Falso"); 
              resp2 = entrada.nextInt();
            if(resp2 == 1){
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nQuem é o maior vencedor do clássico Alvinegro?\n");
            System.out.println("\n[1] Santos");
            System.out.println("\n[2] Corinthians");
            resp2 = entrada.nextInt();
            if(resp2 == 2){
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\n O Santos tem menos títulos mundiais do que o Corinthians.\n");
            System.out.println("\n[1] Verdadeiro");
            System.out.println("\n[2] Falso");
             resp2 = entrada.nextInt();
            if(resp2 == 2){
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
            System.out.println("\nNa final da Libertadores disputada em 2020 entre Palmeiras e Santos, quem foi o campeão?\n");
            System.out.println("\n[1] Palmeiras");
            System.out.println("\n[2] Santos"); 
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nQual o artilheiro do clássico da Saudade?\n");
            System.out.println("\n[1] Edmundo - Palmeiras");
            System.out.println("\n[2] Pelé - Santos");  
             resp2 = entrada.nextInt();
            if(resp2 == 2){
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nO primeiro confronto na história teve um placar de 7 a 0. Quem saiu vencedor?\n");
            System.out.println("\n[1] Santos");
            System.out.println("\n[2] Palmeiras");           
            if(resp2 == 1){
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
            System.out.println("\nNo confronto Choque-Rei, os dois times tem a mesma quantidade de vitorias?\n");
            System.out.println("\n[1] Verdadeiro");
            System.out.println("\n[2] Falso"); 
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nO Palmeiras fez o São Paulo abandonar a partida por ter feito 3 a 1 no primeiro tempo\n");
            System.out.println("\n[1] Verdadeiro ");
            System.out.println("\n[2] Falso "); 
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nQuem leva vantagem no duelo mata-mata\n");
            System.out.println("\n[1] São Paulo ");
            System.out.println("\n[2] Palmeiras ");           
             resp2 = entrada.nextInt();
            if(resp2 == 2){
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
            System.out.println("\nQuem possui a vantagem de vitórias no Derby Paulista?\n");
            System.out.println("\n[1] Palmeiras");
            System.out.println("\n[2] Corinthians");   
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nQual dos dois possui mais tradição em Libertadores?\n");
            System.out.println("\n[1] Corinthians");
            System.out.println("\n[2] Palmeiras");   
             resp2 = entrada.nextInt();
            if(resp2 == 2){
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nO maior jejum sem derrotas para o rival é do:\n");
            System.out.println("\n[1] Corinthians");
            System.out.println("\n[2] Palmeiras");           
             resp2 = entrada.nextInt();
            if(resp2 == 1){
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
            System.out.println("\nQuem possui mais títulos paulistas entre São Paulo e Corinthians\n");
            System.out.println("\n[1] São Paulo");
            System.out.println("\n[2] Corinthians"); 
            resp2 = entrada.nextInt();
            if(resp2 == 2){
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nQuem possui a vantagem de vitórias no campeonato brasileiro?\n");
            System.out.println("\n[1] Corinthians");
            System.out.println("\n[2] São Paulo"); 
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nO São Paulo possui a vantagem no confronto pela Libertadores\n");
            System.out.println("\n[1] Falso");
            System.out.println("\n[2] Verdadeiro"); 
             resp2 = entrada.nextInt();
            if(resp2 == 1){
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
                    System.out.print("\nSan-São\n");
            System.out.println("\nA maior goleada da história do clássico foi:\n");
            System.out.println("\n[1] São Paulo 9 x 1 Santos");
            System.out.println("\n[2] Santos 6 x 2 São Paulo");
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nQuem leva vantagem no clássico San-São?\n");
            System.out.println("\n[1] São Paulo");
            System.out.println("\n[2] Santos"); 
             resp2 = entrada.nextInt();
            if(resp2 == 1){
                System.out.println(nome+", você acertou");
                pts2 = pts2 + 10;
            }
            else{
                System.out.println(nome+", você errou");
                pts2 = pts2 + 0;
            }
            System.out.println("\nNo século XXI o São Paulo não eliminou o Santos de nenhuma competição que disputaram nos moldes mata-mata\n");
            System.out.println("\n[1] Falso");
            System.out.println("\n[2] Verdadeiro");  
             resp2 = entrada.nextInt();
            if(resp2 == 2){
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
    System.out.print("\nÁlvaro Rocha Braga");
    System.out.print("\nFabrício Simão");
    System.out.print("\nGustavo Enrico");
    System.out.print("\nJoão Vitor Veras");
    System.out.print("\nMatheus Araujo - O Candelabro");
    System.out.print("\nPaulo Henrique Tenório");
    System.out.print("\nRoberto Luiz Maciel Miranda");
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