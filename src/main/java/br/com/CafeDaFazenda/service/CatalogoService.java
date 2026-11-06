package br.com.CafeDaFazenda.service;

import br.com.CafeDaFazenda.dto.CatalogoDTO;
import br.com.CafeDaFazenda.model.Catalogo;
import br.com.CafeDaFazenda.repository.CatalogoRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CatalogoService {

    private final CatalogoRepository repository;

    public CatalogoService(CatalogoRepository repository) {
        this.repository = repository;
    }

    // Listar todos os produtos
    public List<CatalogoDTO> listarTodos() {
        return repository.findAll()
                .stream()
                .map(this::converterParaDTO)
                .collect(Collectors.toList());
    }

    // Buscar produto pelo ID
    public CatalogoDTO buscarPorId(Long id) {
        Catalogo catalogo = repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Produto não encontrado"));

        return converterParaDTO(catalogo);
    }

    // Salvar produto
    public void salvar(CatalogoDTO dto) {

        Catalogo catalogo = new Catalogo();

        catalogo.setId(dto.getId());
        catalogo.setCodigo(dto.getCodigo());
        catalogo.setProduto(dto.getProduto());
        catalogo.setDescricao(dto.getDescricao());
        catalogo.setValor(dto.getValor());
        catalogo.setDatetime(dto.getDatetime());
        catalogo.setAtivo(dto.getAtivo());

        repository.save(catalogo);
    }

    // Excluir produto
    public void excluir(Long id) {
        repository.deleteById(id);
    }

    // Converter entidade para DTO
    private CatalogoDTO converterParaDTO(Catalogo catalogo) {

        CatalogoDTO dto = new CatalogoDTO();

        dto.setId(catalogo.getId());
        dto.setCodigo(catalogo.getCodigo());
        dto.setProduto(catalogo.getProduto());
        dto.setDescricao(catalogo.getDescricao());
        dto.setValor(catalogo.getValor());
        dto.setDatetime(catalogo.getDatetime());
        dto.setAtivo(catalogo.getAtivo());

        return dto;
    }
}