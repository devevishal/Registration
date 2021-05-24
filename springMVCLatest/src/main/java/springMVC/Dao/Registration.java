package springMVC.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springMVC.Model.RegistrationDetails;

@Component
public class Registration {

	
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Transactional
	public List<RegistrationDetails> getDetails(){
		Session session = sessionFactory.getCurrentSession();
		List<RegistrationDetails> list = session.createQuery("from RegistrationDetails",RegistrationDetails.class ).list();
		return list;
	}
	@Transactional
	public void addDetails(RegistrationDetails registrationDetails) {
		Session session = sessionFactory.getCurrentSession();
		session.save(registrationDetails);
		
	}
	
	
}
