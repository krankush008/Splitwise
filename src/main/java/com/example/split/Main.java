package com.example.split;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.split.Model.PercentageSplit;
import com.example.split.Model.Split;
import com.example.split.Model.User;
import com.example.split.Service.Splitwise;

public class Main {
    public static void main(String[] args) {

        Splitwise splitwise = new Splitwise();
        User paidUser = new User(4);
        User user1 = new User(5);
        User user2 = new User(6);
        User user3 = new User(8);
        User user4 = new User(9);
        User user5 = new User(10);
        ArrayList<User> usersList = new ArrayList<>();
        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);
        usersList.add(user5);
        Map<Integer, Integer> exactShare =  new HashMap<>();
        exactShare.put(5, 10);
        exactShare.put(6, 20);
        exactShare.put(8, 15);
        exactShare.put(9, 15);
        exactShare.put(10, 40);
        Split split = new PercentageSplit(4, 1000, usersList, exactShare);
        splitwise.handleSplit(split);
        splitwise.getSplitsForUser(user3);
    }
}