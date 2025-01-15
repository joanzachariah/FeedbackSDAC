package operations;
import model.Feedbackpojo;

import java.util.List;

public interface Feedback_op {
	List<getFeedbackPojo> getFeedbackByUser(String username);
}
