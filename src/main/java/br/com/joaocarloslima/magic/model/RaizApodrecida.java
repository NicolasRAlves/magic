package br.com.joaocarloslima.magic.model;

public class RaizApodrecida extends Ingrediente{
    public RaizApodrecida(int id, String nome, String imagem, String descricao) {
        super(id, nome, imagem, descricao);
    }

    @Override
    public void misturar(Pocao pocao) {
        pocao.setPotencia(pocao.getPotencia() + 20);
        pocao.setCheiroRuim(true);
    }
}
