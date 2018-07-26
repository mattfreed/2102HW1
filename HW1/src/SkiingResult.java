
class SkiingResult implements IEvent{
	double time;
	int position;
	ShootingResult shootingResult;
	//Constructs results for parameters: time, position, and total shooting result
	SkiingResult(double time, int position, ShootingResult shootingResult){
		this.time= time;
		this.position = position;
		this.shootingResult = shootingResult;
	}
	//Determines shooting penalties. Takes paramater shootingResults and outputs the required added time.
	double addShootingPenalties(ShootingResult shootingResult) {
		double points = shootingResult.pointsEarned();
		double missed = 20 - points;
		double addTime = 20 * missed;		
		return addTime;
	}
	//Determines total points earned by adding the shooting penalties to the total time. Adjusts score depending on position. Outputs final total points earned.
	public double pointsEarned() {
		double shootingPenalties = addShootingPenalties(shootingResult);
		double pointsEarned = 0;
		
		if (position == 1) {
			pointsEarned = time + shootingPenalties - 10;
		}
		else if (position == 2) {
			pointsEarned = time + shootingPenalties - 7;
		}
		else if (position == 3) {
			pointsEarned = time + shootingPenalties - 3;
		}
		else {
			pointsEarned = time + shootingPenalties;
		}
		return pointsEarned;
	}
}