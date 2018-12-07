﻿using System;

namespace TicTacToe {
    public class Board {
		public int[,] _board = new int[3,3];
		public const int X = 1;
		public const int O = 2;

        static void Main(string[] args) {
            Console.WriteLine("Hello Tic Tac Toe!");
        }

		public bool? AllFieldsTaken()
		{
			for (int x=0; x < 2; x++)
			{
				for (int y=0; y < 2; y++)
				{
					if(_board[x,y] == 0)
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
	}
}