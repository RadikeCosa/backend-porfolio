package com.radike.porfolio.controller;

import com.radike.porfolio.model.Links;
import com.radike.porfolio.service.LinksService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://dev-simple-porfolio.web.app"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class LinksController {

    @Autowired
    private LinksService linksService;

    @GetMapping("/porfolio-service/links/")
    public List<Links> getHome() {
        return linksService.getLinks();
    }

    @PostMapping("/porfolio-service/links/")
    public String createLink(@RequestBody Links link) {
        linksService.saveLink(link);
        return "el registro fue demasiado bien creado";
    }

    @DeleteMapping("/porfolio-service/links/{id}")
    public String deleteHome(@PathVariable Long id) {
        linksService.deleteLink(id);
        return "con gran respeto te digo que se elimino correctamente y lo vamos a extrañar";
    }

    @PutMapping("/porfolio-service/links/{id}")
    public Links editLink(@PathVariable Long id, @RequestBody Links updatedLink) {
        Links link = linksService.findLink(id);

        link.setTitle(updatedLink.getTitle());
        link.setRoute(updatedLink.getRoute());
        link.setIcon(updatedLink.getIcon());

        linksService.saveLink(link);

        return link;
    }

}
