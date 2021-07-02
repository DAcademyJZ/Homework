object Main extends App {
 
  
def Zadanie_1(parametr:String)= parametr match
  {
    case "Poniedzialek"|"Wtorek"|"Sroda"|"Czwartek"|"Piatek" => "Praca"
    case "Sobota"|"Niedziela" => "Weekend"
    case _ => "Nie ma takiego dnia"
  }
println("Zadanie 1")
println("Jak Poniedziałek to niestety => "+Zadanie_1("Poniedzialek"))
println("Ale od Soboty jest już => "+Zadanie_1("Sobota"))
println("Czy jest cos takiego jak zly dzien? => "+Zadanie_1("Zly dzien"))
  
class KontoBankowe(private var stan_konta: Double =0)
{
  def sprawdz_stan_konta()= {stan_konta}
  def wplata(kwota:Double)=
  {
  stan_konta += kwota
  }
  def wyplata(kwota:Double)=
  {
  stan_konta -= kwota 
  } 
}
println("Zadanie 2")
val dawaj_kase = new KontoBankowe(1000)
println("Stan konta 1 na poczatku -> "+dawaj_kase.sprawdz_stan_konta())
dawaj_kase.wplata(100)
println("Stan konta 1 po wplaceniu 100 -> "+dawaj_kase.sprawdz_stan_konta())
dawaj_kase.wyplata(200)
println("Stan konta 1 po wyplaceniu 200 -> "+dawaj_kase.sprawdz_stan_konta())
val pusto = new KontoBankowe()
println("Domyslny stan konta bez nadania poczatkowego stanu -> "+pusto.sprawdz_stan_konta())

  
case class Osoba(val imie:String, val nazwisko:String)
val osoba_1 = new Osoba("Waldemar","Ciech")
val osoba_2 = new Osoba("Katarzyna","Janda")
val osoba_3 = new Osoba("Tomasz","Sydow")
val osoba_4 = new Osoba("Ania","Kielek")
def przywitaj_sie(a:Osoba):String = a match{
case Osoba("Waldemar","Ciech") => "Witam Pana Waldka"
case Osoba("Katarzyna","Janda") => "Mam zaszczyt przywitać Panią Katarzynę"
case Osoba("Ania","Kielek") => "Cześć Ania"
case _ => "Hey"
}
println("Zadanie_3")
println(przywitaj_sie(osoba_1))
println(przywitaj_sie(osoba_2))
println(przywitaj_sie(osoba_4))
  
def Zadanie_4(a: Int, b: (Int) => Int): Int =
{
  b(b(b(a)))
}
val z = 4
def pomnoz_2(c:Int):Int = c*2
println("Zadanie_4")
println("2*2*2*4 to -> "+Zadanie_4(z,pomnoz_2))