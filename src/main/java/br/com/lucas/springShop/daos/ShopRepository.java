package br.com.lucas.springShop.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lucas.springShop.models.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop,Integer>{

}
