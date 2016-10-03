package br.com.lucas.springShop.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucas.springShop.models.Shop;

public interface ShopRepository extends JpaRepository<Shop,Integer>{

}
