adding
organize
	self allCards
		do: [ :arg1 | 
			arg1 index <= 13
				ifTrue: [ self clubs add: arg1 ].
			arg1 index > 13 & (arg1 index <= 26)
				ifTrue: [ self hearts add: arg1 ].
			arg1 index > 26 & (arg1 index <= 39)
				ifTrue: [ self spades add: arg1 ].
			arg1 index > 39 & (arg1 index <= 52)
				ifTrue: [ self diamonds add: arg1 ] ]