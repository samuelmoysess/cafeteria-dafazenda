package br.com.CafeDaFazenda.controller;

import br.com.CafeDaFazenda.dto.CatalogoDTO;
import br.com.CafeDaFazenda.service.CatalogoService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/catalogo")
public class CatalogoController {

    private final CatalogoService catalogoService;

    public CatalogoController(CatalogoService catalogoService) {
        this.catalogoService = catalogoService;
    }

    // Listar produtos
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("catalogos", catalogoService.listarTodos());
        return "catalogo/lista";
    }

    // Abrir formulário
    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("catalogo", new CatalogoDTO());
        return "catalogo/formulario";
    }

    // Salvar produto
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute("catalogo") CatalogoDTO catalogo) {
        catalogoService.salvar(catalogo);
        return "redirect:/catalogo";
    }

    // Editar produto
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("catalogo", catalogoService.buscarPorId(id));
        return "catalogo/formulario";
    }

    // Excluir produto
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        catalogoService.excluir(id);
        return "redirect:/catalogo";
    }
}