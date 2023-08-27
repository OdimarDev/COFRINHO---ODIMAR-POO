import java.util.InputMismatchException;
import java.util.Scanner;

// Classe principal - demonstra o uso do cofrinho
public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        int opcao = -1;
        // Loop para o programa ser executado enquanto a opção 0 (sair) não for selecionada
        do {
            System.out.println("========= COFRINHO APP =========");
            System.out.println("1- Adicionar moeda");
            System.out.println("2- Remover moeda");
            System.out.println("3- Listar moedas");
            System.out.println("4- Calcular total");
            System.out.println("0- Sair");
            System.out.println("=================================");
            System.out.println("Digite a opção desejada:");

            // Validação da opção do menu
            try {
                opcao = teclado.nextInt();
                if (opcao < 0 || opcao > 4) {
                    System.out.println("Opção inválida. Digite um número de opção válido.");
                    continue; // Volta ao início do loop
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Digite um número de opção válido.");
                teclado.next(); // Limpa o buffer do Scanner
                continue; // Volta ao início do loop
            }

            switch (opcao) {
                case 1:
                    // Caso a opção 1 seja selecionada, apresenta os tipos de moedas que podem ser adicionados e utiliza o método adicionarMoeda da respectiva classe
                    System.out.println("Digite a moeda que deseja adicionar:");
                    System.out.println("1- Real");
                    System.out.println("2- Dólar");
                    System.out.println("3- Euro");
                    int tipo = 0;
                    
                    //Validação do tipo
                    try {
                        tipo = teclado.nextInt();
                    } catch (InputMismatchException ex) {
                        System.out.println("Tipo inválido. Digite um número válido para o tipo de moeda.");
                        teclado.next(); // Limpa o buffer do Scanner
                        break;
                    }
                    if (tipo > 0 && tipo <= 3) {
                        System.out.println("Digite o valor da moeda:");
                        double valor = 0;
                        
                        //Validação do valor
                        try {
                            valor = teclado.nextDouble();
                        } catch (InputMismatchException ex) {
                            System.out.println("Valor inválido. Digite um número válido para o valor da moeda.");
                            teclado.next(); // Limpa o buffer do Scanner
                            break;
                        }
                        //Adiciona as moedas
                        if (valor > 0) {
                            if (tipo == 1) {
                                cofrinho.adicionarMoeda(new Real(valor));
                                System.out.println("Moeda de " + valor + " reais adicionada ao cofrinho");
                            } else if (tipo == 2) {
                                cofrinho.adicionarMoeda(new Dolar(valor));
                                System.out.println("Moeda de " + valor + " dólares adicionada ao cofrinho");
                            } else {
                                cofrinho.adicionarMoeda(new Euro(valor));
                                System.out.println("Moeda de " + valor + " euros adicionada ao cofrinho");
                            }
                        } else {
                            System.out.println("Valor inválido. O valor da moeda deve ser maior que zero.");
                        }
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    // Caso a opção 2 seja selecionada verifica se o cofrinho esta vazio e lista as moedas no cofrinho e solicita o índice da moeda que deseja remover, e em seguida utiliza o método removerMoeda
                    if (cofrinho.tamanhoLista() == 0) {
                        System.out.println("O cofrinho está vazio. Não é possível remover moedas.");
                        break;
                    }
                    System.out.println("Moedas no cofrinho:");
                    cofrinho.listarMoedas();
                    System.out.println("Digite o índice da moeda que deseja remover:");
                    int indice = 0;
                    //Validação do indice
                    try {
                        indice = teclado.nextInt() - 1;
                    } catch (InputMismatchException ex) {
                        System.out.println("Índice inválido. Digite um número válido para o índice da moeda.");
                        teclado.next(); // Limpa o buffer do Scanner
                        break;
                    }
                    //Remove a moeda
                    int tamanho = cofrinho.tamanhoLista();
                    if (indice >= 0 && indice < tamanho) {
                        cofrinho.removerMoeda(indice);
                        System.out.println("Moeda " + (indice + 1) + " removida");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 3:
                    // Caso a opção 3 seja selecionada verifica se o cofrinho esta vazio e lista as moedas no cofrinho
                    if (cofrinho.tamanhoLista() == 0) {
                        System.out.println("O cofrinho está vazio. Não há moedas para listar.");
                        break;
                    }
                    System.out.println("Moedas no cofrinho:");
                    cofrinho.listarMoedas();
                    break;

                case 4:
                    // Caso a opção 4 seja selecionada e o cofrinho não estiver vazio, utiliza o método calcularTotal para calcular o valor total em reais no cofrinho
                    if (cofrinho.tamanhoLista() == 0) {
                        System.out.println("O cofrinho está vazio. Não há moedas para calcular o total.");
                        break;
                    }
                    System.out.printf("Total no cofrinho: R$ %.2f\n", cofrinho.calcularTotal());
                    break;

                case 0:
                    // Caso a opção 0 seja selecionada, encerra o programa
                    System.out.println("Encerrando o programa. Obrigado!");
                    break;

                default:
                    // Caso um número de opção inválido seja digitado
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        teclado.close();
    }
}