package com.ckapps.qsandas

class SurveyController {

	static defaultAction = "start"

	def start() {
	}
	
	def newSurvey = {
		def survey = new Survey(surveyName: params.surveyName)
		survey.save()
		return [ newSurvey: survey ]
	}
	
	def retrieveQuestions() {
		def questions = params.newSurvey.questions
		[queestions:questions]
	}
	
	def submitQuestion(String questionText) {
		Question q = new Question(questionText: questionText).save()
		Survey s = params.newSurvey
		s.questions.add(q);
		s.save()
		render "<script>retrieveQuestions()</script>"
	}
	
	
}
