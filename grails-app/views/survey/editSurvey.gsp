<!DOCTYPE html>
<html>
	<head>
		<title>Qs And As</title>
        <g:javascript library="jquery"/>
	</head>
	<body>
	    <g:javascript library="jquery"/>
		<r:layoutResources />
	    <h2>${editSurvey.surveyName}</h2>
        <div id="questions">
           <g:render template="retrieveQuestions" bean="${editSurvey}"></g:render>
        </div>

        <div>
            <input type="text" id="name" name="name" onchange="submitQ(this.value)"/>
        </div>

        <script>
        var test = '${editSurvey.surveyName}'
        function submitQ(name) {
            <g:remoteFunction controller="survey" action="submitQuestion" update="questions" params="'survey='+test+'&name='+name"/>
                  }
        </script>

	</body>
</html>
