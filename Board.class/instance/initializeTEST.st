initialization
initializeTEST
	| tmp1 tmp2 tmp3 tmp4 |
	tmp1 := Player new name: 'North'.
	tmp3 := Player new name: 'East'.
	tmp2 := Player new name: 'South'.
	tmp4 := Player new name: 'West'.
	players := {tmp2.
	tmp4.
	tmp1.
	tmp3}