package com.cosmetic.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;


	@Column
	private String name;
	@Column(name = "category_id")
	private Long categoryId;
	@Column
	private int price;
	@Column
	private String content;
	@Column(name = "create_at")
	private Date createAt;
	@Column(name = "modify_at")
	private Date modifyAt;
    @Column(name = "image_url")
    private String imageUrl;



}
