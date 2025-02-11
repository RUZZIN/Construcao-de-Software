package AtividadeEmSala;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("As fazes da lua", "Zacarias", 2099);
        System.out.println(livro.exibirInformacoes());

        Funcionario gerente = new Gerente("Judas", 5754,"Não tem aumento", "RH");
        gerente.exibirDados();
    }
}