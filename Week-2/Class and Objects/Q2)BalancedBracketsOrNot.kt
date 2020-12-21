// Parenthesis balanced or not

class Parenthesis constructor(var string:String){
    var stack = mutableListOf<Char>()
    var charMap = mapOf<Char,Char>('{' to '}','[' to ']','(' to ')')
    
    fun isValid():Boolean{
      	for(i in string){
            if(i in charMap.keys){
                stack.add(i)
            }else if(i in charMap.values){
                if(i == charMap[stack[stack.size-1]]){
                    stack.removeLast()
                }
            }
        }
		if(stack.size==0){return true}
        else {return false}
    }
}

fun main(){
  var stringOne = Parenthesis("{((()]}")     //false
  var stringtwo = Parenthesis("{[[({})]]}")  //true
  println(stringOne.isValid())
  println(stringTwo.isValid())
}