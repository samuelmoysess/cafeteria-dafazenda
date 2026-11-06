package br.com.CafeDaFazenda.service;

import br.com.CafeDaFazenda.dto.PedidosDTO;
import br.com.CafeDaFazenda.model.Pedidos;
import br.com.CafeDaFazenda.repository.PedidoRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PedidosService {

    private final PedidoRepository repository;

    public PedidosService(PedidoRepository repository) {
        this.repository = repository;
    }

    // Listar pedidos
    public List<PedidosDTO> listarTodos() {
        return repository.findAll()
                .stream()
                .map(this::converterParaDTO)
                .collect(Collectors.toList());
    }

    // Buscar pedido por ID
    public PedidosDTO buscarPorId(Long id) {
        Pedidos pedido = repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Pedido não encontrado"));

        return converterParaDTO(pedido);
    }

    // Salvar pedido
    public void salvar(PedidosDTO dto) {

        Pedidos pedido = new Pedidos();

        pedido.setCodigo(dto.getCodigo());
        pedido.setProduto(dto.getProduto());
        pedido.setDescricao(dto.getDescricao());
        pedido.setValor(dto.getValor());
        pedido.setDatacadastro(dto.getDatacadastro());
        pedido.setAtivo(dto.getAtivo());

        repository.save(pedido);
    }

    // Excluir pedido
    public void excluir(Long id) {
        repository.deleteById(id);
    }

    // Converter Model para DTO
    private PedidosDTO converterParaDTO(Pedidos pedido) {

        PedidosDTO dto = new PedidosDTO();

        dto.setCodigo(pedido.getCodigo());
        dto.setProduto(pedido.getProduto());
        dto.setDescricao(pedido.getDescricao());
        dto.setValor(pedido.getValor());
        dto.setDatacadastro(pedido.getDatacadastro());
        dto.setAtivo(pedido.getAtivo());

        return dto;
    }
}