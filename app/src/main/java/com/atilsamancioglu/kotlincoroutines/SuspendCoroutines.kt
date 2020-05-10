package com.atilsamancioglu.kotlincoroutines

import kotlinx.coroutines.*

fun main() {

    runBlocking {
        delay(2000)
        println("run blocking")
        myFunction()
    }

}

suspend fun myFunction() {
    coroutineScope {
        delay(4000)
        println("suspend function")
    }
}