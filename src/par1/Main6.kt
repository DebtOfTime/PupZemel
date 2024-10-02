fun main()
{
    val a:Int = readln().toInt();
    val b:Int = readln().toInt();

    if((a % 2 == 0 && b % 2 == 0)  || a == 0 || b == 0)
    {
        println("Создать нечетное число невозможно");
    }
    else
    {
        if(a % 2 == 0)
        {
            println("$a$b");
        }
        else if (b % 2 == 0)
        {
            println("$b$a");
        }
        else
        {
            println("$a$b");
            println("$b$a");
        }
    }
}
