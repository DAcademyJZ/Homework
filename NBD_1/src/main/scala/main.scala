import scala.collection.convert.ImplicitConversions.`seq AsJavaList`
import scala.collection.convert.ImplicitConversionsToJava.`seq AsJavaList`
import scala.util.control.Breaks.{break, breakable}
import scala.language.postfixOps
import scala.annotation.tailrec
object Main extends App {

println("Hello Scala ;)")
  var tydzien:List[String] = List(
    "Poniedzialek",
    "Wtorek",
    "Sroda",
    "Czwartek",
    "Piatek",
    "Sobota",
    "Niedziela")
  
    def Zadanie_1_a(myList:List[String])= 
  {
    var toprint = "";
    for(i <-0 until myList.length)
    {
      if(i == myList.length - 1)
        toprint += myList.get(i)
      else
      toprint += myList.get(i) + ","  
    }
    toprint}
println("Zadanie 1 a");
println( Zadanie_1_a(tydzien))
  
      def Zadanie_1_b(myList:List[String])= 
  {
    var toprint = "";
    for(i <-0 until myList.length)
    { breakable{
      if (!myList.get(i).startsWith("P")) break

      toprint += myList.get(i) + ","  
    }}
    if(toprint.length!=0)
    toprint.dropRight(1)
    else{
    println("pusto ;")}}
    

println("Zadanie 1 b");
println(Zadanie_1_b(tydzien))
      
def Zadanie_1_c(myList:List[String]):String=
  {
    var toprints = "";
    var i=0;
    while(i <  myList.length)
    {
      if(i == myList.length - 1)
      toprints += myList.get(i);

      else
      
      toprints += myList.get(i) + ","
      i+=1
    }
    toprints;
  }
    

println("Zadanie 1 c");
println(Zadanie_1_c(tydzien));
  
  
  
  
  
  
  
  
  
  
  
def Zadanie_2_a(myList:List[String]):String = 
  {
    if(myList.length == 1)
    myList.head;
    else myList.head+","+Zadanie_2_a(myList.tail)
  };
println("Zadanie 2 a")
println(Zadanie_2_a(tydzien));
  
def Zadanie_2_b(myList: List[String],my_e: String = ""): String = myList match {
  case Nil =>my_e
  case a :: Nil =>(a + ',' +my_e).substring(0, (my_e + ',' + a).length() - 1)
  case a :: b :: ac =>Zadanie_2_b(b :: ac, a + ',' +my_e)
  }
  println("Zadanie 2b")
  println(Zadanie_2_b(tydzien))
  
    @tailrec  
    def Zadanie_3(myList: List[String],toprint:String): String = {
        if (myList.tail.isEmpty)
          {return toprint+myList.head}
        else   
      {Zadanie_3(myList.tail,toprint+myList.head + ",")}
      }
println("Zadanie 3")
println(Zadanie_3(tydzien,""));
  
def Zadanie_4_a(myList: List[String]) : String = 
  {
    myList.foldLeft("") {(a, b) => {a + b + ","}}.dropRight(1)
  }
  
println("Zadanie 4 a")
println(Zadanie_4_a(tydzien));
  
def Zadanie_4_b(myList: List[String]) : String = 
  {
    myList.foldRight("") {(a, b) => {if(a !="")a + "," + b else b}}.dropRight(1)
  }  
println("Zadanie 4 b")
println(Zadanie_4_b(tydzien));
  
def Zadanie_4_c(myList: List[String]) : String = 
  {
  myList.foldLeft("") {(a, b) => {if (b.startsWith("P"))a + b + "," else a}}.dropRight(1)
    
  }
println("Zadanie 4 c")
println(Zadanie_4_c(tydzien));
  
val produkty = Map("Ajfon"->5,"Szajsung"->3,"Cegla"->6,"Worek_ziemniakow"->7);
val przecena = produkty map { case (a, b) => (a, b * 0.9)};
  println("Zadanie 5")
  println("Mapa z produktami")
  println(produkty)
  println("Mapa z przecenionymi produktami")
  println(przecena)
  
def Zadanie_6(krotka:(Double, Int,String)) = {
    println(krotka)
  }
println("Zadanie 6")
Zadanie_6(12.6,1,";)")
val prezentacja = Map("Apple"->"iOS", "Microsoft"->"Windows","Opensource"->"Linux")
println("Zadanie 7")
println("prezentacja.get(Apple)==> "+prezentacja.get("Apple"));
println("prezentacja.get(Mercedes)==> " + prezentacja.get("Mercedes"));  
  

def Zadanie_8(myList: List[Int]): List[Int] = {  
  if(myList.length == 0) myList
  else if (myList.head == 0) Zadanie_8(myList.tail)
  else myList.head ::  Zadanie_8(myList.tail)
  }
val intsy = List(0,0,2,2,3,3,0,4,0,0)
println("Zadanie 8")
println("przed")
println(intsy)
println("po")
println(Zadanie_8(intsy))

def Zadanie_9(myList: List[Int])=  
{
  def operacja(liczba: Int)=
  {liczba+1}
  myList.map(operacja) 
}
println("Zadanie 9")
println("przed")
println(intsy)
println("po")
println(Zadanie_9(intsy))
  
def Zadanie_10(myList: List[Double]):List[Double]=
  {
    val myList_filtered = myList.filter(x=> x> -5 && x< 12)
    return(myList_filtered map (x=>x.abs))
  }
val do_10=List(-1.1,-5,15,20,10,7,-7)
println("Zadanie 10")
println("przed")
println(do_10)
println("po")
println(Zadanie_10(do_10))

  }

  






