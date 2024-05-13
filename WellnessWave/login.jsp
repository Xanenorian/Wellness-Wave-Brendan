<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>WellnessWave Login Page</title>
    <style><%@include file="/../../css/format.css"%></style>
</head>
<body>
    <h2>WellnessWave Login Page</h2>
    <%-- Display error message if present --%>
    <c:if test="${not empty errorMessage}">
        <p style="color: red;">${errorMessage}</p>
    </c:if>
    <%-- Display success message if present --%>
    <c:if test="${not empty successMessage}">
        <p style="color: green;">${successMessage}</p>
    </c:if>
    <form action="login" method="post">
        <div>
            <label for="username">Username:</label>
            <input class="box" type="text" id="username" name="username" required>
        </div>
        <div>
            <label for="password">Password:</label>
            <input class="box" type="password" id="password" name="password" required>
        </div>
        <button type="submit">Login</button>
    </form>
    <br>
    <form action="register" method="get">
        <button type="submit">Create New User</button>
    </form>
</body>
<footer>
	<div class="footer-container">
        <div class="footer-section">
            <h3>Contact Us</h3>
            <p class="contact-info">6510 Pine St, Omaha, NE 68106 | Phone: 402-808-2472 | Email: wellnesswave@gmail.com</p>
        </div>
     </div>
</footer>
</html>
