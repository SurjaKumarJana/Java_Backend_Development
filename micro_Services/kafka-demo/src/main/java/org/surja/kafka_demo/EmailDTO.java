package org.surja.kafka_demo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EmailDTO {

    private String toEmail;
    private String subject;
    private String body;
    private String cc;



}
