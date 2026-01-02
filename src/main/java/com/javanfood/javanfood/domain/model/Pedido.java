package com.javanfood.javanfood.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;

	@Column(name = "sub_total", nullable = false)
	private BigDecimal subTotal;
	@Column(name = "taxa_frete", nullable = false)
	private BigDecimal taxaFrete;
	@Column(name = "valor_total", nullable = false)
	private BigDecimal valorTotal;

	@CreationTimestamp
	private LocalDateTime dataCriacao;

	@CreationTimestamp
	private LocalDateTime dataConfirmacao;

	@CreationTimestamp
	private LocalDateTime dataEntrega;

	@Embedded
	private Endereco endereco;

	@OneToMany(mappedBy = "pedido")
	private List<ItemPedido> itemPedido;

}
