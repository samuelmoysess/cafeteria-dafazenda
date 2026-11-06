package br.com.CafeDaFazenda.service;

import br.com.CafeDaFazenda.dto.UsuariosDTO;
import br.com.CafeDaFazenda.model.Usuarios;
import br.com.CafeDaFazenda.repository.UsuarioRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    // Listar usuários
    public List<UsuariosDTO> listarTodos() {
        return repository.findAll()
                .stream()
                .map(this::converterParaDTO)
                .collect(Collectors.toList());
    }

    // Buscar usuário por ID
    public UsuariosDTO buscarPorId(Long id) {
        Usuarios usuario = repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Usuário não encontrado"));

        return converterParaDTO(usuario);
    }

    // Salvar usuário
    public void salvar(UsuariosDTO dto) {

        Usuarios usuario = new Usuarios();

        usuario.setId(dto.getId());
        usuario.setRegistro(dto.getRegistro());
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());
        usuario.setDataAdmissao(dto.getDataAdmissao());
        usuario.setAtivo(dto.getAtivo());

        repository.save(usuario);
    }

    // Excluir usuário
    public void excluir(Long id) {
        repository.deleteById(id);
    }

    // Converter para DTO
    private UsuariosDTO converterParaDTO(Usuarios usuario) {

        UsuariosDTO dto = new UsuariosDTO();

        dto.setId(usuario.getId());
        dto.setRegistro(usuario.getRegistro());
        dto.setNome(usuario.getNome());
        dto.setEmail(usuario.getEmail());
        dto.setSenha(usuario.getSenha());
        dto.setDataAdmissao(usuario.getDataAdmissao());
        dto.setAtivo(usuario.getAtivo());

        return dto;
    }
}