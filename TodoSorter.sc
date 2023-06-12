import scala.io.StdIn.readLine

def manualSort(unsortedList: List[Int]): List[Int] = {
  var sortedList = unsortedList

  for (i <- 0 until sortedList.length - 1) {
    for (j <- 0 until sortedList.length - i - 1) {
      print(s"Is ${sortedList(j)} greater (>) or less (<) than ${sortedList(j + 1)}? ")
      val comparison = readLine()

      if (comparison == ">") {
        sortedList = sortedList.updated(j, sortedList(j + 1)).updated(j + 1, sortedList(j))
      }
    }
  }

  sortedList
}

val unsorted = List(5, 2, 8, 1, 9)
val sortedResult = manualSort(unsorted)

println(sortedResult)