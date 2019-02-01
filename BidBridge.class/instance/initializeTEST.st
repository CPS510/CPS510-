instance initalization
initializeTEST
	board isNil
		ifFalse: [ ^ self ].
	board := Board new.
