<!DOCTYPE html>
<html>
<head>
<title>Qs And As</title>
<g:javascript library="jquery" />
<r:layoutResources/>
</head>
<body>
	<h2>
		${newSurvey.surveyName}
	</h2>
	<input type="text" id="questionBox" name="question" />
	<div id="temp"></div>
<g:javascript>
		document.getElementById('questionBox').onkeypress = function(event) {
			var char = getChar(event || window.event)
			if (!char)
				return // special key
				this.value = char.toUpperCase()
			return false
		}
</g:javascript>
</body>
</html>