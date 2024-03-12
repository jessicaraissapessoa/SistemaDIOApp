package br.com.jessicaraissapessoa.sistemadioapp.ui.enums

enum class NivelDificuldade {
    BASICO,
    INTERMEDIARIO,
    AVANCADO;

    override fun toString() : String {
        return when (this) {
            BASICO -> "Básico"
            INTERMEDIARIO -> "Intermediário"
            AVANCADO -> "Avançado"
        }
    }
}