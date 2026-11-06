package br.com.CafeDaFazenda.controller;

import br.com.CafeDaFazenda.model.Clientes;
import br.com.CafeDaFazenda.repository.ClientesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClientesRepository clientesRepository;

    // Listar clientes
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("clientes", clientesRepository.findAll());
        return "clientes/lista";
    }

    // Abrir formulário de cadastro
    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("cliente", new Clientes());
        return "clientes/formulario";
    }

    // Salvar cliente
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Clientes cliente) {
        clientesRepository.save(cliente);
        return "redirect:/clientes";
    }

    // Excluir cliente
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        clientesRepository.deleteById(id);
        return "redirect:/clientes";
    }
}