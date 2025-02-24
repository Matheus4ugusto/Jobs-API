package br.com.matheus4ugusto.gestao_vagas.modules.company.dto;

import lombok.Data;

@Data
public class CreateJobDTO {
    private String description, benefits, level;
}
