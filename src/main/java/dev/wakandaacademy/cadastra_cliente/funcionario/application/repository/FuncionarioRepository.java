package dev.wakandaacademy.cadastra_cliente.funcionario.application.repository;

import dev.wakandaacademy.cadastra_cliente.funcionario.domain.Funcionario;

import java.util.UUID;

public interface FuncionarioRepository {
    Funcionario save(Funcionario funcionario);

    Funcionario get(UUID idFuncionario);

    void update(Funcionario funcionario);
}
