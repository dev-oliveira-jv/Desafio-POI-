package tech.JV.poi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.JV.poi.Entity.PointOfInterest;

public interface PointOfInterestRepository extends JpaRepository<PointOfInterest, Long> {

    
}
