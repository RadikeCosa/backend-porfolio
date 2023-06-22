package com.radike.porfolio.controller;

import com.radike.porfolio.model.HeaderLogo;
import com.radike.porfolio.service.HeaderLogoService;
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

public class HeaderLogoController {

    @Autowired
    private HeaderLogoService headerLogoService;

    @GetMapping("/porfolio-service/logo/")
    public List<HeaderLogo> getHeaderLogo() {
        return headerLogoService.getHeaderLogo();
    }

    @PostMapping("/porfolio-service/logo/")
    public String createHome(@RequestBody HeaderLogo headerLogo) {
        headerLogoService.saveHeaderLogo(headerLogo);
        return "el registro fue demasiado bien creado";
    }

    @DeleteMapping("/porfolio-service/logo/{id}")
    public String deleteHeaderLogo(@PathVariable Long id) {
        headerLogoService.deleteHome(id);
        return "con gran respeto te digo que se elimino correctamente y lo vamos a extrañar";
    }

    @PutMapping("/porfolio-service/logo/{id}")
    public HeaderLogo editHeaderLogo(@PathVariable Long id, @RequestBody HeaderLogo updatedHeaderLogo) {
        HeaderLogo headerLogo = headerLogoService.findHeaderLogo(id);

        headerLogo.setName(updatedHeaderLogo.getName());
        headerLogo.setLastName(updatedHeaderLogo.getLastName());
        headerLogo.setTitle(updatedHeaderLogo.getTitle());
        headerLogo.setImage(updatedHeaderLogo.getImage());
        headerLogo.setLogo(updatedHeaderLogo.getLogo());

        headerLogoService.saveHeaderLogo(headerLogo);

        return headerLogo;

    }
}