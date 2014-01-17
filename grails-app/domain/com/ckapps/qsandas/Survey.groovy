package com.ckapps.qsandas

class Survey {
	
	String surveyName
    static constraints = {
    }
	
	static hasMany = [ questions : Question]
	
	String toString()
	{
		surveyName
	}
}
