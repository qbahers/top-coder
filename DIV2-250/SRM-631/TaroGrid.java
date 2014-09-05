public class TaroGrid {
    public int getNumber(String[] grid) {
        int N = grid.length;

        int largestNbOfCells = 0;
        for (int j = 0; j < N; j++) {
            int nbConsecutiveWhiteCells = 0, nbConsecutiveBlackCells = 0; 
            char previousCell = grid[0].charAt(j);
            for (int i = 0; i < N; i++) {
                char currentCell = grid[i].charAt(j);
                if (currentCell == previousCell) {
                    if (previousCell == 'W') {
                        nbConsecutiveWhiteCells++;
			largestNbOfCells = Math.max(largestNbOfCells, nbConsecutiveWhiteCells);
                    }
                    else {
                        nbConsecutiveBlackCells++;
			largestNbOfCells = Math.max(largestNbOfCells, nbConsecutiveBlackCells);
                    }
                }
                else {
                    if (previousCell == 'W') {
                        nbConsecutiveWhiteCells = 0;
                        nbConsecutiveBlackCells++;
			largestNbOfCells = Math.max(largestNbOfCells, nbConsecutiveBlackCells);
                    }
                    else {
                        nbConsecutiveBlackCells = 0;
                        nbConsecutiveWhiteCells++;
			largestNbOfCells = Math.max(largestNbOfCells, nbConsecutiveWhiteCells);
                    }
                }
                previousCell = currentCell;
            }
        }
        return largestNbOfCells;
    }
}
