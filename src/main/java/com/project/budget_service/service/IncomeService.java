package com.project.budget_service.service;

import com.project.budget_service.dao.service.IncomeDaoService;
import com.project.budget_service.dto.IncomeRequest;
import com.project.budget_service.dto.IncomeRespone;
import com.project.budget_service.model.Income;
import com.project.budget_service.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncomeService {


    private IncomeDaoService incomeDaoService;

    @Autowired
    public IncomeService(IncomeDaoService incomeDaoService) {
        this.incomeDaoService = incomeDaoService;
    }

    public Double totalIncome(IncomeRequest income) {
        Income result = new Income();
        result.setSalaryAsIncome(income.getSalaryAsIncome());
        result.setRentsAsIncome(income.getRentsAsIncome());
        result.setOtherSourceAsIncome(income.getOtherSourceAsIncome());

        return incomeDaoService.getTotalIncome(result);
    }


}
