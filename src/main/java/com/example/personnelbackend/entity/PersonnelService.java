package com.example.personnelbackend.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonnelService {
    private final PersonnelRepository repository;

    @Autowired
    public PersonnelService(PersonnelRepository repository) {
        this.repository = repository;
    }

    public Personnel savePersonnel(Personnel personnel) {
        return repository.save(personnel);
    }

    public List<Personnel> getAllPersonnel() {
        return repository.findAll();
    }

    public Optional<Personnel> getPersonnelById(Long id) {
        return repository.findById(id);
    }

    public void deletePersonnel(Long id) {
        repository.deleteById(id);
    }
}
