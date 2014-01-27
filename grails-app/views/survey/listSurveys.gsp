<!DOCTYPE html>
<html>
<head>
<title>Qs And As</title>
</head>
<body>
	<h1>Survey List</h1>
	<ul>
		<g:each in="${surveyList}" var="survey">
			<li>
				${survey.surveyName}
			</li>
		</g:each>
	</ul>
</body>
</html>