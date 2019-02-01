accessing
value: i
	|value|
	value := ((i \\ 13)+1).
	value   == 11
			ifTrue: [ value:='J' ].
		value == 12 
			ifTrue: [ value:='Q' ].
		value == 13 
			ifTrue: [ value:='K' ].
		 value == 1 
			ifTrue: [ value:='A' ].
	^value.