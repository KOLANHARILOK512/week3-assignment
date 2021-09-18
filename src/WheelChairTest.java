package wc;

public class WheelChairTest {
	
	public static void main(String[] args) {
		Move move = new RacingWheelChair();
		
		move.racing();
		move.offroad();
		move.medical();
		move.daily();
		move.electric();
		System.out.println(move.getMoveType());

	}

}
