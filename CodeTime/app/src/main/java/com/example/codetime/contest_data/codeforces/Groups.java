package com.example.codetime.contest_data.codeforces;

import java.util.ArrayList;
public class Groups extends Data{
    public int id;
    public final String WEBSITE_NAME = "Codeforces";
    public  ArrayList<String> name;
    public ArrayList<String> type;
    public ArrayList<String> phase;
    public ArrayList<String> frozen;
    public ArrayList<Integer>durationSeconds;
    public ArrayList<Integer>startTimeSeconds;
    public ArrayList<Integer> relativeTimeSeconds;

    // public Groups(){
    //     name = new ArrayList<>();
    //     phase = new ArrayList<>();
    //     type = new ArrayList<>();
    //     frozen = new ArrayList<>();
    //     durationSeconds = new ArrayList<>();
    //     startTimeSeconds = new ArrayList<>();
    //     relativeTimeSeconds = new ArrayList<>();
    // }

    //minimum size of all data
    public int getMinSize(){
        int s = Math.min(name.size(),phase.size());
        s = Math.min(s,durationSeconds.size());
        return s;
    }
}
