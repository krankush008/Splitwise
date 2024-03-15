package com.example.split.Service;

import com.example.split.Model.Split;
import com.example.split.Model.SplitManager;
import com.example.split.Model.User;

public class Splitwise {
    SplitManager splitManager;

    public Splitwise(){
        this.splitManager = new SplitManager();
    }

    public void handleSplit(Split split){
        splitManager.setSplit(split);
    }

    public void getSplitsForUser(User userId){
        splitManager.getSplitsForUser(userId);
    }
}
