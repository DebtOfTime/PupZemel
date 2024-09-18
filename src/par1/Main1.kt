package par1

fun main() {
    val input = readln()
    var count = 0
    var lastChar = input[0];
    for(item in input)
    {
        if(lastChar == item)
        {
            count++
        }
        else
        {
            print("$lastChar$count")
            count=1
        }
        lastChar = item
    }
    print("$lastChar$count")
}