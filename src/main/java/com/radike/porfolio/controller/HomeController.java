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
        
        if(updatedHome.getTitle1() != null){
            home.setTitle1(updatedHome.getTitle1());
        }
        if(updatedHome.getTitle2() != null){
            home.setTitle2(updatedHome.getTitle2());
        }
        if(updatedHome.getTitle3() != null){
            home.setTitle3(updatedHome.getTitle3());
        }
        if(updatedHome.getImage1() != null){
            home.setImage1(updatedHome.getImage1());
        }
        if(updatedHome.getImage2() != null){
            home.setImage2(updatedHome.getImage2());
        }
        if(updatedHome.getIcon() != null){
            home.setIcon(updatedHome.getIcon());
        }
        homeService.saveHome(home);

        return home;
    }

}
