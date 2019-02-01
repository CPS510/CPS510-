printing
print
	| result |
	result := ''.
	self cards
		do: [ :c | 

 	result := result , c string, ' '.
		
	].
			^result.