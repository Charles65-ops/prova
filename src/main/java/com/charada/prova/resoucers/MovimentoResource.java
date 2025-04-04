package com.charada.prova.resoucers;

import com.charada.prova.dtos.MovimentoDTO;
import com.charada.prova.models.Movimento;
import com.charada.prova.services.MovimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movimentos")
public class MovimentoResource {

    @Autowired
    private MovimentoService movimentoService;



    @GetMapping("/{id}")
    public ResponseEntity<MovimentoDTO> buscarUsuariosporid(@PathVariable Long id) {
        Movimento movimento = movimentoService.buscarMovimentoPorId(id);
        return ResponseEntity.ok(movimentoService.converterMovimentoParaMovimentoDTO(movimentoService.buscarMovimentoPorId(id)));
    }


    @PostMapping
    public ResponseEntity<MovimentoDTO> salvar(@RequestBody  MovimentoDTO dto) {
        return ResponseEntity.ok(movimentoService.salvarMovimento(dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        movimentoService.deletarMovimento(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping()
    public ResponseEntity<MovimentoDTO> atualizar(@RequestBody MovimentoDTO movimentoDTO) {
        return ResponseEntity.ok(movimentoService.atualizarMovimento(movimentoDTO));
    }
}
