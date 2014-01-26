<!DOCTYPE html>
<html>
	<head>
		<title>Simple Ajax</title>
        <g:javascript library="jquery"/>
	</head>
	<body>
	    <g:javascript library="jquery"/>
		<r:layoutResources />
	    <h2>${newSurvey.surveyName}</h2>
        <div id="greetingBox">
           <g:render template="retrieveQuestions" bean="${newSurvey}"></g:render>
        </div>

        <div>
            <input type="text" id="name" name="name" onchange="greetName(this.value)"/>
        </div>

        <script>
        var test = '${newSurvey.surveyName}'
        function greetName(name) {
            <g:remoteFunction controller="survey" action="greetName" update="greetingBox" params="'survey='+test+'&name='+name"/>
                  }
        </script>

	</body>
</html>
