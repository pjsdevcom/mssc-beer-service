package com.pjsdev.msscbeerservice.web.mappers;

import com.pjsdev.msscbeerservice.domain.Beer;
import com.pjsdev.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
