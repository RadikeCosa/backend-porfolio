package com.radike.porfolio.service;

import com.radike.porfolio.model.About;
import com.radike.porfolio.repository.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutService implements IAboutService{

    @Autowired
    private AboutRepository aboutRepository;


    @Override
    public List<About> getAbout() {
        return aboutRepository.findAll();
    }

    @Override
    public void saveAbout(About about) {
        aboutRepository.save(about);
    }

    @Override
    public void deleteAbout(Long id) {
        aboutRepository.deleteById(id);
    }

    @Override
    public About findAbout(Long id) {
        return aboutRepository.findById(id).orElse(null);
    }
}
