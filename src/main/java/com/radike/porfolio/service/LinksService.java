package com.radike.porfolio.service;

import com.radike.porfolio.model.Links;
import com.radike.porfolio.repository.LinksRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinksService implements ILinksService{

    @Autowired
    private LinksRepository linksRepository;
    
    @Override
    public List<Links> getLinks() {
        return linksRepository.findAll();
    }

    @Override
    public void saveLink(Links link) {
        linksRepository.save(link);
    }

    @Override
    public void deleteLink(Long id) {
        linksRepository.deleteById(id);
    }

    @Override
    public Links findLink(Long id) {
        return linksRepository.findById(id).orElse(null);
    }
    
    
}
