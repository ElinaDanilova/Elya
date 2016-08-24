package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import model.DAO;
import model.impl.DAOimplHibernate;

@WebServlet("/forgot")
public class ResetPassword extends HttpServlet {

	private static final long serialVersionUID = 1L;
	DAO dao = new DAOimplHibernate();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(true);

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		
		if (dao.resetPassword(userName, password)) {
			response.getWriter().println(" ");
//			session.setAttribute("pageStatus", " Пароль изменен! ");
//			response.sendRedirect("/Mail");
//		} else {
//			session.setAttribute("pageStatus", "Неверное имя пользователя! ");
//			response.sendRedirect("/Mail/forgot.jsp");
//		}
		}
	}
	}
