package com.cosmetic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cosmetic.domain.Link;
import com.cosmetic.repository.LinkRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/link", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class LinkController {

	@Autowired
	private LinkRepository linkRepository;

	@RequestMapping(value = "{linkId}")
	public Link getLink(@PathVariable Long linkId) {

		Link link = linkRepository.findOne(linkId);
		return link;
	}

	@RequestMapping(value = "/item/{itemId}")
	public List<Link> getLinklist(@PathVariable("itemId") Long itemId) {
		List<Link> linkList = linkRepository.findAllByItemId(itemId);

		return linkList;
	}

}