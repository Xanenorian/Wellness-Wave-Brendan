<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert Wellness Data</title>
    <link rel="stylesheet" href="css/format.css">
</head>
<body>
    <h2>Insert Wellness Data</h2>
    <form action="insertWellnessData" method="post">
        <label for="metricName">Metric Name:</label>
        <select id="metricName" name="metric">
        	<option value="sleep">Sleep</option>
        	<option value="food">Food</option>
        	<option value="stress">Stress</option>
        	<option value="mood">Mood</option>
        	<option value="nutirition">Nutrition</option>  	
        </select><br>
        <label for="value">Value:</label>
        <input type="text" id="value" name="value" required><br><br>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
