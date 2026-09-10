class immutabilityTwo {
   static void main(String[] args) {
     // Usando programação procedural, como podemos refazer a contagem do 0 ao 99?

     // Usando recursão
        countTo90(0);
   } 

  static void countTo90(int i) { // note que i nunca será alterado!
    if (i > 99) {
      return;
    }

    System.out.println(i);
  }
}