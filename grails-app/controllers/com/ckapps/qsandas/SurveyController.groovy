package com.ckapps.qsandas

class SurveyController {

	static defaultAction = "start"

	def start() {
	}
	
	def newSurvey = {
		def survey = new Survey(surveyName: params.surveyName)
		survey.save()
		return [ newSurvey: params.surveyName ]
	}
}
