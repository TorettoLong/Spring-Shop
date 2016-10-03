package br.com.lucas.springShop.daos;

import java.util.List;

import br.com.lucas.springShop.exceptions.ShopNotFound;
import br.com.lucas.springShop.models.Shop;

public interface ShopService{

	public Shop create(Shop shop);

	public Shop delete(int id) throws ShopNotFound;

	public List<Shop> findAll();

	public Shop update(Shop shop) throws ShopNotFound;

	public Shop findById(int id);

}
