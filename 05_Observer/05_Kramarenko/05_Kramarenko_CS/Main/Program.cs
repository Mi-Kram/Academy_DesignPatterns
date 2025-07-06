using System;

namespace Main
{
	public delegate void ItemChangedDelegate(object item);

	class Program
	{
		static void Main(string[] args)
		{
			Node node1 = new Node(23, 4);
			Node node2 = new Node(2, 14);
			Node node3 = new Node(20, 30);

			Link link1 = new Link(node1, node2);
			Link link2 = new Link(node2, node3);

			Console.WriteLine(link1);
			Console.WriteLine(link2);
			Console.WriteLine();

			// node2.Move(3, 5);

			node2.X = 34;
			Console.WriteLine();
			node2.Y = 54;

		}
	}

	public class Node : IObserver
	{
		private double _x;
		private double _y;

		public double X
		{
			get { return _x; }
			set 
			{ 
				_x = value;
				Notify();
			}
		}
		public double Y
		{
			get { return _y; }
			set 
			{
				_y = value;
				Notify();
			}
		}

		public event ItemChangedDelegate OnItemChanged;

		public Node(double x, double y)
		{
			_x = x;
			_y = y;
		}

		public void Move(double x, double y)
		{
			_x = x;
			_y = y;
			Notify();
		}

		public void Notify()
		{
			OnItemChanged?.Invoke(this);
		}

		public override string ToString()
		{
			return $"({X}, {Y})";
		}

	}

	public class Link
	{
		private Node _start;
		private Node _end;

		public Node Start
		{
			get { return _start; }
			set 
			{
				if (value == null) return;
				if(_start != null) _start.OnItemChanged -= OnItemChanged;

				_start = value;
				_start.OnItemChanged += OnItemChanged;
			}
		}

		public Node End
		{
			get { return _end; }
			set 
			{
				if (value == null) return;
				if (_end != null) _end.OnItemChanged -= OnItemChanged;

				_end = value;
				_end.OnItemChanged += OnItemChanged;
			}
		}

		public Link(Node start, Node end)
		{
			Start = start;
			End = end;
		}

		private void OnItemChanged(object item)
		{
			Console.WriteLine(this);
		}

		public override string ToString()
		{
			return $"Link update: {Start} -> {End}";
		}
	}

	public interface IObserver
	{
		event ItemChangedDelegate OnItemChanged;
	}

}
