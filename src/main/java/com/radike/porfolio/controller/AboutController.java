package com.radike.porfolio.controller;

import com.radike.porfolio.model.About;
import com.radike.porfolio.service.IAboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class AboutController {

    @Autowired
    private IAboutService aboutService;

    @GetMapping ("/porfolio-service/about/")
    public List<About> getAbout() {
        return aboutService.getAbout();
    }

    @PostMapping("/porfolio-service/about/")
    public String saveAbout(@RequestBody About about) {
        aboutService.saveAbout(about);
        return "el registro fue guardado correctamente bro";
    }

    @DeleteMapping("/porfolio-service/about/{id}")
    public String deleteAbout(@PathVariable Long id) {
        aboutService.deleteAbout(id);
        return "el registro fue eliminado exitosamente ameo";
    }

    @PutMapping("/porfolio-service/about/{id}")
    public About editAbout (@PathVariable Long id,
                            @RequestParam("title") String newTitle,
                            @RequestParam("description") String newDescription,
                            @RequestParam("image") String newImage) {

        About about = aboutService.findAbout(id);

        about.setTitle(newTitle);
        about.setDescription(newDescription);
        about.setImage(newImage);

        aboutService.saveAbout(about);

        return about;
    }

}
