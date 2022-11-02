package com.radike.porfolio.controller;

import com.radike.porfolio.model.Skills;
import com.radike.porfolio.service.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class SkillsController {

    @Autowired
    private SkillsService skillsService;

    @GetMapping("/porfolio-service/skills/")
    public List<Skills> getSkills() { return skillsService.getSkills(); }

    @PostMapping("/porfolio-service/skills/")
    public String createSkills(@RequestBody Skills skills) {
        skillsService.saveSkills(skills);
        return "la skill quedo re guardada che";
    }

    @DeleteMapping("/porfolio-service/skills/{id}")
    public String deleteSkills(@PathVariable Long id) {
        skillsService.deleteSkills(id);
        return "esa skills no existe mas";
    }

    @PutMapping("/porfolio-service/skills/{id}")
    public Skills editSkills(@PathVariable Long id,
                               @RequestParam("name") String newName,
                               @RequestParam("type") String newType,
                               @RequestParam("cap") String newCap,
                               @RequestParam("icon") String newIcon) {

        Skills skills = skillsService.findSkills(id);

        skills.setName(newName);
        skills.setType(newType);
        skills.setCap(newCap);
        skills.setIcon(newIcon);

        skillsService.saveSkills(skills);

        return skills;

    }

}
