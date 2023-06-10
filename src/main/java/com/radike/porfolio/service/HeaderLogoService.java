package com.radike.porfolio.service;

import com.radike.porfolio.model.HeaderLogo;
import com.radike.porfolio.repository.HeaderLogoRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class HeaderLogoService implements IHeaderLogoService {
        
    @Autowired
    private HeaderLogoRepository headerLogoRepository;
      
    @Override
    public List<HeaderLogo> getHeaderLogo() {
        return headerLogoRepository.findAll();
    }

    @Override
    public HeaderLogo FindHeaderLogo(Long id) {
        return headerLogoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveHeaderLogo(HeaderLogo headerLogo) {
        headerLogoRepository.save(headerLogo);
                }

    
}
