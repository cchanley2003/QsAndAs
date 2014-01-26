<!DOCTYPE html>
<html>
<head>
<title>Qs And As</title>
</head>
<body>
	<legend>Start a New Survey</legend>
	<g:form action="newSurvey">
		<label for="surveyName">Survey Name</label>
		<g:textField name="surveyName" />
		<g:submitButton name="create" value="Create" />
	</g:form>
</body>
</html>