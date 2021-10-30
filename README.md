[![](https://ya.se/wp-content/uploads/2020/11/ya-logo-blue-bg.svg)](https://ya.se)
## Group Assignment #1:
## Tic Tac Toe

**Objective:**
> create a simplified version of the game that can be play directly in IDE (Eclipse)

**The team:** [Katarina](https://github.com/katarina-h "Katarina") - [Osama](https://github.com/osho81 "Osama") - [Mohamad](https://github.com/MohamadOjail "Mohamad Ojail")

------------


Included in solution:

- [x] Handle the data in a 2D Array.
- [x] Player vs computer.
	- [x] take user input.
	- [x] use random function for computer move.
	
> check for data entry mismatches to prevent errors :heavy_check_mark:✔️
	

- [ ] Multiple play-rounds.
- [ ] Check for win and keep count.
- [ ] Levels of hardness.

------------
#### Snapshot from the start of the game
<img src="https://github.com/osho81/Grupp2b/blob/main/gameSnap.PNG" alt="Snapshot from the game" width="250"/>


#### New technique learned:
- [ ] **Rotate Array:**
```java
int size = board.length;
String[][] tempBoard = new String[size][size];

	for (int i = 0; i < size; ++i)
		for (int j = 0; j < size; ++j)
			tempBoard[i][j] = board[size - j - 1][i];
```
