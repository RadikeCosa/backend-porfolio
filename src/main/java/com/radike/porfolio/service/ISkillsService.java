package com.radike.porfolio.service;

import com.radike.porfolio.model.Skills;

import java.util.List;

public interface ISkillsService {

    public List<Skills> getSkills ();

    public void saveSkills (Skills skills);

    public void deleteSkills (Long id);

    public Skills findSkills (Long id);
}
