package org.surja.email_service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
