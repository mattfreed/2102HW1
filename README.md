# 2102HW1
HW 1 for  CS2102 (Object Oriented Design) Java

Problem Statement:
One popular event in the winter Olympics is the biathlon. In this competition, athletes participate in two events, cross-country skiing and shooting. In this program you'll model athletes competing in the biathlon. Your job will be to create the initial software to record athletesâ€™ results in these events and to provide methods that do some basic performance comparisons between individual athletes. Specifically, your tasks are as follows:
1)Create an Athlete class with two fields: one holds a ShootingResult object and the other holds a SkiingResult object.
2)The ShootingResult class holds four separate ShootingRound objects, one for each of four rounds (e.g., round1, round2, round3, and round4). Each ShootingRound stores the number of targets hit (out of five). Use int for this value. Assume that only valid numbers of targets hit will be created; you do not need to do any error checking at this point in the course.
3)The SkiingResult class holds the time (in seconds) at which the athlete crossed the finish line in the cross-country race, the athleteâ€™s position in the finishing order (1 for first, 2 for second, etc), and the athlete's ShootingResult. Use a double for the time and an int for the position.
4)Each of ShootingResult and SkiingResult should implement an IEvent interface. This interface should require a method called pointsEarned which takes no additional inputs and returns a double representating an athleteâ€™s score on that event.
The points earned for a ShootingResult is the sum of the targets hit for each round.
For most athletes, the points earned for a SkiingResult is the finishing time modified by the number of shots missed in each shooting round (see the next step regarding the addShootingPenalties method). Then, the points for the first place finisher takes 10 seconds off this modified finishing time. Similarly, the second-place finisher gets 7 points off, and the third-place finisher gets 3 points off. All other finishers have just their modified finishing time as the points.
5)In the SkiingResult class, include a method called addShootingPenalties. This method should take a ShootingResult as an input and add 20 seconds for each target (out of five) missed in each round. It should return the modified time as a double.
6)In the Athlete class, include a betterSkiier method that takes another Athlete as input and produces the athlete with the better (lower) Skiier score. Assume there are no ties (meaning we wonâ€™t test for ties and neither should you, as the behavior in event of a tie is not specified).
7)In the Athlete class, include a hasBeaten method that takes another Athlete as input and returns a boolean indicating whether the athlete has either a higher Shooting score or a lower skiing score than the given (input) Athlete.
8)Create a test suite for your work. Put all of your tests and test data in a class called Examples.
Note on testing Doubles: When you want to use assertEquals to compare doubles, you include a third argument which is the allowable difference between the two values for them to still be considered equal. For example:

      assertEquals(5.0, 4.995, .01)
returns true. Doubles can be imprecise due to the way they are represented within the computer, hence the need for this third argument.
Note on Writing Tests that Compare Objects: A subtlety to JUnit (that we will talk about next week) affects how you write tests that compare objects. When writing these tests, name the objects for your rounds and use the names in the assertEquals test. The example below assumes that ShootingResult contains a hypothetical method called bestRound() that returns a ShootingRound:

      public class Examples {

        ShootingRound longRound = new ShootingRound(...);
        ShootingResult goodResult = new ShootingResult(... longRound ...);

        ...

        @Test
        public void testLongBest() {
          assertEquals(longRound, goodResult.bestRound());
        }
      }
You should NOT make a new ShootingRound for the expected answer in the assertEquals. Such a test would fail, even if the two rounds had the same contents (again, for reasons we will explain in detail in week 2).
