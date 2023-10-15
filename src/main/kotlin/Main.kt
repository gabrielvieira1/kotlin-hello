fun main() {
//  Controle de fluxo - When
    println(bonusWhen("Estagiario"))
    bonusRange(30)

//    Controle de fluxo if
//    val num = 10
//    saudacao(true)
//    if (num > 20)
//        println("Número maior que 20")
//    else
//        println("Número menor que 20")
}

fun bonusWhen(cargo: String): Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de software" -> 1000f
        "Estagiario" -> 500f
        else -> 0f
    }
}

fun bonusRange(cargo: Int) {
    when (cargo) {
        in 1..10 -> println("1..10")
        in 10..100 -> println("10..100")
        in 100..1000 -> println("100..1000")
    }
}

fun saudacao(dia: Boolean) = if (dia) { println("Bom dia") } else { println("Boa noite") }

