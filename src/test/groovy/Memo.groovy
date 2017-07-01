import spock.lang.Specification


/**
 *
 */
class Memo extends Specification {
  def "scenario"(){
    given:"5x5の盤がある"
    def board = new Board(3,3)

    when:"各セルは自分の状態を知る"
    List<Cell> cells = board.Cells()

    then:"各セルは全部生きている"
    cells.size() == 9
    cells.every{cell -> cell.isAlive()}

    when:"各セルは周りのセルの生存数を数える"
    List<Cell> cells2 = board.countAliveNeighbor()
    then:"周りのセルは全部生きている"

    cells2.size() == 9
    cells2.every{cell -> cell.isAllNeighborAlive()}

    when:"各セルは自分の次の状態が決まる"
    def nextBoard = board.nextState()
    def result = nextBoard.StatusMap()
    then:"端っこ以外死ぬ"
    result == [
            [1,0,1],
            [0,0,0],
            [1,0,1],
            ]
  }
}