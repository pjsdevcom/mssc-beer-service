package com.pjsdev.msscbeerservice.repositories;

import com.pjsdev.msscbeerservice.domain.Beer;
import com.pjsdev.msscbeerservice.web.model.BeerStyle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

//No need to annotate with @Repository
public interface BeerRepository extends JpaRepository<Beer, UUID> {

    Optional<Beer> findByUpc(String beerUpc);

    Page<Beer> findAllByBeerName(String beerName, Pageable pageable);

    Page<Beer> findAllByBeerStyle(BeerStyle beerStyle, Pageable pageable);

    Page<Beer> findAllByBeerNameAndBeerStyle(String beerName, BeerStyle beerStyle, Pageable pageable);
}
