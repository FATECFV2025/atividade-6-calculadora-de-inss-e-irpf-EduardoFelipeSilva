public abstract class PessoaRenda implements CalculadoraTributo {

    protected String nome;
    protected String cpf;
    protected double salarioBruto;

    public PessoaRenda(String nome, String cpf, double salarioBruto) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBruto = salarioBruto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void exibirResumo() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("INSS: R$ " + String.format("%.2f", calcularINSS()));
        System.out.println("IRPF: R$ " + String.format("%.2f", calcularIRPF()));
        System.out.println("Salário Líquido: R$ " +String.format("%.2f", calcularSalarioLiquido()));
    }
}