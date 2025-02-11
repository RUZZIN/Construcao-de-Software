package AtividadeEmSala;

public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, int salario, String metodosAumentoSalario, String departamento) {
        super(nome, salario, metodosAumentoSalario);
        this.departamento = departamento;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Departamento: " + departamento);
    }
}
