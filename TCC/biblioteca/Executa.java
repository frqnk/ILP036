package biblioteca;

class Executa
{ // classe de testes
 public static void main(String args[])
 { // método que executa programa
 // criação de um objeto do tipo “Pessoa”
 Pessoa jose = new Pessoa("Jose","01/06/1975");
 // exibição dos atributos do objeto jose
 System.out.println("Nome = " + jose.getNome() + " - Data de Nascimento = " + jose.getData() );
// criação de um objeto do tipo “Aluno”
 Aluno maria = new Aluno("Maria","10/11/1976","111111","Computacao");

 // atribui valores ao telefone de maria
 maria.setFone("019","98765432");
 
 // exibição dos atributos do objeto maria
 System.out.println("Nome = " + maria.getNome() + " - Data de Nascimento = " + maria.getData() + " - RA = " + maria.getRa() + "- Curso = " + maria.getCurso() );
 
 // exibe o telefone de maria
 System.out.println("Telefone de " + maria.getNome() + " = " + maria.getFone());
 
 // criação de um objeto do tipo “Professor”
 Professor pedro = new Professor("Pedro","05/05/1970","Mestre","02/02/2007");
 
 // atribui valores ao telefone de pedro
 pedro.setFone("019","12345678");
 
 // exibição dos atributos do objeto pedro
 System.out.println("Nome = " + pedro.getNome() + " - Data de Nascimento = " + pedro.getData() + " - Titulacao = " + pedro.getTitulacao() + " - Contratado em = " + pedro.getDataContratacao() );

 // exibe o telefone de pedro
 System.out.println("Telefone de " + pedro.getNome() + " = " + pedro.getFone());

}
}
