package com.cosmetic.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

@Entity
@Data
public class Link {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "item_id")
	private Long itemId;
	@Column(name = "mall_name")
	private String mallName;
	@Column
	private String link;
	@Column
	private int price;
	@Column(name = "create_at")
	private Date createAt;


}
