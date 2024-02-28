package mywebpage;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signin")
public class signinservlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = "", mobile = "", email = "", password = "";

		name = req.getParameter("name");
		mobile = req.getParameter("mobile");
		email = req.getParameter("email");
		password = req.getParameter("password");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		details d = new details();

		Long l = Long.parseLong(mobile);

		d.setName(name);
		d.setMobile(l);
		d.setEmail(email);
		d.setPassword(password);

		et.begin();
		em.persist(d);
		et.commit();

		RequestDispatcher dispatcher = req.getRequestDispatcher("mywebmain.jsp");
		dispatcher.forward(req, resp);

	}
}
