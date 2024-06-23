package dev.wakandaacademy.cadastra_cliente.funcionario.application.repository;

import dev.wakandaacademy.cadastra_cliente.funcionario.domain.Funcionario;

public interface FuncionarioRepository {
    Funcionario save(Funcionario funcionario);
}
