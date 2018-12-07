using System;
using System.Collections.Generic;

namespace TravisTests
{
    internal class TickTacToeBoard
    {        
        public TickTacToeBoard()
        {
            Players = new List<Player>();
            Row1Col1 = "";
        }

        public int NumberOfPlayers { get { return Players.Count; }}
        public List<Player> Players { get; internal set; }
        public string Row1Col1 { get; internal set; }

        internal void AddPlayer(Player player)
        {
            Players.Add(player);
        }
    }
}