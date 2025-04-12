package br.com.joaocarloslima.magic.model;

public class Mandagora extends Ingrediente {
    public Mandagora(int id, String nome, String imagem, String descricao) {
        super(id, nome, imagem, descricao);
    }

    @Override
    public void misturar(Pocao pocao) {
        pocao.setPotencia(pocao.getPotencia() + 30);
        pocao.setEstabilidade(pocao.getEstabilidade() - 20);
    }
}
