  fun main(args : Array<String>){
      
 
        newOne()
      //Loops
          //for loop
              for(n in 10..15){
                  println("Loop: $n")
          }
        //for loop
        var number = 10
        while(number >=5){
            println("Loop: $number")
            number--
        }
      //Contorlling loops
          //continue statement
          for (n in 1..10){
              if(n%2!=0)
                  continue
              println("$n")
          }
        
        //break staement
        for(x in 1..10){
            println("before break, Loop: $x")
            if (x==5) {
                println("I am terminating loop")
                break
            }
        }
        
  }
