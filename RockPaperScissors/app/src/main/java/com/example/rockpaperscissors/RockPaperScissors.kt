package com.example.rockpaperscissors

import java.util.Locale

fun main(){

    println("Rock Paper Scissors? Enter choice")
    var playerChoice =readln().lowercase()



    while (playerChoice != "rock" && playerChoice != "paper" && playerChoice != "scissors") {
        println("Please enter AGAIN")
         playerChoice =readln().lowercase()

    }
    val randomNumber = (1..3).random()

    val computerChoice = when (randomNumber) {
        1 -> "rock"
        2 -> "paper"
        else -> "scissors"
    }

    println("Computer choice: $computerChoice")



    val winner = when  {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "rock" && computerChoice == "scissors"-> "Player"
        playerChoice == "paper" && computerChoice == "rock"-> "Player"
        playerChoice == "scissors" && computerChoice == "paper"-> "Player"

        else -> "Computer"
    }

    if (winner == "Tie") {
        println("It is a tie")
    } else {
        println("$winner has won")
    }


}