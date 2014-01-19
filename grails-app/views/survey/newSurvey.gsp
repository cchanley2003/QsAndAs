<!DOCTYPE html>
<html>
<head>
<title>Qs And As</title>
<g:javascript library="jquery" />
<r:layoutResources />
</head>
<body>
	<h2>
		${newSurvey.surveyName}
	</h2>
	<div id="allQuestions">
	   <g:each in="${newSurvey.questions}">
          <p>Title: ${it.questionText}</p>
        </g:each>
	</div>
	<div id="addQuestion">
	<g:form action="ajaxAdd">
		<g:textField name="newQuestion" />
		<g:submitToRemote value="Add Question"
			url="[controller: 'survey', action: 'ajaxAdd']"
			update="allQuesitons" onSuccess="clearQuestion(e)" />
	</g:form>
	<g:javascript>
            function clearQuestion(e) {
                $('newQuestion').value=''
            }
    </g:javascript>
    </div>
</body>
</html>