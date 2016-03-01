
  object BinaryGap { 
    
    def fGapCalculate(N: Int): Int = {
      
     var vMaxGap:Int  = 0 //Maximum 0 gap variable
     var vCurrGap:Int = 0 //Current 0 gap
     var pGivenNum:Int = N // Given value
     var vRemainder:Int = 0
      
      while (pGivenNum>0 && pGivenNum%2 == 0)
           pGivenNum = pGivenNum/2
      
      while (pGivenNum > 0)
      {
        vRemainder = pGivenNum%2
        if (vRemainder == 0) //To start the gap
          vCurrGap += 1
          
        else // to end the gap
        {
          if (vCurrGap != 0)
             vMaxGap = List(vCurrGap, vMaxGap).max
           vCurrGap=0
        }
        pGivenNum = pGivenNum/2 //iterating
      }
        
      return vMaxGap
      
      
    }
  
    def main (args: Array[String]): Unit = {
    println("BinaryGap of the number " + args(0) + " is: ")
    println(fGapCalculate (args(0).toInt))
   }
    
  }