import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow

fun main(args: Array<String>) {

    print("Digite o valor: ")
    val valor = readLine()!!.toDouble()

    val raio = valor
    val pi = 3.14159
    val area = (pi*(Math.pow(raio, 2.00))).toDouble()
    val resultado = BigDecimal(area).setScale(4, RoundingMode.HALF_EVEN)
    println("A=" + resultado)
}