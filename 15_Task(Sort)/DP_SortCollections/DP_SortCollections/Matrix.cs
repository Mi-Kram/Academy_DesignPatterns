using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DP_SortCollections
{
    class Matrix<T> : ISortable<T>
    {
        public T[, ] Array { get; set; }

        public SortStrategy<T> SortStrategy { get; set; }

        public Matrix() { }

        public Matrix(int Width, int Height, SortStrategy<T> sortStrategy)
        {
            SortStrategy = sortStrategy;

            Array = new T[Height, Width];
        }

        public T this[int index]
        {
            get => Array[index / Array.GetLength(1), index % Array.GetLength(1)];
            set => Array[index / Array.GetLength(1), index % Array.GetLength(1)] = value;
        }

        public int Length { get => Array.Length; }

        public void Sort()
        {
            SortStrategy?.Sort(this);
        }

        public void Print()
        {
            for (int i = 0; i < Array.GetLength(0); i++)
            {
                for (int k = 0; k < Array.GetLength(1); k++)
                {
                    Console.Write($"{Array[i, k]} ");
                }
                Console.WriteLine();
            }
            Console.WriteLine();
        }
    }
}