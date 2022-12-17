import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraProfissional {
    public static void main(String[] args) throws Exception {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Seja bem vindo a calculadora profissional");

            Profissional profissional = new Profissional();

            System.out.println("Informe o nome do profissional: ");
            profissional.nome = teclado.nextLine();
            System.out.println("Informe quantas horas disponíveis tem o profissional");
            profissional.qtdHorasDisponiveis = teclado.nextDouble();
            System.out.println("Informe o salário mensal desejado pelo profissonal");
            profissional.salarioMensalDesejado = teclado.nextDouble();
            teclado.nextLine();

            profissional.calculaValorHora();

            ArrayList<ItemSistema> sistemas = new ArrayList<>();

            while (true) {
                ItemSistema sistema = new ItemSistema();
                String querContinuar;
                System.out.println("Qual o tipo do programa a ser desenvolvido?");
                System.out.println("1 = Tela de Login");
                System.out.println("2 = Tela de Cadastro");
                System.out.println("3 = Tela de Pesquisa");
                System.out.println("4 = Tela de Saída");
                sistema.tipo = teclado.nextInt();

                System.out.println("Qual a complexidade desse sistema?");
                System.out.println("1, 2 ou 3");
                sistema.complexidade = teclado.nextInt();
                teclado.nextLine();

                System.out.println("Deseja acrescentar outros sistemas?");
                System.out.println("'Sim' ou 'Não'");
                querContinuar = teclado.nextLine();

                sistemas.add(sistema);

                if (!querContinuar.equals("Sim")) {
                    break;
                }
            }

            Orcamento orcamentoFinal = new Orcamento();
            orcamentoFinal.profissional = profissional;

            for (ItemSistema sistema : sistemas) {
                orcamentoFinal.totalHoras += sistema.calculaQtdHoras();
            }

            Double valorFinal = orcamentoFinal.totalHoras * orcamentoFinal.profissional.calculaValorHora();
            orcamentoFinal.valorFinal = (valorFinal * 0.3) + valorFinal;

            System.out.println("O valor final do projeto ficou em R$" + orcamentoFinal.valorFinal);
        }
    }
}
