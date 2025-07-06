using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DP_SortCollections
{
    class SelectionSort<T> : SortStrategy<T>
    {
        public override void Sort(ISortable<T> container)
        {
            int smallestIndex, index, minIndex;

            for (index = 0; index < container.Length - 1; index++)
            {
                smallestIndex = index;

                for (minIndex = index; minIndex < container.Length; minIndex++)
                {
                    if (Comparer.Compare(container[minIndex], container[smallestIndex]) == 1)
                    {
                        smallestIndex = minIndex;
                    }
                }
                T temp = container[smallestIndex];
                container[smallestIndex] = container[index];
                container[index] = temp;
            }
        }
    }
}
