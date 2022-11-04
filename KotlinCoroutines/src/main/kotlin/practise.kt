
//    thread {  //creates background thread
//        println("Work in background thread starts: ${Thread.currentThread().name}")
//        Thread.sleep(1000) //3 seconds work
//        println("Background work finished: ${Thread.currentThread().name}")
//    }
//
//    GlobalScope.launch {  //creates background thread
//        println("Work in background thread starts: ${Thread.currentThread().name}")
//        Thread.sleep(1000) //3 seconds work
//        println("Background work finished: ${Thread.currentThread().name}")
//    }
// Thread.sleep(2000) //blocks main thread and waits for corountine to finish
//some other code