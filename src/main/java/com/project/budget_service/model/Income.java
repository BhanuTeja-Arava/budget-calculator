package com.project.budget_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Income {

    @Id
    private int id;
    private Double salaryAsIncome;
    private Double rentsAsIncome;
    private Double otherSourceAsIncome;
   // private Double totalIncome;


//    @Transient
//    public Double totalIncome(){
//        return salaryAsIncome+rentsAsIncome+otherSourceAsIncome;
//    }




}
