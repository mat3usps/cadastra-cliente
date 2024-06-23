package dev.wakandaacademy.cadastra_cliente.funcionario.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController@RequestMapping("/funcionario")
public interface FuncionarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    FuncionarioIdResponse postNewFuncionario(@RequestBody @Valid FuncionarioRequest funcionarioRequest);

}
