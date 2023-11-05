package biblioteca;
public class Telefone { // classe Telefone
 private String ddd; // atributo privado
 private String numero; // atributo privado
 // Método construtor
 public Telefone (String ddd, String numero) // método construtor com 2 parâmetros
 {
 // Atribui o valor do parâmetro ddd à variável ddd
 this.ddd = ddd;
 // atribui o valor do parâmetro numero à variável numero
 this.numero = numero;
 }
 // Método construtor vazio (cria objeto com valores null)
 public Telefone () // método construtor sem parâmetros
 {
 }
 public String getDdd() // método acessor (GET) do atributo ddd
 {
 return ddd; // retorna valor do atributo
  }
 public void setDdd(String ddd) // método acessor (SET) do atributo ddd
 {
 this.ddd = ddd; // atualiza atributo com o valor do parâmetro
 }
 public String getNumero() // método acessor (GET) do atributo numero
 {
 return numero; // retorna valor do atributo
 }
 public void setNumero(String numero) // método acessor (SET) do atributo numero
 {
 this.numero = numero; // atualiza atributo com o valor do parâmetro
 }
}
