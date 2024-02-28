package mywebpage;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class loginservlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email1");
		String password = req.getParameter("pass1");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		try {
			Query q = em.createQuery("select d from details d where email=?1");

			q.setParameter(1, email);

			details d1 = (details) q.getSingleResult();

			String db_pass = d1.getPassword();

			if (password.equals(db_pass)) {

				req.getRequestDispatcher("mywebmain.jsp").forward(req, resp);
			} else {

				req.setAttribute("msg", "incorrect password");

				req.getRequestDispatcher("myweblogin.jsp").forward(req, resp);
			}

		} catch (Exception e) {

			req.setAttribute("msg1", "invalid mail");

			req.getRequestDispatcher("myweblogin.jsp").forward(req, resp);
		}
	}
}