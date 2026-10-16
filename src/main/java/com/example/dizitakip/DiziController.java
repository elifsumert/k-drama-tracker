package com.example.dizitakip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/diziler")
public class DiziController {

    @Autowired
    private DiziRepository diziRepository;

    // Veritabanına yeni dizi ekleme metodu (POST)
    @PostMapping
    public Dizi diziEkle(@RequestBody Dizi yeniDizi) {
        return diziRepository.save(yeniDizi);
    }

    // Veritabanındaki tüm dizileri listeleme metodu (GET)
    @GetMapping
    public List<Dizi> tumDizileriGetir() {
        return diziRepository.findAll();
    }
}