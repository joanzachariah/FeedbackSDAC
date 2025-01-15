<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Feedback</title>
</head>
<body>
    <h2>Feedback for Your Purchased Products</h2>
    <table border="1">
        <tr>
            <th>Product Name</th>
            <th>Feedback</th>
            <th>User</th>
        </tr>
        <c:forEach var="feedback" items="${feedbackList}">
            <tr>
                <td>${feedback.productName}</td>
                <td>${feedback.feedback}</td>
                <td>${feedback.user}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
