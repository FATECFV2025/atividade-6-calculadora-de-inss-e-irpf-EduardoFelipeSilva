public class PrestadorServico extends PessoaRenda {

    public PrestadorServico(String nome, String cpf, double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    @Override
    public double calcularINSS() {
        return 0.0;
    }

    @Override
    public double calcularIRPF() {
        return salarioBruto * 0.20;
    }

    @Override
    public double calcularSalarioLiquido() {
        return salarioBruto - calcularINSS() - calcularIRPF();
    }
}
