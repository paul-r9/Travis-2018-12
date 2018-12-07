
using NUnit.Framework;

namespace TravisTests {
    
    [TestFixture]
    public class SampleTest {
        
        [Test]
        public void TwoPlayersAreReadyToPlay() {
            var player1 = new Player("X");
            var player2 = new Player("O");

            var sut = new TickTacToeBoard();
            sut.AddPlayer(player1);
            sut.AddPlayer(player2);

            Assert.AreEqual(2, (int)sut.NumberOfPlayers);
        }

        [Test]
        public void RowOneColumnOneisEmpty()
        {
            var sut = new TickTacToeBoard();



            Assert.IsNull(sut.Board[0, 0]);
        }
    }
}
