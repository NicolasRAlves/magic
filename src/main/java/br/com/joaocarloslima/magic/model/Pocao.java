package br.com.joaocarloslima.magic.model;

import java.util.ArrayList;
import java.util.List;

public class Pocao {
    private int potencia = 0;
    private int estabilidade = 100;
    private boolean cheiroRuim = false;
    private boolean causaSono = false;
    private boolean efeitoMagico = false;
    private List<Ingrediente> ingredientesUsados = new ArrayList<>();

    public void misturar(Misturavel ingrediente) {
        ingrediente.misturar(this);
        if (ingrediente instanceof Ingrediente) {
            ingredientesUsados.add((Ingrediente) ingrediente);
        }
    }


    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getEstabilidade() {
        return estabilidade;
    }

    public void setEstabilidade(int estabilidade) {
        this.estabilidade = estabilidade;
    }

    public boolean isCheiroRuim() {
        return cheiroRuim;
    }

    public void setCheiroRuim(boolean cheiroRuim) {
        this.cheiroRuim = cheiroRuim;
    }

    public boolean isCausaSono() {
        return causaSono;
    }

    public void setCausaSono(boolean causaSono) {
        this.causaSono = causaSono;
    }

    public boolean isEfeitoMagico() {
        return efeitoMagico;
    }

    public void setEfeitoMagico(boolean efeitoMagico) {
        this.efeitoMagico = efeitoMagico;
    }

    public List<Ingrediente> getIngredientesUsados() {
        return ingredientesUsados;
    }
}
