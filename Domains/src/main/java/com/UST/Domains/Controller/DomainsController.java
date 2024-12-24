package com.UST.Domains.Controller;

import com.UST.Domains.Model.Domains;
import com.UST.Domains.Service.DomainsService;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/domains")
public class DomainsController {

    @Autowired
    private DomainsService domainsService;

    // POST endpoint to add a new domain
    @PostMapping("/addemployees")
    public Mono<Domains> addDomain(@RequestBody Domains domain) {
        return domainsService.addDomains(domain);
    }

    // GET endpoint to fetch a domain by its ID
    @GetMapping("/{domain_id}")
    public Mono<Domains> getDomainById(@PathVariable String domain_id) {
        return domainsService.getDomainsById(domain_id);
    }

    // GET endpoint to fetch all domains
    @GetMapping
    public Flux<Domains> getAllDomains() {
        return domainsService.getAllDomains();
    }
}
