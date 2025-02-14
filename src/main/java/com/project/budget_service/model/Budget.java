package com.project.budget_service.model;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Budget {
    private int id;
    private Double totalIncome;
    private Double totalExpenditure;
    private Double totalSaving;
}
