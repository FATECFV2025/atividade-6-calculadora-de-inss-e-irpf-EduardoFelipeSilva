public class Estagiario extends PessoaRenda {

    public Estagiario(String nome, String cpf, double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    @Override
    public double calcularINSS() {
        return 0.0;
    }

    @Override
    public double calcularIRPF() {
        return 0.0;
    }

    @Override
    public double calcularSalarioLiquido() {
        return salarioBruto;
    }
}
