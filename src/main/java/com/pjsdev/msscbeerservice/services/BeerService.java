package com.pjsdev.msscbeerservice.services;

import com.pjsdev.msscbeerservice.web.model.BeerDto;
import com.pjsdev.msscbeerservice.web.model.BeerPagedList;
import com.pjsdev.msscbeerservice.web.model.BeerStyle;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {

    BeerPagedList listBeers(String beerName, BeerStyle beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

    BeerDto getById(UUID beerId, Boolean showInventoryOnHand);

    BeerDto getByUpc(String beerUpc);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
