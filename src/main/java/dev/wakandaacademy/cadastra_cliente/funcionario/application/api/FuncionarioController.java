package dev.wakandaacademy.cadastra_cliente.funcionario.application.api;

import dev.wakandaacademy.cadastra_cliente.funcionario.application.service.FuncionarioService;
import dev.wakandaacademy.cadastra_cliente.funcionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

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

    @Override
    public DetailedFuncionarioResponse getFuncionario(UUID idFuncionario) {
        log.info("[start] - FuncionarioController - getFuncionario");
        Funcionario funcionario = funcionarioService.getFuncionario(idFuncionario);
        log.info("[finish] - FuncionarioController - getFuncionario");
        return new DetailedFuncionarioResponse(funcionario);
    }

    @Override
    public void editFuncionario(UUID idFuncionario, EditFuncionarioRequest editFuncionarioRequest) {
        log.info("[start] - FuncionarioController - editFuncionario");
        funcionarioService.editFuncionario(idFuncionario, editFuncionarioRequest);
        log.info("[finish] - FuncionarioController - editFuncionario");
    }
}
