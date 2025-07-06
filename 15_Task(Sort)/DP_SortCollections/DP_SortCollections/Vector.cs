using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DP_SortCollections
{
    class Vector<T>: ISortable<T>
    {
        public T[] Array { get; set; }

        public SortStrategy<T> SortStrategy { get; set; }

        public Vector() { }

        public Vector(int size, SortStrategy<T> sortStrategy)
        {
            SortStrategy = sortStrategy;

            Array = new T[size];
        }

        public T this[int index]
        {
            get => Array[index]; 
            set => Array[index] = value; 
        }

        public int Length { get => Array.Length; }

        public void Sort()
        {
            SortStrategy?.Sort(this);
        }

        public void Print()
        {
            foreach (var item in Array)
            {
                Console.Write($"{item} ");
            }
            Console.WriteLine();
        }
    }
}
