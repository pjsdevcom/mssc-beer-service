package com.pjsdev.msscbeerservice.bootstrap;

import com.pjsdev.msscbeerservice.domain.Beer;
import com.pjsdev.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;

//@Component
public class BeerLoader implements CommandLineRunner { //will run every time Spring context starts

    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    public static final String BEER_3_UPC = "0083783375213";

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {

            beerRepository.save(Beer.builder()
                    .beerName("Frickin Hazer Beams")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(100)
                    .minOnHand(12)
                    .upc(BEER_1_UPC)
                    .price(new BigDecimal("2.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Citrus Got Real")
                    .beerStyle("TART_ALE")
                    .quantityToBrew(120)
                    .minOnHand(12)
                    .upc(BEER_2_UPC)
                    .price(new BigDecimal("3.45"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Woo-Tang")
                    .beerStyle("IPA")
                    .quantityToBrew(80)
                    .minOnHand(6)
                    .upc(BEER_3_UPC)
                    .price(new BigDecimal("4.95"))
                    .build());
        }
    }
}
