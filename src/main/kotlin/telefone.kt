fun main() {
    val patternTelefone= Regex("\\(\\d{2}\\)\\s9\\d{4}-\\d{4}") // É possível retirarmos os colchetes "[\\d]" e utilizar somente \\d, apesar de não ser tão "clean" visualmente
    val telefoneTeste = "(31) 93192-1523"

    if (telefoneTeste.matches(patternTelefone)) println("Telefone válido") else println("Telefone inválido") // Printando se o valor é realmente válido, com base no ".matches"
}