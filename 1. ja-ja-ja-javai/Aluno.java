public class Aluno {
    private String nome;
    private String ra;

    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public void ExibeInformações() {
        System.out.println("nome: "+nome);
        System.out.println("ra: "+ra);
    }
}