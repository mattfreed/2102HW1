/*Matt Freed & Dillon Arnold
 * CS2102
 * HW 1
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {
	Athlete athlete1;
	Athlete athlete2;
    public Examples(){
    	
    	//create shooting round scores for athlete1. input is targets hit
	    ShootingRound r1 = new ShootingRound(3);
	    ShootingRound r2 = new ShootingRound(1);
	    ShootingRound r3 = new ShootingRound(4);
	    ShootingRound r4 = new ShootingRound(2);
	    
	    //create shooting result for athlete 1 with rounds 1,2,3,4 as inputs
	    ShootingResult shootingResult1 = new ShootingResult(r1, r2, r3, r4);
	    
	    //create skiing result for athlete 1 with time, position, and the total shooting result as inputs.
	    SkiingResult skiingResult1 = new SkiingResult(20.1, 1, shootingResult1);
	    
	    //create athlete1 object with inputs shooting result and skiing result
	    athlete1 = new Athlete(shootingResult1, skiingResult1);
	    
	    //create shooting round scores for athlete2. input is targets hit
	    r1 = new ShootingRound(5);
	    r2 = new ShootingRound(3);
	    r3 = new ShootingRound(4);
	    r4 = new ShootingRound(1);
	    
	    //create shooting result for athlete 2 with rounds 1,2,3,4 as inputs
	    ShootingResult shootingResult2 = new ShootingResult(r1, r2, r3, r4);
	    
	    //create skiing result for athlete 2 with time, position, and the total shooting result as inputs.
	    SkiingResult skiingResult2 = new SkiingResult(18.8, 2, shootingResult2);
	    
	    //create athlete2 object with inputs shooting result and skiing result
	    athlete2 = new Athlete(shootingResult2, skiingResult2);
    }
   
    @Test//check athlete 1 shooting score
    public void athlete1ShootingScore() {
      assertEquals(10, athlete1.shootingResult.pointsEarned(),.5);
    }
    @Test//check athlete 1 skiing score
    public void athlete1SkiingScore() {
      assertEquals(210.1, athlete1.skiingResult.pointsEarned(),.5);
    }
    @Test//check athlete 2 shooting score
    public void athlete2ShootingScore() {
      assertEquals(13, athlete2.shootingResult.pointsEarned(),.5);
    }
    @Test//check athlete 2 skiing score
    public void athlete2SkiingScore() {
      assertEquals(151.8, athlete2.skiingResult.pointsEarned(),.5);
    }
    @Test //check if athlete 1 beat athlete 2
    public void athlete1HasBeaten() {
      assertFalse(athlete1.hasBeaten(athlete2));
    }
    @Test //check if athlete 2 beat athlete 1
    public void athlete2HasBeaten() {
      assertTrue(athlete2.hasBeaten(athlete1));
    }
    @Test //check better skiier using athlete 2 class
    public void betterSkiierAthlete2() {
      assertEquals(athlete2, athlete2.betterSkiier(athlete1));
    } 
    @Test  //checks better skiier using athlete 1 class
    public void betterSkiierAthlete1() {
        assertEquals(athlete2, athlete1.betterSkiier(athlete2));
    }
    @Test // checks athlete 1 shooting penalties
    public void athlete1ShootingPenalties() {
    	assertEquals(200, athlete1.skiingResult.addShootingPenalties(athlete1.shootingResult),.5);
    }
    @Test // checks athlete 2 shooting penalties
    public void athlete2ShootingPenalties() {
    	assertEquals(140, athlete2.skiingResult.addShootingPenalties(athlete2.shootingResult),.5);
    }
    
}