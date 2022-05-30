package com.capgemini.bakery.taxonomy.region.controller;

import com.capgemini.bakery.taxonomy.region.model.dto.RegionDTO;
import com.capgemini.bakery.taxonomy.region.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/bakery/v1/region")
public class RegionController {

    private final RegionService regionService;

    @Autowired
    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    @PostMapping("/")
    public ResponseEntity<RegionDTO> postRegion(@RequestBody @Valid RegionDTO regionDTO){
        return new ResponseEntity<>(regionService.addRegion(regionDTO), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<RegionDTO>> getAllRegions(){
        return new ResponseEntity<>(regionService.getAllRegions(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegionDTO> getRegionByID(@PathVariable Integer id){
        return new ResponseEntity<>(regionService.getRegionByID(id),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RegionDTO> deleteByID(@PathVariable Integer id){
        return new ResponseEntity<>(regionService.deleteByID(id),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RegionDTO> updateByID(@PathVariable Integer id, @RequestBody @Valid RegionDTO regionDTO){
        return new ResponseEntity<>(regionService.updateRegionByID(id,regionDTO),HttpStatus.OK);
    }
}
