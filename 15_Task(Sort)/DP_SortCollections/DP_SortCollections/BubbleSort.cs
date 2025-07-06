using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DP_SortCollections
{
    class BubbleSort<T> : SortStrategy<T>
    {
        public override void Sort(ISortable<T> container)
        {
            if (Comparer != null)
            {
                for (int i = 0; i < container.Length; i++)
                {
                    for (int k = 0; k < container.Length - 1; k++)
                    {
                        if (Comparer.Compare(container[k], container[k + 1]) == 1)
                        {
                            T temp = container[k + 1];
                            container[k + 1] = container[k];
                            container[k] = temp;
                        }
                    }
                }
            }
        }
    }
}
