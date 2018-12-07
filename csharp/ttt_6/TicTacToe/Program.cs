using System;

namespace TicTacToe {
    public class Board {
		private int[,] _board = new int[3,3];

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
	}
}