package com.radike.porfolio.service;

import com.radike.porfolio.model.SocialLinks;
import com.radike.porfolio.repository.SocialLinksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialLinksService implements ISocialLinksService {

    @Autowired
    private SocialLinksRepository socialLinksRepository;

    @Override
    public List<SocialLinks> getSocialLinks() {
        return socialLinksRepository.findAll();
    }

    @Override
    public void saveSocialLinks(SocialLinks socialLinks) {
        socialLinksRepository.save(socialLinks);
    }

    @Override
    public void deleteSocialLinks(Long id) {
        socialLinksRepository.deleteById(id);
    }

    @Override
    public SocialLinks findSocialLinks(Long id) {
        return socialLinksRepository.findById(id).orElse(null);
    }
}
