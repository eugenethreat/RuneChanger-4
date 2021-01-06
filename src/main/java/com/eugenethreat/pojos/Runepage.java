package com.eugenethreat.pojos;

import java.util.ArrayList;

public class Runepage {

    private String name;
    private int primaryId;
    private int subId;
    ArrayList<String> choices = new ArrayList<>();

    public Runepage(String name, int primaryId, int subId, ArrayList<String> choices) {
        this.name = name;
        this.primaryId = primaryId;
        this.subId = subId;
        this.choices = choices;
    }

    public Runepage() {
    }

    /*
        getters n setters
         */
    public Runepage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrimaryId() {
        return primaryId;
    }

    public int getSubId() {
        return subId;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrimaryId(int primaryId) {
        this.primaryId = primaryId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    @Override
    public String toString() {
        return "name: " + name + " primaryId: " + primaryId + " subId: " + subId + " Runes: " + choices;
    }
}
