package br.com.CafeDaFazenda.controller;

import br.com.CafeDaFazenda.dto.PedidosDTO;
import br.com.CafeDaFazenda.service.PedidosService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pedidos")
public class PedidosController {

    private final PedidosService pedidosService;

    public PedidosController(PedidosService pedidosService) {
        this.pedidosService = pedidosService;
    }

    // Listar pedidos
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("pedidos", pedidosService.listarTodos());
        return "pedidos/lista";
    }

    // Abrir formulário
    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("pedido", new PedidosDTO());
        return "pedidos/formulario";
    }

    // Salvar pedido
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute("pedido") PedidosDTO pedido) {
        pedidosService.salvar(pedido);
        return "redirect:/pedidos";
    }

    // Editar pedido
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("pedido", pedidosService.buscarPorId(id));
        return "pedidos/formulario";
    }

    // Excluir pedido
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        pedidosService.excluir(id);
        return "redirect:/pedidos";
    }
}