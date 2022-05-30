package com.capgemini.bakery.taxonomy.shop.controller;

import com.capgemini.bakery.taxonomy.shop.model.dto.ShopDto;
import com.capgemini.bakery.taxonomy.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/bakery/v1/taxonomy/shops")
public class ShopController {

    private final ShopService shopService;

    @Autowired
    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @PostMapping("/")
    public ResponseEntity<ShopDto> postRegion(@RequestBody @Valid ShopDto shopDto){
        return new ResponseEntity<>(shopService.add(shopDto), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<ShopDto>> getAllRegions(){
        return new ResponseEntity<>(shopService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShopDto> getRegionByID(@PathVariable Long id){
        return new ResponseEntity<>(shopService.getById(id),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ShopDto> deleteByID(@PathVariable Long id){
        return new ResponseEntity<>(shopService.deleteById(id),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ShopDto> updateByID(@PathVariable Long id, @RequestBody @Valid ShopDto shopDto){
        return new ResponseEntity<>(shopService.updateRegionByID(id,shopDto),HttpStatus.OK);
    }
}
