public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private String genero;
    private int duracaoEmMinutos;
    private String diretor;

    public Titulo(String nome, int anoDeLancamento, String genero, int duracaoEmMinutos, String diretor) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.genero = genero;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.diretor = diretor;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public String getDiretor() {
        return diretor;
    }

}
