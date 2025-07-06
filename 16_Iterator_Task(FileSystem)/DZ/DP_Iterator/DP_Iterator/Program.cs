using System;
using System.Collections.Generic;

namespace DP_Iterator
{
    public class Program
    {
        public static void Main(string[] args)
        {
            ConcreteAggregate a = new ConcreteAggregate();
            a[0] = "Item A";
            a[1] = "Item B";
            a[2] = "Item C";
            a[3] = "Item D";

            Iterator iterator = a.CreateIterator();

            Console.WriteLine("Iterating over collection:");
            object item = iterator.First();
            while (item != null)
            {
                Console.WriteLine(item);
                item = iterator.Next();
            }

            Console.ReadKey();
        }
    }
    
    // абстактный итерируемый класс (коллекция)
    public abstract class Aggregate
    {
        public abstract Iterator CreateIterator();
    }

    // конкретный итерируемый класс (конкретная коллекция)
    public class ConcreteAggregate : Aggregate
    {
        List<object> items = new List<object>();

        public override Iterator CreateIterator()
        {
            return new ConcreteIterator(this);
        }
        
        public int Count
        {
            get { return items.Count; }
        }

        public object this[int index]
        {
            get { return items[index]; }
            set { items.Insert(index, value); }
        }
    }
    
    // абстрактный итератор
    public abstract class Iterator
    {
        public abstract object First();
        public abstract object Next();
        public abstract bool IsDone();
        public abstract object CurrentItem();
    }
    
    // конкретная реализация итератора
    public class ConcreteIterator : Iterator
    {
        // ссылка на перебираемую коллекцию
        ConcreteAggregate aggregate;

        // номер текущего элемента
        int current = 0;

        public ConcreteIterator(ConcreteAggregate aggregate)
        {
            this.aggregate = aggregate;
        }

        // получить первый элемент последовательности
        public override object First()
        {
            return aggregate[0];
        }

        // получить следующий элемент последовательности
        public override object Next()
        {
            object ret = null;
            if (current < aggregate.Count - 1)
            {
                ret = aggregate[++current];
            }
            return ret;
        }

        // возвращает текущий элемент
        public override object CurrentItem()
        {
            return aggregate[current];
        }

        // проверяет, не закончилась ли последовательность
        public override bool IsDone()
        {
            return current >= aggregate.Count;
        }
    }
}
