
using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp18
{
    class Program
    {
        class ksiazka
        {
            public string tytul, autor;
            public int strony;
            public ksiazka(string a, string b, int c)
            { tytul = a; autor = b; strony = c; }
        }
        static void Main(string[] args)
        {
            List<ksiazka> bibl = new List<ksiazka>();
            Console.WriteLine("Podaj ilosc ksiazek");
            int n = Convert.ToInt32(Console.ReadLine());
            int i;
            for (i = 0; i < n; i++)
            {
                Console.WriteLine("Podaj tytul ksiazki numer {0}", i + 1);
                string t = Console.ReadLine();
                Console.WriteLine("Podaj autora ksiazki numer {0}", i + 1);
                string aut = Console.ReadLine();
                Console.WriteLine("Podaj liczbe stron ksiazki numer {0}", i + 1);
                int s = Convert.ToInt32(Console.ReadLine());
                bibl.Add(new ksiazka(t, aut, s));
            }
            bibl.Insert(0, new ksiazka("Lalka", "Prus", 650));
            ksiazka znaleziona = bibl.Find(element => element.strony < 400);
            Console.WriteLine("Tytul:{0}, Autor:{1}, Liczba stron:{2}", znaleziona.tytul, znaleziona.autor, znaleziona.strony);
            Console.WriteLine("****************");
               List<ksiazka> inna = bibl.FindAll(e => e.autor.Equals("Prus"));
               IEnumerable<ksiazka> inna1 = bibl.Where(e => e.autor.Equals("Prus")); 
            i = 0;
               foreach (ksiazka y in inna1 )
            {
                Console.WriteLine("Ksiazka numer {0}", i + 1);
                Console.WriteLine("Tytul:{0}, Autor:{1}, Liczba stron:{2}", y.tytul, y.autor, y.strony);
            }
            Console.WriteLine("Drugi raz");
          for (i = 0; i < inna.Count(); i++)
            {
                Console.WriteLine("Ksiazka numer {0}", i + 1);
                Console.WriteLine("Tytul:{0}, Autor:{1}, Liczba stron:{2}", inna[i].tytul, inna[i].autor, inna[i].strony);
            }
            Console.WriteLine("****************");
            inna = bibl.FindAll(k => (k.strony < 250) && (k.autor.Equals("Sienkiewicz")));
            for (i = 0; i < inna.Count(); i++)
            {
                Console.WriteLine("Ksiazka numer {0}", i + 1);
                Console.WriteLine("Tytul:{0}, Autor:{1}, Liczba stron:{2}", inna[i].tytul, inna[i].autor, inna[i].strony);
            }
            //IEnumerable<ksiazka> Query1 =
            //           from k1 in bibl
            //         where k1.strony > 300
            //       select k1;
            //Console.WriteLine("****************");
            //foreach (ksiazka x in Query1)
            //{
            //  Console.WriteLine("Tytul:{0}, Autor:{1}, Liczba stron:{2}", x.tytul, x.autor, x.strony);
            //}
            IEnumerable<string> Query1 =
                        from k1 in bibl
                        where k1.strony > 300
                        select k1.autor;
            Console.WriteLine("****************");
            foreach (string x in Query1)
            {
                Console.WriteLine(" Autor:{0}", x);

            }

        }
    }
}
