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
    }
}