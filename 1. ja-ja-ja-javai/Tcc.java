public class Tcc {
    private String titulo;
    private int ano;
    private String situacao;
    private float nota;

    public Tcc(String titulo, int ano, String situacao, float nota) {
        this.titulo = titulo;
        this.ano = ano;
        this.situacao = situacao;
        this.nota = nota;
    }

    public void ExibeInformações() {
        System.out.println("titulo "+titulo);
        System.out.println("ano "+ano);
        System.out.println("situacao "+situacao);
        System.out.println("nota "+nota);
    }
}
