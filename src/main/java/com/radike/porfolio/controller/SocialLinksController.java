package com.radike.porfolio.controller;

import com.radike.porfolio.model.SocialLinks;
import com.radike.porfolio.service.ISocialLinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class SocialLinksController {

    @Autowired
    private ISocialLinksService socialLinksService;

    @GetMapping("/porfolio-service/social-links/")
    public List<SocialLinks> getSocialLinks() {
        return socialLinksService.getSocialLinks();
    }

    @PostMapping("/porfolio-service/social-links/")
    public String createSocialLinks(@RequestBody SocialLinks socialLinks) {
        socialLinksService.saveSocialLinks(socialLinks);
        return "el registro esta en un cluster bro";
    }

    @DeleteMapping("/porfolio-service/social-links/{id}")
    public String deleteSocialLinks(@PathVariable Long id) {
        socialLinksService.deleteSocialLinks(id);
        return "con gran respeto te digo que se elimino correctamente y no lo veremos mas";
    }

    @PutMapping("/porfolio-service/social-links/{id}")
    public SocialLinks editSocialLinks(@PathVariable Long id,
                                       @RequestParam("name") String newName,
                                       @RequestParam("icon") String newIcon,
                                       @RequestParam("link") String newLink) {

        SocialLinks socialLinks = socialLinksService.findSocialLinks(id);

        socialLinks.setName(newName);
        socialLinks.setIcon(newIcon);
        socialLinks.setLink(newLink);

        socialLinksService.saveSocialLinks(socialLinks);

        return socialLinks;
    }

}
