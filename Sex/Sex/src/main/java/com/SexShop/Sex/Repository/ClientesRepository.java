package com.SexShop.Sex.Repository;

import com.SexShop.Sex.ShopEntity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, UUID> {

}
