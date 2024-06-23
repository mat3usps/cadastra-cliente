package dev.wakandaacademy.cadastra_cliente.funcionario.application.service;

import dev.wakandaacademy.cadastra_cliente.funcionario.application.api.FuncionarioIdResponse;
import dev.wakandaacademy.cadastra_cliente.funcionario.application.api.FuncionarioRequest;

public interface FuncionarioService {
    FuncionarioIdResponse createNewFuncionario(FuncionarioRequest funcionarioRequest);
}
