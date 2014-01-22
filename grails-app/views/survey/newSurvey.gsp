<!DOCTYPE html>
<html>
	<head>
		<title>Simple Ajax</title>
        <g:javascript library="jquery"/>
        <style>
            #greetingBox {
                border: 1px solid #000; width: 300px; height: 100px; background-color: #c0c0c0;
            }
        </style>
	</head>
	<body>
	    <g:javascript library="jquery"/>
		<r:layoutResources />
	    <h2>${newSurvey.surveyName}</h2>
        <div id="greetingBox">
           
        </div>

        <div>
            <input type="text" id="name" name="name" onchange="greetName(this.value)"/>
        </div>

        <script>
        var test="two"
        function greetName(name) {
            <g:remoteFunction controller="survey" action="greetName" update="greetingBox" params="'survey='+test+'&name='+name"/>
                  }
        </script>

	</body>
</html>
