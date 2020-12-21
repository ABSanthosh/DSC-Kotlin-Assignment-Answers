// Roman number to Integer and Integer to roman number

class Converter{  
    fun IntToRoman(integer:Int):String{
        var num = listOf(1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000)
    	var sym = listOf("I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M")
        var div:Int;
        var int:Int = integer
        var result:String =""
        var i:Int = 12
        do{
        	div = int / num[i] 
            int %= num[i]
            while(div!=0){
                div--
                result+=sym[i]
            }
            i--
        }
        while(int!=0)
        
        return result
    }
}

fun main(){
    var f = Converter()
    println(f.IntToRoman(1234))  //MCCXXXIV
    println(f.IntToRoman(84))    //LXXXIV
    println(f.IntToRoman(3452))  //MMMCDLII 
}