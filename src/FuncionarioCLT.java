public class FuncionarioCLT extends PessoaRenda {

    public FuncionarioCLT(String nome, String cpf, double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    @Override
    public double calcularINSS() {
        return salarioBruto * 0.11;
    }

    @Override
    public double calcularIRPF() {
        if (salarioBruto > 2500) {
            return salarioBruto * 0.15;
        }
        return 0.0;
    }

    @Override
    public double calcularSalarioLiquido() {
        return salarioBruto - calcularINSS() - calcularIRPF();
    }
}
