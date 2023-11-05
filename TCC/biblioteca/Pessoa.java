package biblioteca; // pacote biblioteca
import java.util.ArrayList; // importação da classe ArrayList
public class Pessoa { // classe Pessoa
private String nome; // atributo privado
private String dataDeNascimento; // atributo privado
private Telefone fone; // atributo que permitirá a agregação
// atributo que permitirá a associacao (armazena os livros retirados)
private ArrayList livros;
// Método construtor
public Pessoa(String nome, String data) // método construtor com dois parâmetros
{
// Atribui o valor do parâmetro nome à variável nome
this.nome = nome;
// atribui o valor do parâmetro data à variável dataDeNascimento
dataDeNascimento = data;
// cria objeto do tipo Telefone
fone = new Telefone();
// inicializa a estrutura de controle de livro retirados
livros = new ArrayList();
}
// método que associa o Livro a Pessoa
void retiraLivro( Livro livro )
{
if (livro != null) { // verifica se existe o objeto
addLivro( livro ); // adiciona o objeto livro na lista de retirados
livro.setPessoa( this ); // vincula a pessoa ao Livro
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
public String getData() // método acessor (GET) do atributo dataDeNascimento
{
return dataDeNascimento; // retorna valor do atributo
}
// método acessor (SET) do atributo dataDeNascimento
public void setData(String data)
{
dataDeNascimento = data; // atualiza atributo com o valor do parâmetro
}
public String getFone() // método acessor (GET) do atributo fone (AGREGADO)
{
return "(" + fone.getDdd() +")" + fone.getNumero() ; // retorna valor do atributo

// método acessor (SET) do atributo fone (AGREGADO)
public void setFone(String ddd, String num)
{
fone.setDdd( ddd ); // chama método que atualiza ddd
fone.setNumero( num ); // chama método que atualiza numero
}
// método que adiciona um livro na lista de livros retirados (ASSOCIACAO)
public void addLivro( Livro livro )
{
if (livro != null) { // verifica se existe o parâmetro
livros.add( livro ); // adiciona o livro na lista de retirados
}
}
// método que mostra os livros vinculados a pessoa
public void listaLivrosRetirados( )
{
// verifica se lista existe e se tem objetos
if (livros != null && livros.size() > 0 ) {
Livro livro; // variavel que recebera livro da lista
System.out.println("Livros retirados por "+nome+" :");
// percorre toda a lista de livros
for(int aux = 0; aux < livros.size(); aux++)
{
// pega o proximo objeto da lista de livros
livro = (Livro)livros.get(aux);
System.out.println("LIVRO - "+(aux+1)+":");
// imprime os valores do livro
livro.mostrar();
}
} else { // Não existem livros associados a pessoa
System.out.println(nome+" nao tem livro(s) retirado(s).");
}
}
// método que retira vinculo de livro com pessoa
public void devolveLivro( Livro livroDevolvido )
{
// verifica se lista existe e se tem objetos
if (livros != null && livros.size() > 0 ) {
Livro livro; // variavel que recebera livro da lista
// percorre toda a lista de livros
for(int aux = 0; aux < livros.size(); aux++)
{
// pega o proximo objeto da lista de livros
livro = (Livro)livros.get(aux);
if ( livro.getIsbn().equals( livroDevolvido.getIsbn() ) ) {
// retira objeto da lista
livros.remove(aux);
// desassocia livro de pessoa
livroDevolvido.devolveLivro();
}
}
}
}
// mostra os valores dos atributos da pessoa
public void mostrar()
{
System.out.println("Nome :" + nome);
System.out.println("Data Nascimento :" + dataDeNascimento);
}
}