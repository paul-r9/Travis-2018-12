﻿namespace TravisTests
{
    internal class Player
    {
        private string _playerName;

        public Player(string playerName)
        {
            this._playerName = playerName;
        }

        public string PlayerName { get => _playerName; set => _playerName = value; }
    }
}