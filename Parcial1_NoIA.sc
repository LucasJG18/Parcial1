//Preg. 1
def myMethod(datos: List[Double]): Double = {
  var logs: List[Double] = datos.map(math.log(_))
  var sumaLogs: Double = logs.sum
  var promedioLog: Double = sumaLogs/logs.size
  var sumaCua: Double = Math.sqrt(logs.map(_*1)-promedioLog).sum
  Math.sqrt(sumaCua/logs.size)
}

//Preg. 2
def cambioP(precios: List[Double], f: Double => Double): Double => Double = f

//Preg. 3
def generadorIncrementador(incremento: Int): Int => x + incremento