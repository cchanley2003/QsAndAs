package com.ckapps.qsandas

class Question {

	String questionText
    static constraints = {
    }
	
	static hasMany = [potentialAnswers : PotentialAnswer]
}
