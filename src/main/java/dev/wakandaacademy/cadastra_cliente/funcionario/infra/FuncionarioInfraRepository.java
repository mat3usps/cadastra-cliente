package dev.wakandaacademy.cadastra_cliente.funcionario.infra;

import dev.wakandaacademy.cadastra_cliente.funcionario.application.repository.FuncionarioRepository;
import dev.wakandaacademy.cadastra_cliente.funcionario.domain.Funcionario;
import dev.wakandaacademy.cadastra_cliente.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements FuncionarioRepository {

    private Map<String, Funcionario> funcionarioRepository = new HashMap<>();
    @Override
    public Funcionario save(Funcionario funcionario) {
        log.info("[start] - FuncionarioInfraRepository - save");
        if (funcionarioRepository.containsKey(String.valueOf(funcionario.getIdFuncionario()))) {
            throw APIException.build(HttpStatus.BAD_REQUEST, "Não foi possível salvar funcionário.");
        }
        funcionarioRepository.put(String.valueOf(funcionario.getIdFuncionario()), funcionario);
        log.info("[finish] - FuncionarioInfraRepository - save");
        return funcionario;
    }

    @Override
    public Funcionario get(UUID idFuncionario) {
        log.info("[start] - FuncionarioInfraRepository - get");
        if (!funcionarioRepository.containsKey(String.valueOf(idFuncionario))) {
            throw APIException.build(HttpStatus.NOT_FOUND, "Não foi possível encontrar funcionário.");
        }
        Funcionario funcionario = funcionarioRepository.get(String.valueOf(idFuncionario));
        log.info("[finish] - FuncionarioInfraRepository - get");
        return funcionario;
    }
}