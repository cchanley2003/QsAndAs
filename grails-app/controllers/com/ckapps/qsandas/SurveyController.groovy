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
		def questions = null
		[queestions:questions]
	}
	
	def submitQuestion(String questionText) {
		Question q = new Question(questionText: questionText).save()
		render "<script>retrieveQuestions()</script>"
	}
	
	
}
