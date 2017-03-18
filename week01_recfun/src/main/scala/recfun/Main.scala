package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int =
      if (c == 0 || c == r) 1
      else pascal(c-1, r-1) + pascal(c, r-1)
  /**
   * Exercise 2
   */

    def balanceCounter(chars: List[Char], count: Int): Int =
      if (chars.isEmpty || count < 0) count
      else
        if (chars.head == '(') balanceCounter(chars.tail, count + 1)
        else if (chars.head == ')') balanceCounter(chars.tail, count - 1)
        else balanceCounter(chars.tail, count)

    def balance(chars: List[Char]): Boolean = balanceCounter(chars, 0) == 0

  
  /**
   * Exercise 3
   */
    def countChangeSorted(money: Int, coins: List[Int], count: Int): Int =
      if (coins.isEmpty || money < coins.head) 0
      else countChangeSorted(money - coins.head, coins, count + 1)


    def countChange(money: Int, coins: List[Int]): Int = countChangeSorted(money, coins.sorted, 0)

  }
