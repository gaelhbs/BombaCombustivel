import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        ArrayList<BombaCombustivel> bombas = new ArrayList<>();
        boolean sair = false;

        while(!sair){
            System.out.println("1 - Adicionar bomba");
            System.out.println("2 - Editar bomba");
            System.out.println("3 - Abastecer por litro");
            System.out.println("4 - Abastecer por valor");
            System.out.println("5 - Sair");

            int opcao = new Scanner(System.in).nextInt();
            switch (opcao){
                case 1 :
                    int idContador = 1;
                    System.out.println("Digite o id da bomba");
                    String idBomba = new Scanner(System.in).nextLine();
                    System.out.println("Digite o tipo de combustivel");
                    String tipoCombustivel = new Scanner(System.in).nextLine();
                    System.out.println("Digite o valor do litro");
                    double valorLitro = new Scanner(System.in).nextDouble();
                    System.out.println("Digite a quantidade de combustivel");
                    double quantidadeCombustivel = new Scanner(System.in).nextDouble();
                    BombaCombustivel bomba = new BombaCombustivel(idContador++, tipoCombustivel, valorLitro, quantidadeCombustivel);
                    bombas.add(bomba);
                    System.out.println("Bomba adicionada com sucesso! ID: " + bomba.getIdBomba());
                    break;

                case 2 :
                    System.out.println("Digite o id da bomba");
                    idBomba = new Scanner(System.in).nextLine();
                    BombaCombustivel bombaSelecionada = null;
                    for (BombaCombustivel b : bombas){
                        if (b.getIdBomba().equals(idBomba)){
                            bombaSelecionada = b;
                            break;
                        }
                    }
                    if (bombaSelecionada == null){
                        System.out.println("Bomba não encontrada");
                        break;
                    } else {
                        System.out.println("1 - Editar tipo de combustivel");
                        System.out.println("2 - Editar valor do litro");
                        System.out.println("3 - Editar quantidade de combustivel");
                        System.out.println("4 - Registrar abastecimento por litro");
                        System.out.println("5 - Registrar abastecimento por valor");
                        System.out.println("6 - Voltar");
                        int opcaoEdicao = new Scanner(System.in).nextInt();

                        switch (opcaoEdicao){
                            case 1 :
                                System.out.println("Digite o novo tipo de combustivel");
                                tipoCombustivel = new Scanner(System.in).nextLine();
                                bombaSelecionada.setTipoCombustivel(tipoCombustivel);
                                System.out.println("Tipo de combustivel alterado com sucesso!");
                                break;
                            case 2 :
                                System.out.println("Digite o novo valor do litro");
                                valorLitro = new Scanner(System.in).nextDouble();
                                bombaSelecionada.setValorLitro(valorLitro);
                                System.out.println("Valor do litro alterado com sucesso!");
                                break;
                            case 3 :
                                System.out.println("Digite a nova quantidade de combustivel");
                                quantidadeCombustivel = new Scanner(System.in).nextDouble();
                                bombaSelecionada.setQuantidadeCombustivel(quantidadeCombustivel);
                                System.out.println("Quantidade de combustivel alterada com sucesso!");
                                break;
                            case 4 :
                                System.out.println("Digite a quantidade de litros");
                                double litros = new Scanner(System.in).nextDouble();
                                double valor = bombaSelecionada.abastecerPorLitro(litros);
                                System.out.println("Valor do abastecimento: " + valor);
                                break;
                            case 5 :
                                System.out.println("Digite o valor do abastecimento");
                                valor = new Scanner(System.in).nextDouble();
                                break;

                            case 6 :
                                boolean voltar = true;

                            default:
                                System.out.println("Opção inválida");
                                break;
                        }


                    }





                case 3 :
                    System.out.println("Digite a quantidade de litros:");
                    double litros = new Scanner(System.in).nextDouble();
                    System.out.println("Digite o id da bomba:");
                    idBomba = new Scanner(System.in).nextLine();
                    BombaCombustivel bombaSelecionada = null;

            }
        }
    }
}