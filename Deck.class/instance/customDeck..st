as yet unclassified
customDeck: cardList
	| value suit |
	cards := OrderedCollection new.
	cardList  do: [ :i | 
		value := self value: i.
		(i between: 1 and: 13)
			ifTrue: [ suit := 'C' ].
		(i between: 14 and: 26)
			ifTrue: [ suit := 'D' ].
		(i between: 27 and: 39)
			ifTrue: [ suit := 'H' ].
		(i between: 40 and: 52)
			ifTrue: [ suit := 'S' ].
		self cards
			add:
				(Card new
					suit: suit;
					index: i;
					value: value) ]