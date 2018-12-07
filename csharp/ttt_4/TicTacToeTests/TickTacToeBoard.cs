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

        internal void AddPlayer(Player player)
        {
            Players.Add(player);
        }
    }
}