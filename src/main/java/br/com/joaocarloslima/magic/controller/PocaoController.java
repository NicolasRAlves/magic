package br.com.joaocarloslima.magic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.joaocarloslima.magic.model.Ingrediente;
import br.com.joaocarloslima.magic.model.Pocao;
import br.com.joaocarloslima.magic.model.ResultadoFinal;
import br.com.joaocarloslima.magic.service.PocaoService;

@Controller
@RequestMapping("/")
public class PocaoController {
    record PocaoResponse(Pocao pocao, ResultadoFinal resultado, String descricao) {}
    private final PocaoService pocaoService;

    public PocaoController(PocaoService pocaoService) {
        this.pocaoService = pocaoService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("ingredientesDisponiveis", pocaoService.getIngredientesDisponiveis());
        return "index";
    }

    @PostMapping("/misturar")
    @ResponseBody
    public PocaoResponse misturar(@RequestBody List<Integer> idsSelecionados, Model model) {
        List<Ingrediente> ingredientesSelecionados = new ArrayList<>();
        for(int id: idsSelecionados){
            for(Ingrediente ingrediente: pocaoService.getIngredientesDisponiveis()){
                if(ingrediente.getId() == id){
                    ingredientesSelecionados.add(ingrediente);
                }
            }
        }
        var pocao = pocaoService.criarPocao(ingredientesSelecionados);
        var resultado = pocaoService.avaliarPocao(pocao);
        var descricao = resultado.getDescricao();

       return new PocaoResponse(pocao, resultado, descricao);
    }
} 

