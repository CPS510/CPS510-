as yet unclassified
countTons: suitsList
	suitsList isEmpty
		ifTrue: [ self totalPoints: totalPoints + 3 ].
	suitsList size == 1
		ifTrue: [ self totalPoints: totalPoints + 2 ].
	suitsList size == 2
		ifTrue: [ self totalPoints: totalPoints + 1 ]