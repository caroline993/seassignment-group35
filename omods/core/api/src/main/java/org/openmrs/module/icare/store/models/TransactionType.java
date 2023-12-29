package org.openmrs.module.icare.store.models;

// Generated Oct 7, 2020 12:48:40 PM by Hibernate Tools 5.2.10.Final

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * StTransactionType generated by hbm2java
 */
@Entity
@Table(name = "st_transaction_type")
public class TransactionType implements java.io.Serializable {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "transaction_type_id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "name")
	private Integer name;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transactionType")
	private List<Transaction> transactions = new ArrayList<Transaction>(0);
	
	public Integer getName() {
		return this.name;
	}
	
	public void setName(Integer name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public List<Transaction> getTransactions() {
		return transactions;
	}
	
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
}
