fun main() {

    val patternMonetario = Regex("R\\$\\s\\d+,\\d{2}") // "\\s" referente ao espaço que será saltado entre o cifrão e o primeiro valor
    val moneterioTeste = "R$ 52,37"

    if (moneterioTeste.matches(patternMonetario)) println("Valor válido") else println("Valor inválido") // Printando se o valor é realmente válido, com base no ".matches"

}