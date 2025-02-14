package com.project.budget_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class IncomeRequest {

    private Double salaryAsIncome;
    private Double rentsAsIncome;
    private Double otherSourceAsIncome;



}
