package org.bcc.cupboard.entity.jpa;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.bcc.cupboard.entity.Customer;
import org.bcc.cupboard.entity.CustomerBean;
import org.bcc.cupboard.entity.Order;
import org.bcc.cupboard.entity.Tefap;

@Entity
@Table(name = "CUSTOMER")
public class CustomerJpa extends CustomerBean implements Serializable, Customer {
	private static final long serialVersionUID = 5808450971871741014L;
	
	private List<Order> orders;
	private List<Tefap> tefaps;
	
	public CustomerJpa() {
		
	}
	
	public CustomerJpa(Customer customer) {
		setId(customer.getId());
		setFirstName(customer.getFirstName());
		setLastName(customer.getLastName());
		setNumOfAdults(customer.getNumOfAdults());
		setNumOfKids(customer.getNumOfKids());
		setPhone(customer.getPhone());
		setStreet(customer.getStreet());
		setCity(customer.getCity());
		setState(customer.getState());
		setZip(customer.getZip());
	}
	

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#getId()
	 */
	@Override
	@Column(name="CUS_NUM")
	@GeneratedValue()
	public long getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#setId(long)
	 */
	@Override
	public void setId(long id) {
		super.setId(id);
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#getLastName()
	 */
	@Override
	@Column(name="CUS_LAST")
	public String getLastName() {
		return lastName;
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#setLastName(java.lang.String)
	 */
	@Override
	public void setLastName(String lastName) {
		super.setLastName(lastName);
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#getFirstName()
	 */
	@Override
	@Column(name="CUS_FIRST")
	public String getFirstName() {
		return firstName;
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#setFirstName(java.lang.String)
	 */
	@Override
	public void setFirstName(String firstName) {
		super.setFirstName(firstName);
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#getStreet()
	 */
	@Override
	@Column(name="CUS_STREET")
	public String getStreet() {
		return street;
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#setStreet(java.lang.String)
	 */
	@Override
	public void setStreet(String street) {
		super.setStreet(street);
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#getCity()
	 */
	@Override
	@Column(name="CUS_CITY")
	public String getCity() {
		return city;
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#setCity(java.lang.String)
	 */
	@Override
	public void setCity(String city) {
		super.setCity(city);
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#getState()
	 */
	@Override
	@Column(name="CUS_STATE")
	public String getState() {
		return state;
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#setState(java.lang.String)
	 */
	@Override
	public void setState(String state) {
		super.setState(state);
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#getZip()
	 */
	@Override
	@Column(name="CUS_ZIP")
	public String getZip() {
		return zip;
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#setZip(java.lang.String)
	 */
	@Override
	public void setZip(String zip) {
		super.setZip(zip);
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#getPhone()
	 */
	@Override
	@Column(name="CUS_PHONE")
	public String getPhone() {
		return phone;
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#setPhone(java.lang.String)
	 */
	@Override
	public void setPhone(String phone) {
		super.setPhone(phone);
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#getNumOfAdults()
	 */
	@Override
	@Column(name="CUS_NUM_ADULT")
	public int getNumOfAdults() {
		return numOfAdults;
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#setNumOfAdults(int)
	 */
	@Override
	public void setNumOfAdults(int numOfAdults) {
		super.setNumOfAdults(numOfAdults);
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#getNumOfKids()
	 */
	@Override
	@Column(name="CUS_NUM_CHILD")
	public int getNumOfKids() {
		return numOfKids;
	}

	/* (non-Javadoc)
	 * @see org.bcc.cupboard.entity.jpa.Customer#setNumOfKids(int)
	 */
	@Override
	public void setNumOfKids(int numOfKids) {
		super.setNumOfKids(numOfKids);
	}

	@OneToMany(mappedBy="customer", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@OneToMany(mappedBy="customer", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	public List<Tefap> getTefaps() {
		return tefaps;
	}

	public void setTefaps(List<Tefap> tefaps) {
		this.tefaps = tefaps;
	}	

}
