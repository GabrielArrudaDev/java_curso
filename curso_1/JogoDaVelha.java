package curso_1;
import java.util.Scanner;

public class JogoDaVelha {
        static char[][] tabuleiro = new char[3][3]; // matriz que representa o tabuleiro
        static char jogadorAtual = 'X'; // jogador atual começa com 'X'

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // preenche o tabuleiro com espaços em branco
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tabuleiro[i][j] = ' ';
                }
            }

            // loop principal do jogo
            while (!verificarVitoria('X') && !verificarVitoria('O')) {
                exibirTabuleiro();
                jogar(scanner);
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X'; // troca o jogador atual
            }

            exibirTabuleiro();
            System.out.println("O jogador " + jogadorAtual + " venceu!");

            scanner.close();
        }

        // método para exibir o tabuleiro na tela
        public static void exibirTabuleiro() {
            System.out.println("  1 2 3");
            System.out.println(" -------");
            for (int i = 0; i < 3; i++) {
                System.out.print((i+1) + "|");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + "|");
                }
                System.out.println();
                System.out.println(" -------");
            }
        }

        // método para receber a jogada do jogador atual
        public static void jogar(Scanner scanner) {
            int linha, coluna;
            System.out.println("Jogador " + jogadorAtual + ", é sua vez.");
            do {
                System.out.print("Digite a linha (1 a 3): ");
                linha = scanner.nextInt() - 1;
                System.out.print("Digite a coluna (1 a 3): ");
                coluna = scanner.nextInt() - 1;
            } while (!validarJogada(linha, coluna)); // repete enquanto a jogada não for válida
            tabuleiro[linha][coluna] = jogadorAtual;
        }

        // método para validar a jogada do jogador atual
        public static boolean validarJogada(int linha, int coluna) {
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Jogada inválida. Tente novamente.");
                return false;
            }
            if (tabuleiro[linha][coluna] != ' ') {
                System.out.println("Esta posição já está ocupada. Tente novamente.");
                return false;
            }
            return true;
        }

        // método para verificar se há um vencedor
        public static boolean verificarVitoria(char jogador) {
            // verifica nas linhas
            for (int i = 0; i < 3; i++) {
                if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                    return true;
                }
            }


                // verifica nas colunas
                for (int j = 0; j < 3; j++) {
                    if (tabuleiro[0][j] == jogador && tabuleiro[1][j] == jogador && tabuleiro[2][j] == jogador) {
                        return true;
                    }
                }
                // verifica nas diagonais
                if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
                    return true;
                }
                if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
                    return true;
                }
                return false;
            }

        }




