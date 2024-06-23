package dev.wakandaacademy.cadastra_cliente.funcionario.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.NonNull;
import lombok.Value;

import java.util.UUID;

@Value
public class FuncionarioRequest {
    @NonNull
    private UUID idFuncionario;
    @NotBlank
    @Size(message = "Campo nome não pode estar vazio", max = 120, min = 1)
    private String nome;
    private String designacao;
    private double salario;
    private int telefone;
    private String endereco;
}
