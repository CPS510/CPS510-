accessing
withPermutation: cardList
	| deck |
	deck := cardList == false
		ifFalse: [ Deck new customDeck: cardList ]
		ifTrue: [ Deck new fullDeck ].
	board deck: deck cards.
	self board deal