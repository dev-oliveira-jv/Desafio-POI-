package tech.JV.poi.Controller;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/points-of-interests-list")
    public ResponseEntity<Page<PointOfInterest>> listPoi(@RequestParam(name = "page", defaultValue = "0") Integer page,
                                        @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){

        var allPoi = repository.findAll(PageRequest.of(page, pageSize));

        return ResponseEntity.ok(allPoi);
    }

    @PostMapping("/near-me")
    public ResponseEntity<List<PointOfInterest>> nearMe(@RequestParam("x") Long x,
                                                        @RequestParam("y") Long y,
                                                        @RequestParam("dmax") Long dmax){
        
        var xMin = x - dmax;
        var xMax = x + dmax;
        var yMin = y- dmax;
        var yMax = y + dmax;

        var body = repository.findNearMe(xMin, xMax, yMax, yMin);

        return ResponseEntity.ok(body);
    }
}
