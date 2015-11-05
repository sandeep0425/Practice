import java.io.PrintWriter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
java.org
public class LoginService 
{
	/*public boolean Authenticate(String userid,String password)
	{
		User u = getUserById(userid);
		if(u.getUserId()!=null&&u.getUserId().equals(userid)&&u.getPassword().equals(password))
	
			return true;
				return false;
	}*/
			public void getUserById(String userId)
		{
				System.out.println("what happened");
	Configuration cfg= new Configuration();
		cfg.configure();
		/*SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		User u = new  User();
		u.setUserId(userId);
		u.setEmail("s");
		u.setFirstName("s");
		u.setMiddleName("m");
		u.setLastName("l");
		u.setPassword("p");
		u.setId(2);
		
		s.save(u);
		t.commit();
		s.close();
			 */
			 
		}
}
