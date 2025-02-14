package com.project.budget_service.repository;

import com.project.budget_service.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget,Integer> {
}
