package com.eugenethreat.Model;

import java.util.ArrayList;

public class RunepageFactory {

    public RunepageFactory() {
    }

    /*
        precision: 8000
        domination: 8100
        sorcery: 8200
        inspiration: 8300
        resolve: 8400
     */

    public int getSubId(ArrayList<String> runes) {
        String arbSecond = String.valueOf(runes.get(4));
        //first secondary rune
        if (arbSecond.matches("81[0-9][0-9]")) {
            return 8100;
        } else if (arbSecond.matches("82[0-9][0-9]")) {
            return 8200;
        } else if (arbSecond.matches("83[0-9][0-9]")) {
            return 8300;
        } else if (arbSecond.matches("84[0-9][0-9]")) {
            return 8400;
        } else {
            return 8500;
        }

    }

    public int getPrimaryId(ArrayList<String> runes) {
        String arbFirst = String.valueOf(runes.get(0));

        if (arbFirst.matches("81[0-9][0-9]")) {
            return 8100;
        } else if (arbFirst.matches("82[0-9][0-9]")) {
            return 8200;
        } else if (arbFirst.matches("83[0-9][0-9]")) {
            return 8300;
        } else if (arbFirst.matches("84[0-9][0-9]")) {
            return 8400;
        } else {
            return 8500;
        }

    }
}
