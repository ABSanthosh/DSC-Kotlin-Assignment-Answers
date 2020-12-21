// Change the text to mocking text

class SpongeBob{  
    fun mockingText(text:String):String{
        var result:String =""
        var temp:Int;
        for(i in text){
            temp =listOf(0,1).random()
            // println(listOf(0,1).random())
            if(temp==1){
                //caps
                result+=i.toUpperCase()
            }else{
                //Small
                result+=i.toLowerCase()
            }
        }
       	return result
    }
}

fun main(){
    var f = SpongeBob()
    println(f.mockingText("abcdefghijklmnopqrstuvwxyz"))
    // aBCdeFGHIjklmnOPQrsTUvWXYZ
}