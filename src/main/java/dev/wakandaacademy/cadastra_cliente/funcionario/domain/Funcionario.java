package dev.wakandaacademy.cadastra_cliente.funcionario.domain;

import dev.wakandaacademy.cadastra_cliente.funcionario.application.api.EditFuncionarioRequest;
import dev.wakandaacademy.cadastra_cliente.funcionario.application.api.FuncionarioRequest;
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

    public Funcionario(FuncionarioRequest funcionarioRequest) {
        this.idFuncionario = UUID.randomUUID();
        this.nome = funcionarioRequest.getNome();
        this.designacao = funcionarioRequest.getDesignacao();
        this.salario = funcionarioRequest.getSalario();
        this.telefone = funcionarioRequest.getTelefone();
        this.endereco = funcionarioRequest.getEndereco();
    }

    public void edit(EditFuncionarioRequest editFuncionarioRequest){
        this.nome = editFuncionarioRequest.getNome();
        this.designacao = editFuncionarioRequest.getDesignacao();
        this.salario = editFuncionarioRequest.getSalario();
        this.telefone = editFuncionarioRequest.getTelefone();
        this.endereco = editFuncionarioRequest.getEndereco();
    }
}
