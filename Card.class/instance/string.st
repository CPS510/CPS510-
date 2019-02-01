accessing
string
	(self value class) == SmallInteger
		ifTrue:[
				^(self value printString) , self suit.
			].
		^(self value ) , self suit.
		


