package com.ckapps.qsandas

class SurveyController {

	static defaultAction = "start"

	def start() {
	}
	
	def editSurvey()  {
		def survey = Survey.findBySurveyName(params.surveyName)
		if(survey == null)
        {
			survey = new Survey(surveyName: params.surveyName).save()
        }
		return [ editSurvey: survey ]
	}
	
	def listSurveys() {	
		List surveys = Survey.getAll()
		return [surveyList : surveys]
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
	
	
	
}
