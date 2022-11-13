package hibernate.mapping.manytomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="items")
public class Items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "item_id")
	private double itemId;
	
	@Column(name = "item_total")
	private double itemTotal;
	
	@Column(name = "quantity")
	private int quantity;
	
	

	public Items(long id, double itemId, double itemTotal, int quantity) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.itemTotal = itemTotal;
		this.quantity = quantity;
	}

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getItemId() {
		return itemId;
	}

	public void setItemId(double itemId) {
		this.itemId = itemId;
	}

	public double getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(double itemTotal) {
		this.itemTotal = itemTotal;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

	@Override
	public String toString() {
		return "Items [id=" + id + ", itemId=" + itemId + ", itemTotal=" + itemTotal + ", quantity=" + quantity
				+ ", cart="  + "]";
	}

	
}
