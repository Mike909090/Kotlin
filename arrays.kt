fun main(args : Array<String>){
        newOne()
    
    }
//Using arrays
fun newOne(){
          var arr = arrayOf<Int>(10, 33,89)
          var arr1 =  arrayOf("Isaac", 34.0, true, 4555)
          arr[1] = 34
          arr1.set(2, 44)
          var returner :String= arr1.get(0) as String
          var counter = arr.size
      // arr.indexOf(34.0)
          println(returner)
          println(counter )
          println(arr)
          for (i in 0..arr.size-1)
          {
              println(" "+arr[i])
          }
          for (i in 0..arr1.size-1)
          {
              println(" "+arr1[i])
          }

    }

}
