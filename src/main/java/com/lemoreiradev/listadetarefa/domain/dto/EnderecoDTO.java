package com.lemoreiradev.listadetarefa.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnderecoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("logradouro")
    private String rua;
    private String bairro;
    private String uf;
    private String localidade;
}
