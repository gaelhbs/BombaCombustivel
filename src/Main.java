import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<BombaCombustivel> bombas = new ArrayList<>();
        boolean sair = false;
        int idContador = 1;

        while(!sair){
            System.out.println("1 - Adicionar bomba");
            System.out.println("2 - Editar bomba");
            System.out.println("3 - Sair");

            int opcao = new Scanner(System.in).nextInt();
            switch (opcao){
                case 1 :
                    System.out.println("Digite o id da bomba");
                    new Scanner(System.in).nextLine();
                    String idBomba;
                    System.out.println("Digite o tipo de combustivel");
                    String tipoCombustivel = scanner.nextLine();
                    System.out.println("Digite o valor do litro");
                    double valorLitro = scanner.nextDouble();
                    System.out.println("Digite a quantidade de combustivel");
                    double quantidadeCombustivel = scanner.nextDouble();
                    BombaCombustivel bomba = new BombaCombustivel(idContador++, tipoCombustivel, valorLitro, quantidadeCombustivel);
                    bombas.add(bomba);
                    System.out.println("Bomba adicionada com sucesso! ID: " + bomba.getIdBomba());
                    break;

                case 2 :
                    scanner.nextLine();
                    System.out.println("Digite o id da bomba");
                    idBomba = scanner.nextLine();
                    BombaCombustivel bombaSelecionada = null;
                    for (BombaCombustivel b : bombas){
                        if (b.getIdBomba().equals(idBomba)){
                            bombaSelecionada = b;
                            break;
                        }
                    }
                    if (bombaSelecionada != null){
                        System.out.println("1 - Editar tipo de combustivel");
                        System.out.println("2 - Editar valor do litro");
                        System.out.println("3 - Editar quantidade de combustivel");
                        System.out.println("4 - Registrar abastecimento por litro");
                        System.out.println("5 - Registrar abastecimento por valor");
                        System.out.println("6 - Voltar");
                        int opcaoEdicao = scanner.nextInt();

                        switch (opcaoEdicao){
                            case 1 :
                                System.out.println("Digite o novo tipo de combustivel");
                                scanner.nextLine();
                                tipoCombustivel = scanner.nextLine();
                                bombaSelecionada.setTipoCombustivel(tipoCombustivel);
                                System.out.println("Tipo de combustivel alterado com sucesso! Tipo atual: " + bombaSelecionada.getTipoCombustivel());
                                break;
                            case 2 :
                                System.out.println("Digite o novo valor do litro");
                                valorLitro = scanner.nextDouble();
                                bombaSelecionada.setValorLitro(valorLitro);
                                System.out.println("Valor do litro alterado com sucesso! Valor atual: " + bombaSelecionada.getValorLitro());
                                break;
                            case 3 :
                                System.out.println("Digite a nova quantidade de combustivel");
                                quantidadeCombustivel = scanner.nextDouble();
                                bombaSelecionada.setQuantidadeCombustivel(quantidadeCombustivel);
                                System.out.println("Quantidade de combustivel alterada com sucesso! Quantidade atual: " + bombaSelecionada.getQuantidadeCombustivel());
                                break;
                            case 4:
                                System.out.println("Digite a quantidade de litros");
                                double litros = scanner.nextDouble(); // Usar o scanner global
                                double valor = bombaSelecionada.abastecerPorLitro(litros);
                                System.out.println("Valor do abastecimento: " + valor);
                                break; // Garante que voltará ao menu de edição corretamente

                            case 5 :
                                System.out.println("Digite o valor do abastecimento");
                                valor = bombaSelecionada.abastecerPorValor(scanner.nextDouble());
                                litros = valor / bombaSelecionada.getValorLitro();
                                System.out.println("Quantidade de litros abastecidos: " + litros);
                                break;

                            case 6 :
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    } else {
                        System.out.println("Bomba não encontrada");
                    }
                    break;


                case 3 : sair = true;
            }
        }
    }
}