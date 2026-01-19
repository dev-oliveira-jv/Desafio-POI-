package tech.JV.poi.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tech.JV.poi.Controller.dtos.CreatePOI;
import tech.JV.poi.Entity.PointOfInterest;
import tech.JV.poi.Repository.PointOfInterestRepository;

@RestController
public class PointOfInterestController {

    private final PointOfInterestRepository repository;

    public PointOfInterestController(PointOfInterestRepository repository) {
        this.repository = repository;
    }


    @PostMapping("/points-of-interests")
    public ResponseEntity<Void> createPoi(@RequestBody CreatePOI body){

        repository.save(new PointOfInterest( body.name(), body.x(), body.y()));

        return ResponseEntity.ok().build();
    }
}
