package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val numbers = Array(n) { "" }
    for (i in 0..<n){
        if ((i%3 == 0) and (i%5==0)){
            numbers[i] = "FizzBuzz"
        }
        else if (i%3==0){
            numbers[i] = "Fizz"
        }else if(i%5==0){
            numbers[i] = "Buzz"
        }else {
            numbers[i] = i.toString()
        }
    }
    return numbers
}