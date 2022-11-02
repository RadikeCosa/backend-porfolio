package com.radike.porfolio.service;

import com.radike.porfolio.model.Skills;
import com.radike.porfolio.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsService implements ISkillsService{

    @Autowired
    private SkillsRepository skillsRepository;

    @Override
    public List<Skills> getSkills() {
        return skillsRepository.findAll();
    }

    @Override
    public void saveSkills(Skills skills) {
        skillsRepository.save(skills);
    }

    @Override
    public void deleteSkills(Long id) {
        skillsRepository.deleteById(id);
    }

    @Override
    public Skills findSkills(Long id) {
        return skillsRepository.findById(id).orElse(null);
    }
}
