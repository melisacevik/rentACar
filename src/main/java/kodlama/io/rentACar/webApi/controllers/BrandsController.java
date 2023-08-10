package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.abstracts.BrandService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/brands")

public class BrandsController {
     private BrandService brandService;

     @Autowired
    public BrandsController(BrandService brandService) {

         this.brandService = brandService;
    }

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll() {

         return brandService.getAll();
    }


    @PostMapping("/add")
    public void app(@RequestBody CreateBrandRequest createBrandRequest) {

         this.brandService.add(createBrandRequest);

     }
}