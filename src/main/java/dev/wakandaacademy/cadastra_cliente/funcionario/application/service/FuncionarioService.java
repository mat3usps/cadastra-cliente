package dev.wakandaacademy.cadastra_cliente.funcionario.application.service;

import dev.wakandaacademy.cadastra_cliente.funcionario.application.api.EditFuncionarioRequest;
import dev.wakandaacademy.cadastra_cliente.funcionario.application.api.FuncionarioIdResponse;
import dev.wakandaacademy.cadastra_cliente.funcionario.application.api.FuncionarioRequest;
import dev.wakandaacademy.cadastra_cliente.funcionario.domain.Funcionario;

import java.util.UUID;

public interface FuncionarioService {
    FuncionarioIdResponse createNewFuncionario(FuncionarioRequest funcionarioRequest);

    Funcionario getFuncionario(UUID idFuncionario);

    void editFuncionario(UUID idFuncionario, EditFuncionarioRequest editFuncionarioRequest);

    void deleteFuncionario(UUID idFuncionario);
}
