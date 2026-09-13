// isso não é uma função pura

object Main extends App {
  def impureFunction(x: Int) : Int = {
    import scala.util.Random
    return Random.nextInt(100) + x
  }

  println(impureFunction(5))
  println(impureFunction(8))
  
}

// Pois mesmo que adicionarmos a entrada 5, o resultado será diferente para casa execução. Além de não alterar estado ou interagir com algo externo a ela mesmo. Como uma variável global ou escrever em um arquivo.
