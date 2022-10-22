package com.radike.porfolio.service;


import com.radike.porfolio.model.About;

import java.util.List;

public interface IAboutService {

    public List<About> getAbout ();

    public void saveAbout (About about);

    public void deleteAbout (Long id);

    public About findAbout (Long id);

}
