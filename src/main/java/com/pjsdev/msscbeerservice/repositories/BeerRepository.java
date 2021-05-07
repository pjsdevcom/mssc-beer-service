package com.pjsdev.msscbeerservice.repositories;

import com.pjsdev.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

//No need to annotate with @Repository
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> { //extends CrudRepository
}
