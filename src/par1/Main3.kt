package par1
fun main() {

    var input:Int = readln().toInt()
    var revers:String = "";
    do
    {
        revers += input%2
        input/=2
    }while (input >= 1)
    var NotRevers:String = ""
    for (i in revers.length - 1 downTo 0)
    {
        NotRevers += revers[i]
    }
    println(NotRevers)
}