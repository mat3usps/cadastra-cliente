package dev.wakandaacademy.cadastra_cliente.handler;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ErrorApiResponse {
    private String message;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String description;
}
