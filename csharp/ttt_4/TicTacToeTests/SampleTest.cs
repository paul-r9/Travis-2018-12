
using NUnit.Framework;

namespace TravisTests {
    
    [TestFixture]
    public class SampleTest {
        
        [Test]
        public void TwoPlayersAreReadyToPlay() {
            var player1 = new Player("X");
            var player2 = new Player("O");

            var sut = new TickTacToeBoard(player1, player2);

            Assert.AreEqual(2, (int)sut.NumberOfPlayers);

//            Assert.Fail("force failure to see CI fail");
        }
    }
}
