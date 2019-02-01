as yet unclassified
deal
	| player |
	
	1 to: self deckSize  do: [ :i | 
		player := i \\ 4 + 1.
		(self players at: player) addCard: (self deck at: i) ].
	
	self players do: [ :p | 
		p hand organize.
		p count.]