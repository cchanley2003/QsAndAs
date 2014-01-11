package com.ckapps.qsandas

class Question {

	String questionText
    static constraints = {
    }
	
	static hasMan = [potentialAnswers : PotentialAnswer]
}
