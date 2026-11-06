package br.com.CafeDaFazenda.controller;

import br.com.CafeDaFazenda.dto.UsuariosDTO;
import br.com.CafeDaFazenda.service.UsuarioService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {

    private final UsuarioService usuarioService;

    public UsuariosController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Listar usuários
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("usuarios", usuarioService.listarTodos());
        return "usuarios/lista";
    }

    // Abrir formulário
    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("usuario", new UsuariosDTO());
        return "usuarios/formulario";
    }

    // Salvar usuário
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute("usuario") UsuariosDTO usuario) {
        usuarioService.salvar(usuario);
        return "redirect:/usuarios";
    }

    // Editar usuário
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("usuario", usuarioService.buscarPorId(id));
        return "usuarios/formulario";
    }

    // Excluir usuário
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        usuarioService.excluir(id);
        return "redirect:/usuarios";
    }
}