package controllers;

import model.Placar;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class ScoreController {

    private final Placar placarAtual = new Placar("Time 1", "Time B", 0);


    @GetMapping("/placar")
    public String mostrarPlacar(Model model){
        model.addAttribute("placar", placarAtual);
        return "placar";
    }

    @PostMapping("/placar")
    public String atualizarPlacar(@ModelAttribute Placar novoPlacar){
        placarAtual.setTimeCasa (novoPlacar.getTimeCasa());
        placarAtual.setTimeVisitante(novoPlacar.getTimeVisitante());

        return "redirect:/placar";
    }



}
