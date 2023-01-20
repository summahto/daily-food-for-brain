package io.javabrains.moviecatalogservice.resource;


import io.javabrains.moviecatalogservice.model.CatalogItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.catalog.Catalog;

@RestController
@GetMapping("/movieCatalog")
public class MovieCatalogResource {

    @GetMapping("/{userId}")
    public List<CatalogItem> getMovieDetails(@PathVariable String userId){

    }

}
