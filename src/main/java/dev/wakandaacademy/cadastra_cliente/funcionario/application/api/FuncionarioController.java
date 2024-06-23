package dev.wakandaacademy.cadastra_cliente.funcionario.application.api;

import dev.wakandaacademy.cadastra_cliente.funcionario.application.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioAPI {
    private final FuncionarioService funcionarioService;
    @Override
    public FuncionarioIdResponse postNewFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[start] - FuncionarioAPI - postNewFuncionario");
        FuncionarioIdResponse createdFuncionario = funcionarioService.createNewFuncionario(funcionarioRequest);
        log.info("[finish] - FuncionarioAPI - postNewFuncionario");
        return createdFuncionario;
    }
}
