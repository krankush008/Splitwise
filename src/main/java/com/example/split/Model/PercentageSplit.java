package com.example.split.Model;

import java.util.ArrayList;
import java.util.Map;

public class PercentageSplit extends Split{

    Map<Integer, Integer> percentageShare;
    public PercentageSplit(Integer userId, Integer amnt, ArrayList<User> usersList, Map<Integer, Integer> percentageShare){
        super(userId, amnt, usersList);
        this.percentageShare = percentageShare;
    }
    
    public Map<Integer, Integer> handleSplit(){
        for(int i=0; i<usersList.size(); i++){
            amntsUser.put(usersList.get(i).getUserId(), percentageShare.get(usersList.get(i).getUserId())*amnt/100);
        }
        return amntsUser;
    }
    
}
