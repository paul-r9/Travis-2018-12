
using NUnit.Framework;
using TicTacToe;

namespace Fred
{

	[TestFixture]
    public class SampleTest {
        
        [Test]
        public void FieldNotTaken() {
			Board board = new Board();

            Assert.IsFalse(board.AllFieldsTaken());
        }

		[Test]
		public void SpecificFieldNotTaken()
		{
			Board board = new Board();
			int x = 0;
			int y = 0;
			Assert.IsFalse(board.IsFieldTaken(x,y));
		}

		[Test]
		public void SpecificFieldTaken()
		{
			Board board = new Board();
			int x = 0;
			int y = 0;
			board._board[x, y] = 1;
			Assert.IsTrue(board.IsFieldTaken(x, y));
		}

		[Test]
		public void SetField()
		{
			Board board = new Board();
			int x = 0;
			int y = 0;
			Assert.IsTrue(board.AssignField(x, y, Board.X));
		}

		[Test]
		public void SetFieldAlreadyTaken()
		{
			Board board = new Board();
			int x = 0;
			int y = 0;
			board.AssignField(x, y, Board.X);
			Assert.IsFalse(board.AssignField(x, y, Board.X));
		}

		[Test]
		public void HorizontalWinner()
		{
			Board board = new Board();
			board.AssignField(0, 1, Board.X);
			board.AssignField(1, 1, Board.X);
			board.AssignField(2, 1, Board.X);
			Assert.IsTrue(board.IsHorizontalWinner());
		}
		[Test]
		public void VerticalWinner()
		{
			Board board = new Board();
			board.AssignField(2, 0, Board.O);
			board.AssignField(2, 1, Board.O);
			board.AssignField(2, 2, Board.O);
			Assert.IsTrue(board.IsVerticalWinner());
		}

		[Test]
		public void DiagonalWinner()
		{
			Board board = new Board();
			board.AssignField(0, 0, Board.X);
			board.AssignField(1, 1, Board.X);
			board.AssignField(2, 2, Board.X);
			Assert.IsTrue(board.IsDiagonalWinner());
		}
	}
}
