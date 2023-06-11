/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.radike.porfolio.service;

import com.radike.porfolio.model.Links;
import java.util.List;

/**
 *
 * @author ramir
 */
public interface ILinksService {
    
    public List<Links> getLinks();
    
    public void saveLink (Links link);
    
    public void deleteLink(Long id);
    
    public Links findLink (Long id);
    
}
