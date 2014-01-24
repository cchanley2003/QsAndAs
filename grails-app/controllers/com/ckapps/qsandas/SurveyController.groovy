package com.ckapps.qsandas

class SurveyController {

	static defaultAction = "start"

	def start() {
	}
	
	def newSurvey = {
		def survey = new Survey(surveyName: params.surveyName)
		survey.save()
		session.survey = newSurvey
		return [ newSurvey: survey ]
	}
	
	def retrieveQuestions() {
		def questions = params.newSurvey.questions
		[ questions: questions ]
	}
	
	def submitQuestion() {
		Question q = new Question(questionText: ${params.question}).save()
		Survey s = params.newSurvey
		s.questions.add(q);
		s.save()
		render "Success"
	}
	
	def greetName() {
		Question q = new Question()
		q.questionText = params.name
		q.save()
		Survey s = Survey.findBySurveyName(params.survey)
		s.questions.add(q);
		render "${params.survey}"
	}
	
	
}
