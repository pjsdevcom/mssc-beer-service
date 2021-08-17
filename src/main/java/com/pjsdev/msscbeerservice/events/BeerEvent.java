package com.pjsdev.msscbeerservice.events;

import com.pjsdev.msscbeerservice.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -8007316844957682933L;

    private final BeerDto beerDto;
}
