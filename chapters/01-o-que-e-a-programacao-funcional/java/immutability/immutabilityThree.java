
public class immutabilityThree {
  // Outra forma de evitar a mudança de estado é bem simples, imagine que
  //tenha uma classe que tenha propriedades mutáveis

  public static class Person {
    private final byte oldAge; // idade é um campo mutável
    private final String name;

    public Person(byte oldAge, String name) {
      this.oldAge = oldAge;
      this.name = name;
    }
    
  }


  // a questão aqui é como mudamos a idade sem ser reatribuindo o campo da
  // classe? 
  public static void main(String[] args) {
    Person person = new Person((byte) 31, "John"); 
    // se passa um ano

    Person personChanged = new Person((byte) 32, person.name);

    System.out.println(personChanged);

    // ao vez de alterarmos o valor de age do objeto person, criamos um novo
    // com os campos atualizados. 
    
  }
}