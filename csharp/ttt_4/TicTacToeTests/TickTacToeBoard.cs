using System;
using System.Collections.Generic;

namespace TravisTests
{
    internal class TickTacToeBoard
    {        
        public TickTacToeBoard()
        {
            Players = new List<Player>();
        }

        public int NumberOfPlayers { get { return Players.Count; }}
        public List<Player> Players { get; internal set; }

        public string[,] Board = new string[3, 3];

        internal void AddPlayer(Player player)
        {
            Players.Add(player);
        }

        internal void SelectLocation(Player player1, int row1, int col1)
        {
            this.Board[row1, col1] = player1.PlayerName;
        }
    }
}