/**
 *
 */
class Cell {
  int x
  int y

  public Cell(int x, int y){
    this.x = x
    this.y = y
  }

  def isAlive() {
    return true
  }

  def isAllNeighborAlive() {
    return true
  }
}
