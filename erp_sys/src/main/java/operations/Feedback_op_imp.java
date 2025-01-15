package operations;
import model.Feedbackpojo;

import db.GetConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class Feedback_op_imp implements Feedback_op {

    @Override
    public List<FeedbackPojo> getFeedbackByUser(String username) {
        List<FeedbackPojo> feedbackList = new ArrayList<>();
        try (Connection conn = GetConn.getConnection()) {
            String query = "SELECT product_name, feedback, user FROM feedback WHERE user = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                FeedbackPojo feedback= new FeedbackPojo();
                feedback.setProductName(rs.getString("product_name"));
                feedback.setFeedback(rs.getString("feedback"));
                feedback.setUser(rs.getString("user"));
                feedbackList.add(feedback);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return feedbackList;
    }
}
