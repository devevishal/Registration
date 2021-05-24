package springMVC.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RegistrationDetails")
public class RegistrationDetails {

	@Id
	public int id;
	@Column
	public String fname;
	@Column
	public String email;
	@Column
	public String phonenumber;
	@Column
	public String course;
	
	

	public RegistrationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistrationDetails(String fname, String email, String phonenumber, String course) {
		super();
		this.fname = fname;
		this.email = email;
		this.phonenumber = phonenumber;
		this.course = course;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "RegistrationDetails [id=" + id + ", fname=" + fname + ", email=" + email + ", phonenumber="
				+ phonenumber + ", course=" + course + "]";
	}

}
