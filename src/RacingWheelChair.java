package wc;

public class RacingWheelChair implements Move {

	private String moveType = "Move";

	@Override
	public void racing() {
		System.out.println("WheelChair for racing");
	}
	
	@Override
	public void offroad() {
		System.out.println("WheelChair for offroad");
	}
	
	@Override
	public void medical() {
		System.out.println("WheelChair for medical");
	}
	@Override
	public void daily() {
		System.out.println("WheelChair for daily");
	}
	
	@Override
	public void electric() {
		System.out.println("WheelChair for elctric");
	}

	@Override
	public String getMoveType() {
		return this.moveType;
	}
}