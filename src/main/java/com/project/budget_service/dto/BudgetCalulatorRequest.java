package com.project.budget_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BudgetCalulatorRequest {

    private Double salaryAsIncome;
    private Double rentsAsIncome;
    private Double otherSourceAsIncome;
    private Double housing;
    private Double utilities;
    private Double groceries;
    private Double transportation;
    private Double childCare;
    private Double healthCare;
    private Double allTypeOfLoans;
    private Double entertainment;
    private Double dinningOut;
    private Double sipAsInvestment;
    private Double otherAsInvestment;
    private Double emergencyFund;
    private Double retirementFund;

}
