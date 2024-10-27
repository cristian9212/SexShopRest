package com.SexShop.Sex.Repository;

import com.SexShop.Sex.ShopEntity.Juguetes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JuguetesRepository extends JpaRepository<Juguetes, UUID> {

}