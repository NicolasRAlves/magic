package br.com.joaocarloslima.magic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.joaocarloslima.magic.model.FlorDoSono;
import br.com.joaocarloslima.magic.model.Ingrediente;
import br.com.joaocarloslima.magic.model.Mandagora;
import br.com.joaocarloslima.magic.model.Misturavel;
import br.com.joaocarloslima.magic.model.OrvalhoEncantado;
import br.com.joaocarloslima.magic.model.Pocao;
import br.com.joaocarloslima.magic.model.PoeiraDeEstrela;
import br.com.joaocarloslima.magic.model.RaizApodrecida;
import br.com.joaocarloslima.magic.model.ResultadoFinal;

@Service
public class PocaoService {

    public List<Ingrediente> getIngredientesDisponiveis() {
        return List.of(
            new PoeiraDeEstrela(1, "Poeira de Estrela", "poeiradeestrela.png", "Uma poção mágica que brilha como estrelas. Adiciona 10 de potência e 20 de estabilidade."),
            new Mandagora(2, "Mandrágora", "mandragora.png", "Uma planta mágica que grita quando colhida. Adiciona 30 de potência, mas reduz 20 de estabilidade."),
            new FlorDoSono(3, "Flor do Sono", "flordosono.png", "Uma flor que causa sono quando cheirada. Adicionar 10 de instabilidade"),
            new OrvalhoEncantado(4, "Orvalho Encantado", "orvalhoencantado.png", "Um orvalho mágico que brilha ao sol.Tem efeito mágico e adiciona 10 de estabilidade."),
            new RaizApodrecida(5, "Raiz Apodrecida", "raizapodrecida.png", "Uma raiz que exala um cheiro horrível. Adiciona 20 de potência e causa cheiro ruim.")
        );
    }

    public Pocao criarPocao(List<Ingrediente> ingredientesSelecionados) {
        Pocao pocao = new Pocao();
        for (Ingrediente ingrediente : ingredientesSelecionados) {
            if( ingrediente instanceof Misturavel){
                Misturavel ingredienteMisturavel = (Misturavel) ingrediente;
                pocao.misturar(ingredienteMisturavel);
            }
        }
        return pocao;
    }

    public ResultadoFinal avaliarPocao(Pocao pocao) {
        if (pocao.getEstabilidade() <= 0) return ResultadoFinal.EXPLODIU;
        if (pocao.isCheiroRuim() && pocao.getPotencia() > 20) return ResultadoFinal.FEDOR_MAGICO;
        if (pocao.isCausaSono() && pocao.getPotencia() >= 30) return ResultadoFinal.MAGO_DORMIU;
        if (pocao.isEfeitoMagico() && pocao.getPotencia() >= 40 && pocao.getEstabilidade() >= 40) return ResultadoFinal.SUCESSO;
        if (pocao.getPotencia() < 20) return ResultadoFinal.FRACA;
        return ResultadoFinal.NORMAL;
    }
}