package com.app.dto;

import com.app.model.CustomerBusinessType;
import com.app.model.CustomerRiskClass;
import com.app.model.CustomerType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {

    private Long Id;
    private Long customerId;
    private LocalDate infoAsOfDate;
    private String customerName;
    private LocalDate customerStartDate;
    private BigDecimal customerIncome;
    private CustomerType customerType;
    private CustomerRiskClass customerRiskClass;
    private CustomerBusinessType customerBusinessType;
    private NoteDto noteDto;
}
