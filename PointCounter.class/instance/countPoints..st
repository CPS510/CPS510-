as yet unclassified
countPoints: arg1
	arg1 suits
		do: [ :arg2 | 
			| tmp1 |
			tmp1 := self.
			tmp1
				countFaceCards: arg2;
				countTons: arg2 ].
	^ self totalPoints