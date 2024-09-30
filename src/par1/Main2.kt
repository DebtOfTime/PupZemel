package par1

fun main() {
    var input = readln()
    var count = 0
    input = input.toCharArray().sorted().joinToString("")
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