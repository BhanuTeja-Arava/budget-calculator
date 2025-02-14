package com.project.budget_service.service;

import com.project.budget_service.dao.service.IncomeDaoService;
import com.project.budget_service.dto.BudgetCalulatorRequest;
import com.project.budget_service.dto.IncomeRequest;
import com.project.budget_service.dto.IncomeRespone;
import com.project.budget_service.model.Budget;
import com.project.budget_service.model.Income;
import com.project.budget_service.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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

    public Double budgetCalculator(BudgetCalulatorRequest budgetCalulatorRequest) {


        Double totalIncome = budgetCalulatorRequest.getSalaryAsIncome()
                + budgetCalulatorRequest.getRentsAsIncome()
                + budgetCalulatorRequest.getOtherSourceAsIncome();

        Double totalExpenditure = budgetCalulatorRequest.getHousing()
                + budgetCalulatorRequest.getUtilities()
                + budgetCalulatorRequest.getGroceries()
                + budgetCalulatorRequest.getTransportation()
                + budgetCalulatorRequest.getChildCare()
                + budgetCalulatorRequest.getHealthCare()
                + budgetCalulatorRequest.getAllTypeOfLoans()
                + budgetCalulatorRequest.getEntertainment()
                + budgetCalulatorRequest.getEntertainment()
                + budgetCalulatorRequest.getDinningOut();

        Double totalSavings = budgetCalulatorRequest.getSipAsInvestment()
                + budgetCalulatorRequest.getOtherAsInvestment()
                + budgetCalulatorRequest.getRetirementFund()
                + budgetCalulatorRequest.getEmergencyFund();

        Budget result = new Budget();
        result.setTotalIncome(totalIncome);
        result.setTotalExpenditure(totalExpenditure);
        result.setTotalSaving(totalSavings);

        if (!(totalIncome >= 0) || (totalExpenditure > totalIncome)||(totalExpenditure+totalSavings)>totalIncome) {
            throw new RuntimeException("expenditure is higher than Income");
        }

        return incomeDaoService.budgetCalculator(result);
    }

}
