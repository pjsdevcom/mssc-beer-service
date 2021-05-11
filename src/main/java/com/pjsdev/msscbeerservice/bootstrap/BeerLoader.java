package com.pjsdev.msscbeerservice.bootstrap;

import com.pjsdev.msscbeerservice.domain.Beer;
import com.pjsdev.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner { //will run every time Spring context starts

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {

            beerRepository.save(Beer.builder()
                    .beerName("Frickin Hazer Beams")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(100)
                    .minOnHand(12)
                    .upc(72527273070L)
                    .price(new BigDecimal("2.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Citrus Got Real")
                    .beerStyle("TART_ALE")
                    .quantityToBrew(120)
                    .minOnHand(12)
                    .upc(72527273071L)
                    .price(new BigDecimal("3.45"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Woo-Tang")
                    .beerStyle("IPA")
                    .quantityToBrew(80)
                    .minOnHand(6)
                    .upc(72527273072L)
                    .price(new BigDecimal("4.95"))
                    .build());
        }
    }
}
