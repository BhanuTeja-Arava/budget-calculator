package com.project.budget_service.dao.service;

import com.project.budget_service.dto.IncomeRequest;
import com.project.budget_service.model.Income;
import com.project.budget_service.repository.IncomeRepository;
import com.project.budget_service.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncomeDaoService {

    private IncomeRepository incomeRepository;

    @Autowired
    public IncomeDaoService(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }


    public Double getTotalIncome(Income income) {

        //Double TotalIncome = income.getSalaryAsIncome()+income.getRentsAsIncome()+income.getOtherSourceAsIncome();

        double TotalIncome = (income.getSalaryAsIncome() != null ? income.getSalaryAsIncome() : 0) +
                (income.getRentsAsIncome() != null ? income.getRentsAsIncome() : 0)
                + (income.getOtherSourceAsIncome() != null ? income.getOtherSourceAsIncome() : 0);

        Income incomeRecordsSave = incomeRepository.save(income);

        return TotalIncome;
    }
}
