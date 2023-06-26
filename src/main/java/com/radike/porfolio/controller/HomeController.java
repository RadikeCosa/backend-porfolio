package com.radike.porfolio.controller;

import com.radike.porfolio.model.Home;
import com.radike.porfolio.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://dev-simple-porfolio.web.app"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/porfolio-service/home/")
    public List<Home> getHome() {
        return homeService.getHome();
    }

    @PostMapping("/porfolio-service/home/")
    public Home createHome(@RequestBody Home home) {
        homeService.saveHome(home);
        return home;
    }

    @DeleteMapping("/porfolio-service/home/{id}")
    public Long deleteHome(@PathVariable Long id) {
        homeService.deleteHome(id);
        return id;
    }

    @PutMapping("/porfolio-service/home/{id}")
    public Home editHome(@PathVariable Long id, @RequestBody Home updatedHome) {
        Home home = homeService.findHome(id);

        home.setTitle1(updatedHome.getTitle1());
        home.setTitle2(updatedHome.getTitle2());
        home.setTitle3(updatedHome.getTitle3());
        home.setImage1(updatedHome.getImage1());
        home.setImage2(updatedHome.getImage2());
        home.setIcon(updatedHome.getIcon());

        homeService.saveHome(home);

        return home;
    }

}
