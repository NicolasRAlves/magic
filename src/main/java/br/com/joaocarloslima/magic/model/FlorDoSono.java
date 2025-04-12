package br.com.joaocarloslima.magic.model;

public class FlorDoSono extends Ingrediente{

    public FlorDoSono(int id, String nome, String imagem, String descricao) {
        super(id, nome, imagem, descricao);
    }

    @Override
    public void misturar(Pocao pocao) {
        pocao.setEstabilidade(pocao.getEstabilidade() + 10);
        pocao.setCausaSono(true);
    }
}
