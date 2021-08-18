
# java-fundamentals


### Lab-01:Java Primitives and Control Flow <br>
**Finished Tasks** :<br>

1-*Flipping Coins:* Write a function called flipNHeads that accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.<br>

2- *Command Line Clock:* Write a method clock that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.<br>


<hr>

### Lab-02: Arrays, Loops, Imports, ArrayLists<br>

**Finished Tasks :**<br>

1- *Rolling Dice:* Write a method called roll that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.

2- *check if Contains Duplicates:* Write a method called containsDuplicates that returns true or false depending on whether the array contains duplicate values.

3-*Calculating Averages:* Write a method that accepts an array of integers and calculates and returns the average of all the values in the array.

4- *Lowest weekly Month Temperatures average temperatures for Seattle:* Given an array of arrays calculate the average value for each array and return the array with the lowest average.
<hr>

### lab-03 : Maps and File I/O<br>
**Finished Tasks :**<br>
1-**Analyzing Weather Data:**
Use the October Seattle weather data . Iterate through all of the data to find the min and max values.
 iterate from the min temp to the max temp and create a String containing any temperature not seen during the month. Return that String.
=======


### lab-06 : Composition and Inheritance, Part 2<br>
**Finished Tasks :**<br>
1-**Add a Review for Restaurants :**
Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category
2-Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.
3-A Review should be about a single Restaurant. Choose an implementation for this, and implement it. 
4-Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant
5-When you associate a review with a restaurant, that restaurant’s star rating should change. Ensure that your addReview method updates the Restaurant star rating appropriately
<hr>
=======
### lab-07 : Composition and Inheritance, Part 1<br>
**Finished Tasks :**<br>
1-The users want shops! Create a Shop class; a Shop should have a name, description, and number of dollar signs.
2-The users also want to review shops
3-The users want theaters! Create a Theater class; a Theater should have a name and all of the movies currently showing there
4-Review all the things
5-Users are frustrated: they like having a body, an author, and a number of stars, but when they’re reviewing a Theater, they also want to specify which movie they saw.


