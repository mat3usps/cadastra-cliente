package dev.wakandaacademy.cadastra_cliente.funcionario.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class FuncionarioController implements FuncionarioAPI {
    @Override
    public FuncionarioIdResponse postNewFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("FuncionarioController - postNewFuncionario");
        return null;
    }
}
