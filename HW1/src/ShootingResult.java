
class ShootingResult implements IEvent {
	
	ShootingRound round1;
	ShootingRound round2;
	ShootingRound round3;
	ShootingRound round4;

	//constructs results of rounds 1,2,3,4
	ShootingResult (ShootingRound round1, ShootingRound round2, ShootingRound round3, ShootingRound round4) {
		this.round1 = round1;
		this.round2 = round2;
		this.round3 = round3;
		this.round4 = round4;
	}
	
	//sums total targets hit for all rounds. Returns total targets hit
	public double pointsEarned() {
		int result = round1.targetsHit + round2.targetsHit + round3.targetsHit+ round4.targetsHit;
		return result;
	}
}
