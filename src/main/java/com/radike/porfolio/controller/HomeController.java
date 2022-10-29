package com.radike.porfolio.controller;

import com.radike.porfolio.model.Home;
import com.radike.porfolio.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/porfolio-service/home/")
    public List <Home> getHome() {
        return homeService.getHome();
    }

    @PostMapping("/porfolio-service/home/")
    public String createHome(@RequestBody Home home){
        homeService.saveHome(home);
        return  "el registro fue demasiado bien creado";
    }

    @DeleteMapping("/porfolio-service/home/{id}")
    public String deleteHome(@PathVariable Long id) {
        homeService.deleteHome(id);
        return "con gran respeto te digo que se elimino correctamente y lo vamos a extrañar";
    }

    @PutMapping("/porfolio-service/home/{id}")
    public Home editHome (@PathVariable Long id,
                          @RequestParam("name") String newName,
                          @RequestParam("lastName") String newLastName,
                          @RequestParam("title") String newTitle,
                          @RequestParam("title2") String newTitle2,
                          @RequestParam("cap") String newCap,
                          @RequestParam("cap2") String newCap2) {

        Home home = homeService.findHome(id);

        home.setName(newName);
        home.setLastName(newLastName);
        home.setTitle(newTitle);
        home.setTitle2(newTitle2);
        home.setCap(newCap);
        home.setCap2(newCap2);

        homeService.saveHome(home);

        return home;

    }


}
