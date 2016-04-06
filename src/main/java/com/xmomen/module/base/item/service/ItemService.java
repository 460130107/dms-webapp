package com.xmomen.module.base.item.service;

import com.xmomen.module.base.item.model.CreateItem;
import com.xmomen.module.base.item.model.UpdateItem;

public interface ItemService {
	public void createItem(CreateItem createItem);
	
	public void updateItem(Integer id,UpdateItem updateItem);
	
	public void delete(Integer id);
}	
