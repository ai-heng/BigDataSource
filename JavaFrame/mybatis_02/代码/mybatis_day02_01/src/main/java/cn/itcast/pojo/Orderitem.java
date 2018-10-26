package cn.itcast.pojo;

public class Orderitem {

	private Integer itemId;

	private Double totalPrice;

	private Integer status;

	private Product product;

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@Override
	public String toString() {
		return "Orderitem [itemId=" + itemId + ", totalPrice=" + totalPrice + ", status=" + status + ", product="
				+ product + "]";
	}

}
