
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
	}
}
