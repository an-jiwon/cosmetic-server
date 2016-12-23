package com.cosmetic.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cosmetic.domain.Item;
import com.cosmetic.repository.ItemRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/item", produces = MediaType.APPLICATION_JSON_UTF8_VALUE )
public class ItemController {

	@Autowired
	private ItemRepository itemRepository;

	@RequestMapping
	public @ResponseBody List<Item> getCategoryList() {
		return itemRepository.findAll();
	}


	@RequestMapping(value = "{itemId}")
	public Item getItem(@PathVariable Long itemId) {
		Item item = itemRepository.findOne(itemId);

		return item;
	}

	@RequestMapping(value = "/list/{categoryId}")
	public List<Item> getItemlist(@PathVariable("categoryId") Long categoryId) {
		List<Item> itemList = itemRepository.findAllByCategoryId(categoryId);

		return itemList;
	}
}