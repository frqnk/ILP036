package biblioteca;
public class Professor extends Pessoa
{ // Professor herda de Pessoa
 private String titulacao; // atributo privado
 private String dataContratacao; // atributo privado
 // Método construtor
 public Professor(String nome, String data, String titulacao, String dataContratacao) // método construtor com 4 parâmetros
 {
 // invoca o construtor da classe pai (Pessoa)
 // super é um apelido para o método construtor da classe pai (Pessoa)
 // todos os parâmetros exigidos pelo método construtor devem ser repassados
 // explicações detalhadas serão apresentadas mais abaixo nessa unidade
 super(nome, data);
 // Atribui o valor do parâmetro titulacao à variável titulacao
 this.titulacao = titulacao;
 // atribui o valor do parâmetro dataContratacao à variável dataContratacao
 this.dataContratacao = dataContratacao;
 }
 void retiraLivro( ) // método
 {
 // sem implementação no momento
 }
 // método acessor (GET) do atributo titulacao
 public String getTitulacao()
 {
 // retorna valor do atributo
 return titulacao;
 }
 // método acessor (SET) do atributo titulacao
 public void setTitulacao(String titulacao)
 {
 // atualiza atributo com o valor do parâmetro
 this.titulacao = titulacao;
 }
 // método acessor (GET) do atributo dataContratacao
 public String getDataContratacao()
 {
 // retorna valor do atributo
 return dataContratacao;
  }
 // método acessor (SET) do atributo dataContratacao
 public void setDataContratacao(String dataContratacao)
 {
 // atualiza atributo com o valor do parâmetro
 this.dataContratacao = dataContratacao;
 }
}
