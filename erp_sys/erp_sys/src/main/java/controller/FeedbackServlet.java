package controller;
import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.FeedbackPojo;
@WebServlet("/FeedbackServlet")
public class FeedbackServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FeedbackPojo feedbackPojo = new FeedbackPojo();
        List<FeedbackPojo> feedbackList = feedbackPojo.getAllFeedback();
        req.setAttribute("feedbackList", feedbackList);
        req.getRequestDispatcher("feedback.jsp").forward(req, resp);
    }
}