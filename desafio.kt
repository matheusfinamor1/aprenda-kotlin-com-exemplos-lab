// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class NivelDaFormacao { BRONZE, PRATA, OURO }

enum class NivelDoAluno { BASICO, INTERMEDIARIO, AVANÇADO }

data class Usuario(val nome: String, val idade: Int, var nivel: NivelDoAluno)

data class ConteudoEducacional(val nome: String, var duracao: Int)

data class Formacao(
    val nome: String,
    val conteudos: List<ConteudoEducacional>,
    val usuarios: List<Usuario>,
    var nivelDaFormacao: NivelDaFormacao) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    
}

fun main() {
    
    val usuarios: MutableList<Usuario> =
    	mutableListOf(
            Usuario(
                nome = "Matheus",
                idade = 20,
                NivelDoAluno.INTERMEDIARIO
            ),
            Usuario(
                nome = "Ana",
                idade = 29,
                NivelDoAluno.BASICO
            )
        )
    
    val conteudosEducacionais: MutableList<ConteudoEducacional> =
    mutableListOf(
        ConteudoEducacional(
            nome = "LP",
            duracao = 35
        ),
    	ConteudoEducacional(
            nome = "IA",
         	duracao = 60
        )
    )
    
    
    val formacao = Formacao(
        "Ciência da Computacao",
        conteudosEducacionais,
        usuarios,
        NivelDaFormacao.PRATA
    )
    println("$formacao")
    
    
}