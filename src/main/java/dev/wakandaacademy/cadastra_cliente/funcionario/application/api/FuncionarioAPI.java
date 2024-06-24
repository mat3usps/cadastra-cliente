package dev.wakandaacademy.cadastra_cliente.funcionario.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/funcionario")
public interface FuncionarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    FuncionarioIdResponse postNewFuncionario(@RequestBody @Valid FuncionarioRequest funcionarioRequest);

    @GetMapping("/{idFuncionario}")
    @ResponseStatus(code = HttpStatus.OK)
    DetailedFuncionarioResponse getFuncionario(@PathVariable UUID idFuncionario);

    @PatchMapping("/{idFuncionario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void editFuncionario(@PathVariable UUID idFuncionario, @RequestBody @Valid EditFuncionarioRequest editFuncionarioRequest);
}
