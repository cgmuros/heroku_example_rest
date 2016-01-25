/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgmuros.resources.impl;

import com.cgmuros.resources.Item;
import com.cgmuros.resources.ItemResource;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Path;

/**
 *
 * @author cgmuros
 */
@Path("/item")
public class ItemResourceImpl implements ItemResource {

    @Override
    public List<Item> getItems() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(100, "Widget", "A basic widget"));
        items.add(new Item(200, "SuperWidget", "A super widget"));
        items.add(new Item(300, "UberSuperWidget", "A uber super widget"));
         
        return items;
    }
    
}
