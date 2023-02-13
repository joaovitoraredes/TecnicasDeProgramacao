package formulario
import formulario.Paineis.*

val cliente = Cliente(nome = "", sobrenome = "", idade = "", cpf = "", telefone = "", email = "")

class Cadastro {

    init {
        println(PRINCIPAL.menu)
        cadastroNome()
        cadastroSobreNome()
        cadastroIdade()
        cadastroCpf()
        cadastroTelefone()
        cadastroEmail()
    }

    private fun cadastroNome() {

        //pattern
        val patternNome = Regex("[a-zA-Zá-úÁ-Ú]+")

        //Imput usuário
        print("Qual seu nome (Somente letras sem espaço): ")
        cliente.nome = readln()

        //Validação regex
        if (cliente.nome.matches(patternNome))
            println("Sucesso!!")
        else{
            println("Falha!! Formato inválido!!")
            cadastroNome()
        }
    } //OK

    private fun cadastroSobreNome() {

        //pattern
        val patternSobreNome = Regex("[a-zA-Zá-úÁ-Ú]+")

        //Imput usuário
        print("Sobrenome (Somente letras e sem espaço): ")
        cliente.sobrenome = readln()

        //Validação regex
        if (cliente.sobrenome.matches(patternSobreNome))
            println("Sucesso!!")
        else {
            println("Falha!! Formato inválido!!")
            cadastroSobreNome()
        }
    } //OK

    private fun cadastroIdade() {

        val patternIdade = Regex("[0-9]{2}")

        print("Qual sua idade (Somente números): ")
        cliente.idade = readln()

        if (cliente.idade.matches(patternIdade))
            println("Sucesso!!")
        else{
            println("Falha!! Formato inválido!!")
            cadastroIdade()
        }
    } //colocar somente de maior (AJUSTES) // tlvz coloque na validacao só

    private fun cadastroCpf() {

        val patternCPF = Regex("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}") // Pode ser escrito utilizando o "d" para representação de digitos

        print("Cpf nnn.nnn.nnn-nn: ")
        cliente.cpf = readln()

        if (cliente.cpf.matches(patternCPF))
            println("Sucesso!!")
        else{
            println("Falha!! Formato inválido!!")
            cadastroCpf()
        }
    }

    private fun cadastroTelefone() {

        val patternTelefone= Regex("\\(\\d{2}\\)\\s9\\d{4}-\\d{4}") // É possível retirarmos os colchetes "[\\d]" e utilizar somente \\d, apesar de não ser tão "clean" visualmente

        print("Telefone (nn) 9nnnn-nnnn: ")
        cliente.telefone = readln()

        if(cliente.telefone.matches(patternTelefone))
            println("Sucesso!!")
        else{
            println("Falha!! Formato inválido!!")
            cadastroTelefone()
        }
    }

    private fun cadastroEmail() {

        val patternEmail= Regex("[0-9a-zA-Z._]+@[a-z]+.com")

        print("Email (Email@provedor.com): ")
        cliente.email = readln()

        if(cliente.email.matches(patternEmail))
            println("Sucesso!!")
        else{
            println("Falha!! Formato inválido!!")
            cadastroEmail()
        }
    }

}