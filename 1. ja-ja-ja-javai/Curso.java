public class Curso {
    private String nome;
    private String sigla;
    private String area;

    public Curso(String nome, String sigla, String area) {
        this.nome = nome;
        this.sigla = sigla;
        this.area = area;
    }

    public void ExibeInformações() {
        System.out.println("nome: "+nome);
        System.out.println("sigla: "+sigla);
        System.out.println("area: "+area);
    }
}