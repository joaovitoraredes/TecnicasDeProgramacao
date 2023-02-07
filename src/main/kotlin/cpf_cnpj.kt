fun main() {

    val cpfTeste = "147.683.636-10" // Cpf para testar a validação
    val cnpjTeste = "12.123.123/1234-12" // Cnpj para testar a validação

    if (validarCPF(cpfTeste)) println("Cpf válido") else println("Cpf inválido") // If e Else para printar se os cpf é válido
    if (validarCNPJ(cnpjTeste)) println("CNPJ válido") else println("CNPJ inválido") // If e Else para printar se os cnpj é válido

}

// Funções para validação
fun validarCPF(cpf: String): Boolean{
    val patternCPF = Regex("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}") // Pode ser escrito utilizando o "d" para representação de digitos
    return cpf.matches(patternCPF)
}

fun validarCNPJ(cnpj: String): Boolean{
    val patternCNPJ = Regex("[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}/[0-9]{4}-[0-9]{2}") // Ou podemos trabalhar utilizando os ranges de valores válidos
    return cnpj.matches(patternCNPJ)
}