package br.com.joaocarloslima.magic.model;

public abstract class Ingrediente implements Misturavel {
    private int id;
    private String nome;
    private String imagem;
    private String descricao;

    public Ingrediente(int id, String nome, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getImagem() { return imagem; }
    public String getDescricao() { return descricao; }
}
