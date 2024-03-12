package br.com.jessicaraissapessoa.sistemadioapp.ui.enums

enum class TipoConteudo {
    CURSO,
    DESAFIOCODIGO,
    DESAFIOPROJETO;

    override fun toString(): String {
        return when (this) {
            CURSO -> "Curso"
            DESAFIOCODIGO -> "Desafio de código"
            DESAFIOPROJETO -> "Desafio de projeto"
        }
    }
}