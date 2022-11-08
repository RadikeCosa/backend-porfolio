package com.radike.porfolio.service;

import com.radike.porfolio.model.SocialLinks;

import java.util.List;

public interface ISocialLinksService {

    public List<SocialLinks> getSocialLinks();

    public void saveSocialLinks(SocialLinks socialLinks);

    public void deleteSocialLinks(Long id);

    public SocialLinks findSocialLinks(Long id);


}
