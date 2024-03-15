package com.example.split.Model;

import java.util.ArrayList;

public class SplitManager {
    
    ArrayList<Split> splits;

    public SplitManager(){
        splits = new ArrayList<>();
    }

    public void setSplit(Split split){
        split.handleSplit();
        splits.add(split);
    }

    public void getSplitsForUser(User userId){
        for(int i=0; i<splits.size(); i++){
            if(splits.get(i).getUserId()==userId.getUserId()){
                splits.get(i).showSplitPaidUser();
            }
        }
        for(int i=0; i<splits.size(); i++){
            splits.get(i).showSplitOweUser(userId);
        }
    }


}
