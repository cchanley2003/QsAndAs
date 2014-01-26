<!DOCTYPE html>
<html>
<head>
<title>Qs And As</title>
</head>
<body>
	<h1>Survey List</h1>
	<g:each in="${surveyList}" var="survey">
    <div>
        <p>${survey.surveyName}</p>
    </div>
</g:each>
</body>
</html>