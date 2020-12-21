// Properties of rectangle

class Rectangle constructor(var length:Int, var width:Int){
    fun area():Int{
        return (length*width)
    }
	fun perimeter():Int{
        return (2*length)+(2*width)
    }
    fun diagonal():Double{
        return Math.pow(((length*length)+(width*width)).toDouble(),0.5)
    }
}

fun main(){
  var shape1=Rectangle(10,6)
  println("Area of the rectangle is ${shape1.area()}")             //60
  println("Perimeter of the rectangle is ${shape1.perimeter()}")   //32
  println("Diagonal of the rectangle is ${shape1.diagonal()}")     //11.661903789690601
}
