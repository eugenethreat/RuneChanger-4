package com.eugenethreat.Controller;


import com.eugenethreat.Model.RunePuller;
import com.eugenethreat.Model.RunepageFactory;
import com.eugenethreat.pojos.Runepage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


@SpringBootApplication
@RestController
//tells spring that this class is the controller / sba
public class RuneController {

    /*
    This class acts as the handler for incoming requests
     */

    RunePuller rp = new RunePuller();
    //object w/ method that pulls runes

    public static void main(String[] args) {
        SpringApplication.run(RuneController.class, args);
    }

    /*
    URL mappings
     */

    //http://localhost:8080/getrunes?champion=poppy
    @GetMapping("/getrunes")
    public String getPages(@RequestParam(value = "champion", defaultValue = "") String champion) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Runepage page = new Runepage();
            RunepageFactory factory = new RunepageFactory();
            ArrayList<String> runes = rp.returnRunes(champion);

            page.setName("Runes: " + champion);
            page.setChoices(runes);
            page.setPrimaryId(factory.getPrimaryId(runes));
            page.setSubId(factory.getSubId(runes));

            String jsonRunes = gson.toJson(page, Runepage.class);

            return jsonRunes;

        } catch (NullPointerException n) {
            return "champ not found!";
        }

    }


}
