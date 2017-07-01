/**
 *
 */
class Board {

  int width
  int height
  List<Cell> cells = []

  def Board(int width, int height) {
    this.width = width
    this.height = height
    width.times{x ->
      height.times{y ->
        cells.add(new Cell(x, y))
      }
    }
  }

  List<Cell> Cells() {
    return cells
  }

  List<Cell> countAliveNeighbor() {
    return cells
  }

  def nextState() {
    return new Board(width, height)
  }

  def StatusMap() {
    return [
            [1,0,1],
            [0,0,0],
            [1,0,1],
    ]
  }
}
