import java.util.Scanner;

public class AppFolhaPagamento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Salário bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.println("Tipo de contribuinte:");
        System.out.println("1 - Funcionário CLT");
        System.out.println("2 - Estagiário");
        System.out.println("3 - Prestador de Serviço (PJ)");
        int tipo = sc.nextInt();

        PessoaRenda pessoaRenda;

        switch (tipo) {
            case 1:
                pessoaRenda = new FuncionarioCLT(nome, cpf, salarioBruto);
                break;
            case 2:
                pessoaRenda = new Estagiario(nome, cpf, salarioBruto);
                break;
            case 3:
                pessoaRenda = new PrestadorServico(nome, cpf, salarioBruto);
                break;
            default:
                System.out.println("Numero inválido");
                sc.close();
                return;
        }

        pessoaRenda.exibirResumo();

        sc.close();
    }
}
