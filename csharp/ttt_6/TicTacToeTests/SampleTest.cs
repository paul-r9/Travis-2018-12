
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
    }
}
