//Preg. 1

//PROMPT: De acuerdo al enunciado de la pregunta 1, corrige y/o completa mi codigo, de manera funcional
/*Mi codigo => */
def myMethod(datos: List[Double]): Double = {
  val logs: List[Double] = datos.map(math.log(_))
  val sumaLogs: Double = logs.sum
  val promedioLog: Double = sumaLogs/logs.size
  val sumaCua: Double = Math.sqrt(logs.map(_*1)-promedioLog).sum
  Math.sqrt(sumaCua/logs.size)
}
/*Codigo corregido por IA => */
def myMethodIA(datos: List[Double]): Double = {
  val logs = datos.map(math.log)
  val promedioLog = logs.sum / logs.size
  val sumaCuadrados = logs.map(l => math.pow(l - promedioLog, 2)).sum
  math.sqrt(sumaCuadrados / logs.size)
}

//Preg. 2

//PROMPT: De acuerdo al enunciado de la pregunta 2, corrige y/o completa mi codigo de manera funcional
/*Mi codigo => */def cambioP(precios: List[Double], f: Double => Double): Double => Double = f
/*Codigo corregido por IA => */def cambioPIA(precios: List[Double], f: Double => Double): List[Double] = precios.map(f)

//Preg. 3

//PROMPT: De acuerdo al enunciado de la pregunta 3, corrige y/o completa mi codigo de manera funcional
/*Mi codigo => */def generadorIncrementador(incremento: Int): Int => x + incremento
/*Codigo corregido por IA => */def generadorIncrementadorIA(incremento: Int): Int => Int = x => x + incremento
