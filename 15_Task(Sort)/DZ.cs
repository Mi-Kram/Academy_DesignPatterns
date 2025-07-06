using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DP_SortCollections
{
    class Program
    {
        static void Main(string[] args)
        {
            BubbleSort<int> bubbleSortInt = new BubbleSort<int>()
            { Comparer = Comparer<int>.Create((x, y) => x > y ? 1 : x < y ? -1 : 0) };

            SelectionSort<int> selectionSortInt = new SelectionSort<int>()
            { Comparer = Comparer<int>.Create((x, y) => x > y ? 1 : x < y ? -1 : 0) };

            BubbleSort<string> bubbleSortString = new BubbleSort<string>()
            { Comparer = Comparer<string>.Create((x, y) => x.CompareTo(y)) };

            SelectionSort<string> selectionSortString = new SelectionSort<string>()
            { Comparer = Comparer<string>.Create((x, y) => x.CompareTo(y)) };

            Console.WriteLine("Vector of numbers:\n");

            Vector<int> vector = new Vector<int>()
            {
                SortStrategy = bubbleSortInt, 
                Array = new int[] { 9, 3, 24, 12, 67, 4, 77}
            };

            vector.Print();
            vector.Sort();
            vector.Print();

            vector.SortStrategy = selectionSortInt;
            vector.Sort();
            vector.Print();

            Console.WriteLine("\nVector of strings:\n");

            Vector<string> vector2 = new Vector<string>()
            {
                SortStrategy = bubbleSortString,
                Array = new string[] { "hello", "big", "beautiful", "world", "!!!" }
            };

            vector2.Print();
            vector2.Sort();
            vector2.Print();

            vector2.SortStrategy = selectionSortString;
            vector2.Sort();
            vector2.Print();

            Console.WriteLine("\nMatrix of numbers:\n");

            Matrix<int> matrix = new Matrix<int>()
            {
                SortStrategy = bubbleSortInt,
                Array = new int[,] 
                { 
                    { 9, 3, 24, 2, 56 },
                    { 12, 67, 4, 45, 7 },
                    { 77, 23, 3, 9, 8}
                }
            };

            matrix.Print();
            matrix.Sort();
            matrix.Print();

            matrix.SortStrategy = selectionSortInt;
            matrix.Sort();
            matrix.Print();

            Console.WriteLine("\nMatrix of strings:\n");

            Matrix<string> matrix2 = new Matrix<string>()
            {
                SortStrategy = bubbleSortString,
                Array = new string[,] 
                { 
                    { "One", "Two", "Three", "Four", "Five" },
                    { "begin", "end", "left", "right", "up" },
                    { "down", "run", "walk", "jump", "stand" } 
                }
            };

            matrix2.Print();
            matrix2.Sort();
            matrix2.Print();

            matrix2.SortStrategy = selectionSortString;
            matrix2.Sort();
            matrix2.Print();
        }
    }
}
