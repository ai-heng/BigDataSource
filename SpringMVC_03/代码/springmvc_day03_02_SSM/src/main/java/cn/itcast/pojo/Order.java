package cn.itcast.pojo;

import java.util.List;

/**
 * 订单表
 * 
 */
public class Order {

    private Integer oid;

    private Long userId;

    private String orderNumber;
    
    private User user;
    
    private List<Orderitem> orderitemList;
    
	public List<Orderitem> getOrderitemList() {
		return orderitemList;
	}

	public void setOrderitemList(List<Orderitem> orderitemList) {
		this.orderitemList = orderitemList;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", userId=" + userId + ", orderNumber=" + orderNumber + ", user=" + user
				+ ", orderitemList=" + orderitemList + "]";
	}

}
