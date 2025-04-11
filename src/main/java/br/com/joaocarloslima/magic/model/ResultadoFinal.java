package br.com.joaocarloslima.magic.model;


public enum ResultadoFinal {
    EXPLODIU("A poção explodiu em uma nuvem roxa! 💥"),
    FEDOR_MAGICO("Um cheiro horrível invadiu a torre! 💨"),
    MAGO_DORMIU("Zzzzz... O mago dormiu antes de terminar a aula. 😴"),
    SUCESSO("A poção brilhou com energia mágica! ✨"),
    FRACA("A poção ficou muito fraca... parecia só chá. 🍵"),
    NORMAL("Nada demais aconteceu. Talvez funcione com um gato. 🐱");

    private final String descricao;

    ResultadoFinal(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
} 

