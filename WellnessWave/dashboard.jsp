<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>WellnessWave Dashboard</title>
    <link rel="stylesheet" href="css/format.css">
</head>
<body>
    <h2>WellnessWave Dashboard</h2>
    <a href="insertWellnessData">Insert Wellness Data</a>

 <h3>Wellness Data:</h3>
    <table>
        <thead>
            <tr>
                <th>Metric Name</th>
                <th>Value</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="data" items="${wellnessData}">
                <tr>
                    <td>${data.metricName}</td>
                    <td>${data.value}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <div style="display: flex;">
	 	<div style="flex: 1; margin-right: 10px;">
		 	<h3 class="ct">Column 1</h3>
		    <h3>Another Graph</h3>
	 	</div>
	 	<div style="flex: 1; margin-right: 10px; margin-left: 10px;">
		 	<h3 class="ct">Column 2</h3>
		    <h3>Another Graph</h3>
	 	</div>
	 	<div style="flex: 1; margin-left: 10px;">
		 	<h3 class="ct">Column 3</h3>
		    <h3>Another Graph</h3>
	 	</div>
 	</div>
    <div class="ct" style="display: flex;">
	 	<div class="ct" style="flex: 1; margin-right: 10px;">
		 	<h3>Column 1</h3>
		    <h3>Another Graph</h3>
	 	</div>
	 	<div class="ct" style="flex: 1; margin-left: 10px;">
		 	<h3 class="ct">Column 2</h3>
		    <h3>Another Graph</h3>
	 	</div>
 	</div>
</body>
</html>