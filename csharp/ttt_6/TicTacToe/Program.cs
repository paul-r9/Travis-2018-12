﻿using System;

namespace TicTacToe {
	public class Board {
		public int[,] _board = new int[3, 3];
		public const int X = 1;
		public const int O = 2;

		static void Main(string[] args) {
			Console.WriteLine("Hello Tic Tac Toe!");
		}

		public bool? AllFieldsTaken()
		{
			for (int x = 0; x < 2; x++)
			{
				for (int y = 0; y < 2; y++)
				{
					if (_board[x, y] == 0)
					{
						return false;
					}
				}
			}
			return true;
		}

		public bool IsFieldTaken(int x, int y)
		{
			return _board[x, y] != 0;
		}

		public bool AssignField(int x, int y, int v)
		{
			if (IsFieldTaken(x, y))
				return false;

			_board[x, y] = v;
			return true;
		}

		public bool IsWinner()
		{
			return false;
		}

		public bool IsHorizontalWinner()
		{
			for (int y=0; y<=2; y++)
			{
				if (_board[0, y] == 0)
					continue;
				if (_board[0, y] != _board[1, y])
					continue;
				if (_board[0, y] != _board[2, y])
					continue;
				return true;
			}
			return false;
		}

		public bool IsVerticalWinner()
		{
			for (int x = 0; x <= 2; x++)
			{
				if (_board[x, 0] == 0)
					continue;
				if (_board[x, 0] != _board[x, 1])
					continue;
				if (_board[x, 0] != _board[x, 2])
					continue;
				return true;
			}
			return false;
		}

		public bool IsDiagonalWinner()
		{
			if (_board[1, 1] == 0)
				return false;

			if(_board[0,0] == _board[1,1] && _board[2,2] == _board[1, 1])
			{
				return true;
			}

			if (_board[0, 2] == _board[1, 1] && _board[2, 0] == _board[1, 1])
			{
				return true;
			}
			return false;
		}
	}
}