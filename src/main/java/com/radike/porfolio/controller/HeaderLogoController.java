package com.radike.porfolio.controller;


import com.radike.porfolio.model.HeaderLogo;
import com.radike.porfolio.service.HeaderLogoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, })
public class HeaderLogoController {
    

    @Autowired
    private HeaderLogoService headerLogoService;

    @GetMapping("/porfolio-service/logo/")
    public List <HeaderLogo> getHeaderLogo() {
        return headerLogoService.getHeaderLogo();
    }

    @PostMapping("/porfolio-service/logo/")
    public String createHome(@RequestBody HeaderLogo headerLogo){
        headerLogoService.saveHeaderLogo(headerLogo);
        return  "el registro fue demasiado bien creado";
    }


    @PutMapping("/porfolio-service/logo/{id}")
    public HeaderLogo editHeaderLogo (@PathVariable Long id,
                          @RequestParam("name") String newName,
                          @RequestParam("lastName") String newLastName,
                          @RequestParam("title") String newTitle,
                          @RequestParam("image") String newImage,
                          @RequestParam("logo") String newLogo) {

        HeaderLogo headerLogo = headerLogoService.FindHeaderLogo(id);
        headerLogo.setName(newName);
        headerLogo.setLastName(newLastName);
        headerLogo.setTitle(newTitle);
        headerLogo.setImage(newImage);
        headerLogo.setLogo(newLogo);
        
        return headerLogo;

    }


}
