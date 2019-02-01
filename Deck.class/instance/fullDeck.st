as yet unclassified
fullDeck
	|fd|
	fd:= OrderedCollection new.
	1 to: 52 do: [:i| fd add: i].
	self customDeck: fd.
	