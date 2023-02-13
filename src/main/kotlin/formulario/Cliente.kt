package formulario

class Cliente(
    var nome: String,
    var sobrenome: String,
    var idade: String,
    var cpf: String,
//  Talvez coloca cnpj tambem
    var telefone: String,
    var email: String
){
    override fun toString(): String {
        return """
             =========== Meus Dados  ===========
             Cliente: $nome $sobrenome
             Idade: $idade
             Cpf: $cpf
             Telefone: $telefone
             email: $email
             ======== Banco Kotlin  ========

        """.trimIndent()
    }
}