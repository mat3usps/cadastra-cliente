package dev.wakandaacademy.cadastra_cliente.funcionario.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class FuncionarioIdResponse {
    private UUID idFuncionario;
}
