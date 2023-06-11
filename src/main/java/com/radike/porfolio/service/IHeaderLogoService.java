/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.radike.porfolio.service;

import com.radike.porfolio.model.HeaderLogo;
import java.util.List;

/**
 *
 * @author ramir
 */
public interface IHeaderLogoService {
    
    public List<HeaderLogo> getHeaderLogo();
    
    public void saveHeaderLogo (HeaderLogo headerLogo);
  
    public HeaderLogo FindHeaderLogo (Long id);
}

