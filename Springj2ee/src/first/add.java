package first;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Test")
public class add {
	@Column(name="uname")
private String name;
	@Column(name="pass")
private String passsword;
	@Id
	@GeneratedValue
	@Column(name="ID")
private int userid;






public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPasssword() {
	return passsword;
}
public void setPasssword(String passsword) {
	this.passsword = passsword;
}
@Override
public String toString() {
	return "CONDOA [name=" + name + ", passsword=" + passsword + ", userid=" + userid + "]";
}





}
