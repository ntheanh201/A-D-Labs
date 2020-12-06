/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import java.util.List;

import entities.Item;

/**
 *
 * @author os_hoangpn
 */
public interface ItemDAO extends BaseDAO<Item> {

    List<Item> findItemInCart(int customerId);

    List<Item> findAll();

    List<Item> getItemByName(String name);
}
