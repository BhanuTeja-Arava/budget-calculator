package com.project.budget_service.controller;

import com.project.budget_service.dto.BudgetCalulatorRequest;
import com.project.budget_service.dto.ExpenditureRequest;
import com.project.budget_service.dto.IncomeRequest;
import com.project.budget_service.model.Income;
import com.project.budget_service.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/budget-service/api/vi")
public class IncomeController {

    private IncomeService incomeService;

    @Autowired
    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    @PostMapping
    public String UpdateTotalIncome(@RequestBody IncomeRequest incomeRequest) {
//        Income result = Income.builder().salaryAsIncome(incomeRequest.getSalaryAsIncome())
//                .rentsAsIncome(incomeRequest.getRentsAsIncome())
//                .otherSourceAsIncome(incomeRequest.getOtherSourceAsIncome())
//                .build();

        //System.out.println(result.getTotalIncome());

        return " The Total Income " + incomeService.totalIncome(incomeRequest);
    }

    public String updateTotalExpenditure(@RequestBody ExpenditureRequest expenditureRequest) {


        return null;
    }


    public String budgetCalculator(@RequestBody BudgetCalulatorRequest budgetCalulatorRequest){

        return null;
    }
}
