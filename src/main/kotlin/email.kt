fun main() {

    val patternEmail= Regex("\\w+@gmail\\.[com]") //Exemplo utilizando um provedor fixo como gmail, para validar se não está entrado com outro modelo como icloud, ou outlook
    val emailTeste = "joaovitor@gmail.com"

    if (emailTeste.matches(patternEmail)) println("Email válido") else println("Email inválido") // Printando se o valor é realmente válido, com base no ".matches"

}