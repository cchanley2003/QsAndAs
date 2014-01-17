package com.ckapps.qsandas

class Question {

	String questionText
    static constraints = {
    }
	
	static belongsTo = Survey

	
	static hasMany = [potentialAnswers : PotentialAnswer]
}
