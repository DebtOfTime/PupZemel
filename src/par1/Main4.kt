fun main()
{
    val input = readln()
    val split = input.split(' ')
    val a = split[0].toFloat()
    val b = split[1].toFloat()
    val operator = split[2]
    var result:Float = 0f
    when (operator)
    {
        "+" -> result = a + b
        "-" -> result = a - b
        "*" -> result = a * b
        "/" -> {
            if (b == 0f)
            {
                println("Nenada")
                return
            }
            result = a / b
        }
    }
    println(result)
}