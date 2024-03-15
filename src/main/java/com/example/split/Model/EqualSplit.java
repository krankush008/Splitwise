package com.example.split.Model;

import java.util.ArrayList;
import java.util.Map;

public class EqualSplit extends Split{

    public EqualSplit(Integer userId, Integer amnt, ArrayList<User> usersList){
        super(userId, amnt, usersList);
    }

    public Map<Integer, Integer> handleSplit(){
        Integer amntPerShare = amnt/usersList.size();
        for(int i=0; i<usersList.size(); i++){
            amntsUser.put(usersList.get(i).getUserId(), amntPerShare);
        }
        return amntsUser;
    }
}
