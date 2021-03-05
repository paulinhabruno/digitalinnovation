package one.digitalInovation.digionebank

class Pessoa {
     var nome: String = "Jether"
     var cpf: String = "123.123.123-11"

     inner class Endereco {
        var rua: String = "Rua teste"
     }
}

fun main() {
     val jether = Pessoa()

     println(jether.nome)
     println(jether.cpf)

     println(jether.Endereco().rua)
}