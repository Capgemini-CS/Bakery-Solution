package com.capgemini.bakery.taxonomy.area.controller;

import com.capgemini.bakery.taxonomy.area.model.dto.AreaDTO;
import com.capgemini.bakery.taxonomy.area.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/bakery/v1/area")
public class AreaController {

    private final AreaService areaService;

    @Autowired
    public AreaController(AreaService areaService) {
        this.areaService = areaService;
    }

    @PostMapping("/")
    public ResponseEntity<AreaDTO> postArea(@RequestBody @Valid AreaDTO areaDTO){
        return new ResponseEntity<>(areaService.addArea(areaDTO), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<AreaDTO>> getAllAreas(){
        return new ResponseEntity<>(areaService.getAllAreas(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AreaDTO> getAreaByID(@PathVariable Integer id){
        return new ResponseEntity<>(areaService.getAreaByID(id),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AreaDTO> deleteByID(@PathVariable Integer id){
        return new ResponseEntity<>(areaService.deleteByID(id),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AreaDTO> updateByID(@PathVariable Integer id, @RequestBody @Valid AreaDTO areaDTO){
        return new ResponseEntity<>(areaService.updateAreaByID(id,areaDTO),HttpStatus.OK);
    }
}
