package Secret_dont_open

var points:Float = 0f;
var maxPoints:Float = 0f;

fun main()
{
    points = 0f;
    maxPoints = 0f;
    println("Добро пожаловать в тест на Жеку! Тест состоит из нескольких вопросов, на каждый из которых вы можете ответить \"да\" или \"нет\". Удачного прохождения!")
    points += question("Вас зовут Евгений Ильич?", 1f, 0f);
    points += question("Вы стример?", 1f, 0f);
    points += question("Вы играли в Dark Souls?", 1f, 0f);
    points += question("Вы являетесь фанатом киновселенной marvel?", 1f, 0f);
    if(points >= 4)
    {
        points += question("Чужие золотые шахты лучше своих серебрянных?", 1f, 0f);
    }
    points += question("2+2+2*2=6?", 1f, 0f);
    var currentPoints = points;
    points += question("Вас раздражает Саня?", 1f, 0f);
    if(points > currentPoints)
    {
        println("Ну а кого не раздражает то?)");
    }
    points += question("Вы встречались с Эль Паном?", 1f, 0f);
    currentPoints = points;
    points += question("Вы поигрываете в Geometry Dash?", 1f, 0f);
    if(points > currentPoints)
    {
        points += question("Вы уважаете cherryteam?", 1f, 0f);
    }
    if(points >= 6)
    {
        points += question("Вас отчисляли с третьего курса?", 1f, 0f);
    }
    if(points >= 8)
    {
        points += question("У вас есть проблемы с речью?", 1f, 0f);
    }
    currentPoints = points;
    points += question("У вас есть личный тг канал?", 1f, 0f);
    if(points > currentPoints)
    {
        points += question("Вы там банили кого-нибудь?", 1f, 0f);
    }
    if(points >= 10)
    {
        println("Вы прыщи свои хаваете?");
        val answer = readln().lowercase()
        if(answer == "нет" || answer == "не" || answer == "0" )
        {
            println("Пиздишь, сука!");
        }
    }
    val percentage:Float = points / maxPoints * 100f;
    print("Вы евгенист на $percentage%. ");
    if(percentage > 90)
    {
        println("Фу блять, прыщеед ебаный!");
    }
    else if (percentage > 70)
    {
        println("Не, Жека, напиздел ты, перепроходи тест!");
    }
    else if (percentage > 50)
    {
        println("Возможно вы хаваете свои прыщи, но я не уверен.");
    }
    else if (percentage > 30)
    {
        println("Евгенистские наклонности у вас имеются, но ничего серьёзного нет.");
    }
    else
    {
        println("Хороший результат! Наконец-то нормальный человек, а не Жека.");
    }
}

fun question(question: String, pointsIfYes: Float, pointsIfNo:Float):Float
{
    println(question);
    maxPoints += pointsIfYes.coerceAtLeast(pointsIfNo);
    while(true)
    {
        val answer:String = readln();
        val ansLowerCase:String = answer.lowercase();
        when(ansLowerCase)
        {
            "да" -> return pointsIfYes;
            "1" -> return pointsIfYes;
            "нет" -> return pointsIfNo;
            "не" -> return pointsIfNo;
            "0" -> return pointsIfNo;
        }
        println("Ответ не понятен, попробуйте ответить ещё раз");
    }
}