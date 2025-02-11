package AtividadeEmSala;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPulicado;

    public Livro(String titulo, String autor, int anoPulicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPulicado = anoPulicado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPulicado() {
        return anoPulicado;
    }

    public void setAnoPulicado(int anoPulicado) {
        this.anoPulicado = anoPulicado;
    }


    public String exibirInformacoes() {
        return "Livro: " +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPulicado=" + anoPulicado;
    }
}