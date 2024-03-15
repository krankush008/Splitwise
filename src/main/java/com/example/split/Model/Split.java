package com.example.split.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Split {
    Integer userId;
    Integer amnt;
    ExpenseType expenseType;
    ArrayList<User> usersList;
    Map<Integer, Integer> amntsUser;

    public Split(Integer userId, Integer amnt, ArrayList<User> usersList){
        this.userId = userId;
        this.amnt = amnt;
        this.usersList = usersList;
        this.amntsUser = new HashMap<>();
    }

    public Integer getUserId(){
        return userId;
    }

    public abstract Map<Integer, Integer>  handleSplit();

    public void showSplitPaidUser(){
        System.out.println(" Paid by = "+userId);
        for(int i=0; i<usersList.size(); i++){
            System.out.println(" ower name = "+usersList.get(i).getUserId() + " ower amont = "+amntsUser.get(usersList.get(i).getUserId()));
        }
    }

    public void showSplitOweUser(User oweUser){
        if(getAmntsUser().get(oweUser.getUserId())!=null){
            System.out.println(" ower name = "+ oweUser.getUserId() + " ower amuont = "+getAmntsUser().get(oweUser.getUserId())+" paid user = "+getUserId());
        }
    }

    public Map<Integer, Integer> getAmntsUser(){
        return amntsUser;
    }
}
