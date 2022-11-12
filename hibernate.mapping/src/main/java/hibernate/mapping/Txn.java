package hibernate.mapping;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "TRANSACTION1")
public class Txn {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "txn_id")
	private long id;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "txn_date")
	private Date date;
	
	@OneToOne(mappedBy = "txn" )
	@Cascade(value = CascadeType.SAVE_UPDATE)
	private Customer customer;

	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Txn [id=" + id + ", amount=" + amount + ", date=" + date + "]";
	}
	
	

}
