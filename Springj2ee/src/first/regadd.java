package first;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Registered")
public class regadd {
	@Column(name="Nmaewa")
private String name;
	@Column(name="Email")
private String email;
     @Id
	@Column(name="Mobile")
private int mobile;

@Column(name="Place")
private String place;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}



public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public int getMobile() {
	return mobile;
}
public void setMobile(int mobile) {
	this.mobile = mobile;
}













}
