using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp7
{
    class Program
    {


        static void Main(string[] args)
        {
            // int f(int x)
            // { return x * x; }
            Func<int, int> f = x => x * x;
            Console.WriteLine(f(5));
            Func<int, bool> w = y => y % 3 == 0;
            Console.WriteLine(w(8));
            Action<string> nazwa = k =>
              {
                  Console.WriteLine(k);
              };
            nazwa("Dzien dobry !");
            Func<int, int> nowa = z =>
              {
                  int s = 0;
                  for (int i = 1; i <= z; i++)
                  { s = s + i; }
                  return s;
              };
            Console.WriteLine(nowa(4));
            Func<int, string, bool> zakrotki = (x, s) => s.Length < x;
            Console.WriteLine(zakrotki(10, "Ala ma kota"));
            var l = (2, 3, 5);
            Func<(int, int, int), (int, int, int)> fk = n => (3 * n.Item1, 3 * n.Item2, 3 * n.Item3);
            var l1 = fk(l);
            Console.WriteLine(l1);
        }
    }
}


