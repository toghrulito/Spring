package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region,Long> {

    // Display all regions in Canada

    List<Region> findByCountry(String country);   //SELECT * FROM regions r WHERE country = 'Canada';

// Display all the region with distinct

    List<Region> findDistinctByCountry(String county);  //SELECT Distinct * FROM regions r WHERE country = 'Canada';

    // Display all regions with county name includes 'United'

    List<Region> findByCountryContaining(String country);

    // Display all regions with county name includes 'United' in order

    List<Region> findByCountryContainingOrderByCountry(String country);

    //Display top 2 regions in Canada

    List<Region> findTop2ByCountry(String country);



}
