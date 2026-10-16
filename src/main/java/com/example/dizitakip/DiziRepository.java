package com.example.dizitakip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiziRepository extends JpaRepository<Dizi, Long> {
    // İçi bomboş kalacak, sihir buradası!
}