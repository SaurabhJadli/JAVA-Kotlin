fun caluTimeDiff() {

//Taking Starting Time
                    print("Enter start Hour: ")
                    var startHour:Int = Integer.valueOf(readLine())

                    print("Enter start Min: ")
                    var startMin:Int = Integer.valueOf(readLine())

                    print("Enter start Sec: ")
                    var startSec:Int = Integer.valueOf(readLine())

                    println("\nVery Good, Now Enter Ending Time.\n")

 //Taking Ending Time
                    print("Enter end Hour: ")
                    var endHour:Int = Integer.valueOf(readLine())

                    print("Enter end Min: ")
                    var endMin:Int = Integer.valueOf(readLine())

                    print("Enter end Sec: ")
                    var endSec:Int = Integer.valueOf(readLine())


                    val startTimeInSec = startHour * 3600 + startMin * 60 + startSec
                    val endTimeInSec = endHour * 3600 + endMin * 60 + endSec

                    val timeDiffInSec = endTimeInSec - startTimeInSec

                    val hours = timeDiffInSec / 3600
                    val min = (timeDiffInSec % 3600) / 60
                    val sec = timeDiffInSec % 60

                    println("\nTime diff: $hours hours, $min min and $sec secs.") 

                }


fun main() {
    val result = caluTimeDiff()
    println(result)
} 