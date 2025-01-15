package controller;
import model.Feedbackpojo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import operations.Feedback_op;
import operations.Feedback_op_imp;

import java.io.IOException;
import java.util.List;

@WebServlet("/Feedbackservlet")
public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String username	=request.getParameter("username");
		Feedback_op feedbackOps = new Feedback_op_imp();
		List<FeedbackPojo> feedbackList= feedbackOps.getFeedbackByUser(username);
		request.setAttribute("feedbackList", feedbackList);
		request.getRequestDispatcher("viewFeedback.jsp").forward(request, response);
		
	}

}
