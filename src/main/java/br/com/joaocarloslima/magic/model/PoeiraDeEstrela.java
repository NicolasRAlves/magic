package br.com.joaocarloslima.magic.model;

public class PoeiraDeEstrela extends Ingrediente{
    public PoeiraDeEstrela(int id, String nome, String imagem, String descricao) {
        super(id, nome, imagem, descricao);
    }

    @Override
    public void misturar(Pocao pocao) {
        pocao.setPotencia(pocao.getPotencia() + 10);
        pocao.setEstabilidade(pocao.getEstabilidade() + 20);
    }
}
