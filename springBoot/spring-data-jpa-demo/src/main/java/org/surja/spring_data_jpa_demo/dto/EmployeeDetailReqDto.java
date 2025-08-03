package org.surja.spring_data_jpa_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDetailReqDto {

    private String name;
    private String email;
    private String line1;
    private String line2;
    private String city;
    private Long branchId;


}
