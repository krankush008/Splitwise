package com.example.split.Model;

import java.util.Map;

public class Expense {
    Integer expenseId;
    ExpenseType expenseType;
    Integer paidUserId;
    Map<Integer, Integer> owersList;

    Expense(Integer expenseId, ExpenseType expenseType, Integer paidUserId, Map<Integer, Integer> owersList){
        this.expenseId = expenseId;
        this.expenseType = expenseType;
        this.paidUserId = paidUserId;
        this.owersList = owersList;
    }
    
}
