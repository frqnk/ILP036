package biblioteca;
public class Aluno extends Pessoa
{ // Aluno herda de Pessoa
 private String ra; // atributo privado
 private String curso; // atributo privado
 // Método construtor
 public Aluno(String nome, String data, String ra, String curso) // método construtor com 4 parâmetros
 {
 // invoca o construtor da classe pai (Pessoa)
 // super é um apelido para o método construtor da classe pai (Pessoa)
 // todos os parâmetros exigidos pelo método construtor devem ser repassados
 // explicações detalhadas serão apresentadas mais abaixo nessa unidade
 super(nome, data);
 // Atribui o valor do parâmetro ra à variável ra
 this.ra = ra;
 // atribui o valor do parâmetro curso à variável curso
 this.curso = curso;
 }
 void retiraLivro( ) // método
 {
 // sem implementação no momento
 }
 public String getRa() // método acessor (GET) do atributo ra
 {
 return ra; // retorna valor do atributo
 }
 public void setRa(String ra) // método acessor (SET) do atributo ra
 {
 this.ra = ra; // atualiza atributo com o valor do parâmetro
 }
 public String getCurso() // método acessor (GET) do atributo curso
 {
 return curso; // retorna valor do atributo
 }
 public void setCurso(String curso) // método acessor (SET) do atributo curso
 {
 this.curso = curso; // atualiza atributo com o valor do parâmetro
 }
}