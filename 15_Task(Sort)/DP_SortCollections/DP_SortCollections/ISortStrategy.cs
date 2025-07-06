using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DP_SortCollections
{
    public abstract class SortStrategy<T>
    {
        public IComparer<T> Comparer { get; set; }
        public abstract void Sort(ISortable<T> container);
    }
}
