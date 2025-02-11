package AtividadeEmSala;

public class Funcionario {
    private String nome;
    private int salario;
    private String metodosAumentoSalario;

    public Funcionario(String nome, int salario, String metodosAumentoSalario) {
        this.nome = nome;
        this.salario = salario;
        this.metodosAumentoSalario = metodosAumentoSalario;
    }

    public double aumentoDeSalario() {
        return salario += salario;
    }

    public void exibirDados() {
        System.out.println( "Funcionario: " +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", metodosAumentoSalario='" + metodosAumentoSalario + '\''
        );
    }
}
