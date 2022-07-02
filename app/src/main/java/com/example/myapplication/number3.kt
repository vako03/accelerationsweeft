package com.example.sweefttechnicalassignment

class Change
{
    fun minNoOfCoins(coins: Array < Int > , n: Int, value: Int): Unit
    {
        if (value <= 0)
        {
            return;
        }
        coins.sort();
        var record: MutableList < Int > = mutableListOf < Int > ();
        var sum = 0;
        var i: Int = n - 1;
        var c: Int ;
        while (i >= 0 && sum < value)
        {
            c = coins[i];
            while (c + sum <= value)
            {
                record.add(c);
                sum += c;
            }
            i -= 1;
        }
        println("\n Given value is " + value);
        if (sum == value)
        {
            var v = 0;
            while (v < record.size)
            {
                print("  " + record[v]);
                v += 1;
            }
        }
        else
        {
            println(" Full change are not possible");
        }
    }
}
fun main(args: Array < String > ): Unit
{
    val task: Change = Change();
    val coins: Array < Int > = arrayOf(1, 5, 10, 20, 50);
    val n: Int = coins.count();

    task.minNoOfCoins(coins, n, 80);

    task.minNoOfCoins(coins, n, 67);

    task.minNoOfCoins(coins, n, 38);

    task.minNoOfCoins(coins, n, 7);
}