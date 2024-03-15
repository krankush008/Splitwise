package com.example.split.Model;

import java.util.ArrayList;
import java.util.Map;

public class ExactSplit extends Split{
    Map<Integer, Integer> exactShare;

    public ExactSplit(Integer userId, Integer amnt, ArrayList<User> usersList, Map<Integer, Integer> exactShare){
        super(userId, amnt, usersList);
        this.exactShare = exactShare;
    }
    
    public Map<Integer, Integer> handleSplit(){
        for(int i=0; i<usersList.size(); i++){
            amntsUser.put(usersList.get(i).getUserId(), exactShare.get(usersList.get(i).getUserId()));
        }
        return amntsUser;
    }
}
