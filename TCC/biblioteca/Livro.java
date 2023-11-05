package biblioteca; // pacote biblioteca
public class Livro { // classe Livro
 private String nome; // atributo privado
 private String editora; // atributo privado
 private String isbn; // atributo privado
 private Pessoa pessoa; // atributo privado (ASSOCIACAO)
 // Método construtor
 public Livro (String nome, String editora, String isbn)
 {
 // Atribui o valor do parâmetro nome à variável nome
 this.nome = nome;
 // atribui o valor do parâmetro editora à variável editora
 this.editora = editora;
 // atribui o valor do parâmetro editora à variável isbn
 this.isbn = isbn;
 }
 // método que associa um Livro a uma Pessoa
 void emprestaLivro( Pessoa pessoa )
 {
 if (pessoa != null) { // verifica se objeto existe
 this.pessoa = pessoa; // vincula objeto pessoa ao atributo pessoa
 pessoa.addLivro( this ); // chama método que adiciona livro ao objeto pessoa
 }
 }
 public String getNome() // método acessor (GET) do atributo nome
 {
 return nome; // retorna valor do atributo
 }
 public void setNome(String nome) // método acessor (SET) do atributo nome
 {
 this.nome = nome; // atualiza atributo com o valor do parâmetro
 }
 public String getEditora() // método acessor (GET) do atributo editora
 {
 return editora; // retorna valor do atributo
 }
 public void setEditora(String editora) // método acessor (SET) do atributo editora
 {
 this.editora = editora; // atualiza atributo com o valor do parâmetro
 }
 public String getIsbn() // método acessor (GET) do atributo isbn
 {
 return isbn; // retorna valor do atributo
 }
 public void setIsbn(String isbn) // método acessor (SET) do atributo isbn
 {
 this.isbn = isbn; // atualiza atributo com o valor do parâmetro
 }
 public Pessoa getPessoa() // método acessor (GET) do atributo pessoa
 {
 return pessoa; // retorna valor do atributo
 }
 // método acessor (SET) do atributo pessoa
 public void setPessoa(Pessoa pessoa)
 {
 this.pessoa = pessoa; // atualiza atributo com o valor do parâmetro
 }
 // método que desassocia do Livro a Pessoa
 public void devolveLivro() {
 setPessoa( null ); // chama metodo com valor null
 }
 // mostra o nome da pessoa que retirou o livro
 public void comQuemEsta() {
 if (pessoa != null) { // verifica se existe pessoa associada ao livro
 System.out.println("O livro "+nome+" esta com: "+pessoa.getNome());
 } else { // não tem livro associado
 System.out.println("O livro "+nome+" esta disponivel para retirada.");
 }
 }
 // método que verifica se livro esta disponivel
 public boolean livroDisponivel( ) {
 if (pessoa != null) return false; // atualiza atributo com valor null
 return true;
 }
 // método que mostra os valores dos atributos do livro
 public void mostrar() {
 System.out.println("Nome :" + nome);
 System.out.println("Editora :" + editora);
 System.out.println("ISBN :" + isbn);
 }
}