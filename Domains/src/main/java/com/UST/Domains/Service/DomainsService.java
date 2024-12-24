package com.UST.Domains.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.UST.Domains.Model.Domains;
import com.UST.Domains.Repository.DomainsRepository;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Service
public class DomainsService {

    @Autowired
    private DomainsRepository domainsRepository;

    // Method to add a new domain
    public Mono<Domains> addDomains(Domains domain) {
        return domainsRepository.save(domain);
    }

    // Method to get a domain by its ID
    public Mono<Domains> getDomainsById(String domain_id) {
        return domainsRepository.findById(domain_id);
    }
    

    // Method to get all domains
    public Flux<Domains> getAllDomains() {
        return domainsRepository.findAll();
    }
}
