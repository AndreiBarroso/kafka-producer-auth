package br.mil.fab.ccarj.kafka.producer.model;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentMessage implements Serializable {
    private OperationType operation;
    private String cpf;
    private List<ProfileMessage> perfis;
}
