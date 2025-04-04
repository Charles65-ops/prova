package com.charada.prova.services;

import com.charada.prova.dtos.MovimentoDTO;
import com.charada.prova.models.Movimento;
import com.charada.prova.repositories.MovimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Objects;

@Service
public class MovimentoService {

    @Autowired
    private MovimentoRepository repository;

    public MovimentoDTO salvarMovimento(MovimentoDTO movimentoDTO) {
        Movimento movimento = converterMovimentoDTOParaMovimento(movimentoDTO);
        movimento = repository.save(movimento);
        return converterMovimentoParaMovimentoDTO(movimento);
    }

    private Movimento converterMovimentoDTOParaMovimento(MovimentoDTO movimentoDTO) {
        Movimento movimento = new Movimento();
        movimento.setId(movimentoDTO.getId());
        movimento.setDataMovimento(movimentoDTO.getDataMovimento());
        movimento.setValor(movimentoDTO.getValor());
        movimento.setClassificacao(movimentoDTO.getClassificacao());
        movimento.setObservacao(movimentoDTO.getObservacao());

        return movimento;
    }

    public MovimentoDTO converterMovimentoParaMovimentoDTO(Movimento movimento) {
        MovimentoDTO movimentoDTO = new MovimentoDTO();
        movimentoDTO.setId(movimento.getId());
        movimentoDTO.setDataMovimento(movimento.getDataMovimento());
        movimentoDTO.setValor(movimento.getValor());
        movimentoDTO.setClassificacao(movimento.getClassificacao());
        movimentoDTO.setObservacao(movimento.getObservacao());
        return movimentoDTO;
    }

    public Movimento buscarMovimentoPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new IllegalArgumentException("Usuário não encontrado"));
    }

    public MovimentoDTO atualizarMovimento(Long id, MovimentoDTO movimentoDTO) {
        if(Objects.isNull(repository.findById(id))) {
            throw new IllegalArgumentException("Usuário não encontrado");
        }
        return movimentoDTO;
    }

    public void deletarMovimento(Long id) {
    }
}