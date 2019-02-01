arithmetic
countFaceCards: cardList
	cardList
		do: [ :card | 
			Transcript show: 'checking for jacks' crLog.
			card index \\ 10 == 0
				ifTrue: [ Transcript show: 'jack found' crLog.
					self totalPoints: totalPoints + 1 ].
			Transcript show: 'checking for queens' crLog.
			card index \\ 11 == 0
				ifTrue: [ Transcript show: 'queen found' crLog.
					self totalPoints: totalPoints + 2 ].
			Transcript show: 'checking for kings ' crLog.
			card index \\ 12 == 0
				ifTrue: [ Transcript show: 'king found' crLog.
					self totalPoints: totalPoints + 3 ].
			Transcript show: 'checking for aces ' crLog.
			card index \\ 13 == 0
				ifTrue: [ Transcript show: 'ace found' crLog.
					self totalPoints: totalPoints + 4 ] ]