package com.radike.porfolio.service;

import com.radike.porfolio.model.Home;
import com.radike.porfolio.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService implements IHomeService {

    @Autowired
    private HomeRepository homeRepository;

    @Override
    public List<Home> getHome() {
        return homeRepository.findAll();
    }

    @Override
    public void saveHome(Home home) {
        homeRepository.save(home);
    }

    @Override
    public void deleteHome(Long id) {
        homeRepository.deleteById(id);
    }

    @Override
    public Home findHome(Long id) {
        return homeRepository.findById(id).orElse(null);
    }
}
