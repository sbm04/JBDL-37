package hibernate.mapping.manytomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_id")
	private long id;
	
	@Column(name = "total")
	private double total;
	
	@Column(name = "customer_name")
	private String customerName;
	
	//@OneToMany(mappedBy = "cart")
//	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//	@JoinTable(name = "item_cart")
	@ManyToMany(targetEntity = Items.class, cascade = {CascadeType.ALL})
	@JoinTable(name= "cart_item_mapping_m2m")
	private Set<Items> items;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Set<Items> getItems() {
		return items;
	}

	public void setItems(Set<Items> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", total=" + total + ", customerName=" + customerName + ", items=" + items + "]";
	}

	public Cart(long id, double total, String customerName, Set<Items> items) {
		super();
		this.id = id;
		this.total = total;
		this.customerName = customerName;
		this.items = items;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}	
	

}
