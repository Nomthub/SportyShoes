package com.ecommerce.Entity;
import java.math.BigDecimal;
import java.util.Date;

public class OrderEntity {
	private long Orderid;
	private BigDecimal Orderprice;
	private Date dateOrdered;
	
	public OrderEntity() {
		
	}
	
	public OrderEntity(BigDecimal price, Date dateOrdered) {
		super();
		this.Orderprice = price;
		this.dateOrdered = dateOrdered;
	}

	public long getOrderId() {
		return Orderid;
	}

	public void setId(long id) {
		this.Orderid = id;
	}

	public BigDecimal getPrice() {
		return Orderprice;
	}

	public void setPrice(BigDecimal price) {
		this.Orderprice = price;
	}

	public Date getDateOrdered() {
		return dateOrdered;
	}

	public void setDateAdded(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	@Override
	public String toString() {
		return "ProductEntity [OrderId=" + Orderid + ", Orderprice=" + Orderprice + ", dateOrdered=" + dateOrdered + "]";
	}

}
