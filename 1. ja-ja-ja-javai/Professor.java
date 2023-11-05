public class Professor {
    private String nome;
    private String titulacao;
    private String email;

    public Professor(String nome, String titulacao, String email) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.email = email;
    }

    public void ExibeInformações() {
        System.out.println("nome "+nome);
        System.out.println("titulacao "+titulacao);
        System.out.println("email "+email);
    }
}