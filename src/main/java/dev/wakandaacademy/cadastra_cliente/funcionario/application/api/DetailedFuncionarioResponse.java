package dev.wakandaacademy.cadastra_cliente.funcionario.application.api;

import dev.wakandaacademy.cadastra_cliente.funcionario.domain.Funcionario;
import jakarta.validation.constraints.NotBlank;
import lombok.NonNull;
import lombok.Value;

import java.util.UUID;

@Value
public class DetailedFuncionarioResponse {
    private UUID idFuncionario;
    private String nome;
    private String designacao;
    private double salario;
    private String telefone;
    private String endereco;

    public DetailedFuncionarioResponse(Funcionario funcionario) {
        this.idFuncionario = funcionario.getIdFuncionario();
        this.nome = funcionario.getNome();
        this.designacao = funcionario.getDesignacao();
        this.salario = funcionario.getSalario();
        this.telefone = funcionario.getTelefone();
        this.endereco = funcionario.getEndereco();
    }
}

