
object q_1 extends App{

  val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  def Encry(c:Char,key:Int,a:String):Char={
    a((a.indexOf(c.toUpper)+key)%a.size)
  }

  def decry(c:Char,key:Int,a:String):Char={
    val shift=(a.indexOf(c.toUpper)-key)%a.size
    if(shift<0){
      a(a.size+(shift))
    }
    else{
      a(shift)
    }
  }

  val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>
    {
      s.map(algo(_,key,a))
    }
  val res=cipher(Encry,"ABCDE",4,alphabet)
  println(res)


}