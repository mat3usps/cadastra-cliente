package dev.wakandaacademy.cadastra_cliente.funcionario.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.UUID;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Funcionario {
    @NonNull
    private UUID idFuncionario;
    @NotBlank
    private String nome;
    private String designacao;
    private double salario;
    private String telefone;
    private String endereco;
}
