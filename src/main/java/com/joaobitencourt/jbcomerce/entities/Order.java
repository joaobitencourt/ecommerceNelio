package com.joaobitencourt.jbcomerce.entities;

import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//gerar automaticamente o id
	private Long id;
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant moment;
	private OrderStatus satatus;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private User client;

	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)//cascadeType - particularidade do JPA
	private Payment payment;

	@OneToMany(mappedBy = "id.order")
	private Set<OrderItem> items = new HashSet<>();

	public Order() {
	}

	public Order(Long id, Instant moment, OrderStatus satatus, User client, Payment payment) {
		this.id = id;
		this.moment = moment;
		this.satatus = satatus;
		this.client = client;
		this.payment = payment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getSatatus() {
		return satatus;
	}

	public void setSatatus(OrderStatus satatus) {
		this.satatus = satatus;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Set<OrderItem> getItems() {
		return items;
	}

	//usamos o map para converter esses items para a lista de produtos
	public List<Product> getProducts(){
		return items.stream().map(x -> x.getProduct()).toList();
	}
}
