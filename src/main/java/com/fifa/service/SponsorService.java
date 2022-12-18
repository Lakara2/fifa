package com.fifa.service;

import com.fifa.model.Sponsor;
import com.fifa.repository.SponsorRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SponsorService {
    private final SponsorRepository repository;

    @Transactional
    public List<Sponsor> getAllSponsor() {
        return repository.findAll();
    }
    @Transactional
    public List<Sponsor> createSponsor(List<Sponsor> SponsorList) {
        return repository.saveAll(SponsorList);
    }
    @Transactional
    public List<Sponsor> updateSponsor(List<Sponsor> SponsorList) {
        return repository.saveAll(SponsorList);
    }

    public Sponsor deleteByName(String nom){
        Optional<Sponsor> spons = repository.findById(nom);

        if(spons.isPresent()){
            repository.deleteById(nom);
            return spons.get();
        }
        else {
            throw new RuntimeException("Sponsor."+ nom +"not found");
        }
    }

}
