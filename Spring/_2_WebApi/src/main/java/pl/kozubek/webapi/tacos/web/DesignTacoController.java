package pl.kozubek.webapi.tacos.web;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kozubek.webapi.tacos.Ingredient;
import pl.kozubek.webapi.tacos.Taco;

import javax.validation.Valid;


@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping
    public String showDesignForm(Model model) {
        List<Ingredient> ingredients = Arrays.asList(new Ingredient("FLTO", "pszenna", Ingredient.Type.WRAP), new Ingredient("COTO", "kukurydziana", Ingredient.Type.WRAP), new Ingredient("GRBF", "mielona wołowina", Ingredient.Type.PROTEIN), new Ingredient("CARN", "kawałki mięsa", Ingredient.Type.PROTEIN), new Ingredient("TMTO", "pomidor pokrojony w kostkę", Ingredient.Type.VEGGIES), new Ingredient("LETC", "sałata", Ingredient.Type.VEGGIES), new Ingredient("CHED", "cheddar", Ingredient.Type.CHEESE), new Ingredient("JACK", "Monterey Jack", Ingredient.Type.CHEESE), new Ingredient("SLSA", "pikantny sos pomidorowy", Ingredient.Type.SAUCE), new Ingredient("SRCR", "ŚMIETANA", Ingredient.Type.SAUCE));

        Ingredient.Type[] types = Ingredient.Type.values();
        for (Ingredient.Type type : types) {
            model.addAttribute(type.toString().toLowerCase(), ingredients.stream().filter(i -> i.getType().equals(type)).collect(Collectors.toList()));
        }
        model.addAttribute("design", new Taco());
        return "design";
    }

    @PostMapping
    public String processDesign(@Valid Taco design, Errors errors) {

        if (errors.hasErrors()) {
            return "design";
        }
        log.info("Przetwarzanie projektu taco: " + design);
        return "redirect:/orders/current";
    }
}