package CorrutineButtons.ui

class CorrutineViewModel {
    private var redOrBlue = false
    private var counter = 0

    fun buttonColor(): Long {
        if (redOrBlue){
            redOrBlue = false
            return 0xFF992D31
        }else{
            redOrBlue = true
            return 0xFF2D4499
        }
    }

    fun blockApp(): String {
        counter +=1
        Thread.sleep(5000)
        return "Api response : $counter"
    }
}
