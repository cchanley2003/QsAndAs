package com.ckapps.qsandas

class SurveyController {

	static defaultAction = "start"

	def start() {
	}
	
	def newSurvey = {
		def survey = null
		if(survey == null)
        {
			survey = new Survey(surveyName: params.surveyName).save()
        }
		return [ newSurvey: survey ]
	}
	
	def _retrieveQuestions() {
		def questions = params.newSurvey.questions
		[ questions: questions ]
	}
	
	def submitQuestion() {
		Question q = new Question()
		q.questionText = params.name
		q.save()
		Survey s = Survey.findBySurveyName(params.survey)
		s.questions.add(q);
		render (template: "retrieveQuestions", bean:s)
	}
	
	def greetName() {
		Question q = new Question()
		q.questionText = params.name
		q.save()
		Survey s = Survey.findBySurveyName(params.survey)
		s.questions.add(q);
		render (template: "retrieveQuestions", bean:s)
	}
	
	
}
