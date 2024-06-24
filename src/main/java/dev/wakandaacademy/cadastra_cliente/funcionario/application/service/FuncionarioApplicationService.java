package dev.wakandaacademy.cadastra_cliente.funcionario.application.service;

import dev.wakandaacademy.cadastra_cliente.funcionario.application.api.EditFuncionarioRequest;
import dev.wakandaacademy.cadastra_cliente.funcionario.application.api.FuncionarioIdResponse;
import dev.wakandaacademy.cadastra_cliente.funcionario.application.api.FuncionarioRequest;
import dev.wakandaacademy.cadastra_cliente.funcionario.application.repository.FuncionarioRepository;
import dev.wakandaacademy.cadastra_cliente.funcionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    @Override
    public FuncionarioIdResponse createNewFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[start] - FuncionarioService - createNewFuncionario");
        Funcionario newFuncionario = funcionarioRepository.save(new Funcionario(funcionarioRequest));
        log.info("[finish] - FuncionarioService - createNewFuncionario");
        return FuncionarioIdResponse.builder().idFuncionario(newFuncionario.getIdFuncionario()).build();
    }

    @Override
    public Funcionario getFuncionario(UUID idFuncionario) {
        log.info("[start] - FuncionarioApplicationService - getFuncionario");
        Funcionario funcionario = funcionarioRepository.get(idFuncionario);
        log.info("[finish] - FuncionarioApplicationService - getFuncionario");
        return funcionario;
    }

    @Override
    public void editFuncionario(UUID idFuncionario, EditFuncionarioRequest editFuncionarioRequest) {
        log.info("[start] - FuncionarioApplicationService - editFuncionario");
        Funcionario funcionario = funcionarioRepository.get(idFuncionario);
        funcionario.edit(editFuncionarioRequest);
        funcionarioRepository.update(funcionario);
        log.info("[finish] - FuncionarioApplicationService - editFuncionario");
    }
}