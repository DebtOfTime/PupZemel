import kotlin.math.log

fun main()
{
    val x:Int = readln().toInt();
    val n:Int = readln().toInt();

    val power:Double = log(n.toDouble(), x.toDouble());
    if(power % 1 == 0.0)
    {
        println(power.toInt());
    }
    else
    {
        println("Целочисленный показатель не существует");
    }
}