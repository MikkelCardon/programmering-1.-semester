package opgave03.model;

import java.util.ArrayList;

/**
 * Models a training plan for a Swimmer
 */
public class TrainingPlan {
	private char level;
	private int weeklyWaterHours;
	private int weeklyStrengthHours;
	private ArrayList<Swimmer> swimmers = new ArrayList<>();
	
	public TrainingPlan(char level, int weeklyWaterHours, int weeklyStrengthHours) {
		this.level = level;
		this.weeklyWaterHours = weeklyWaterHours;
		this.weeklyStrengthHours = weeklyStrengthHours;
	}
	
	public char getLevel() {
		return level;
	}
	
	public void setLevel(char niveau) {
		this.level = niveau;
	}
	
	public int getWeeklyStrengthHours() {
		return weeklyStrengthHours;
	}
	
	public void setWeeklyStrengthHours(int weeklyStrengthHours) {
		this.weeklyStrengthHours = weeklyStrengthHours;
	}
	
	public int getWeeklyWaterHours() {
		return weeklyWaterHours;
	}
	
	public void setWeeklyWaterHours(int weeklyWaterHours) {
		this.weeklyWaterHours = weeklyWaterHours;
	}


	public void addSwimmerToPlan(Swimmer swimmer){
		swimmers.add(swimmer);
		swimmer.setTrainingPlan(this);
	}

	public void removeSwimmerFromPlan(Swimmer swimmer){
		swimmers.remove(swimmer);
		swimmer.setTrainingPlan(null);
	}


	public ArrayList<Swimmer> getSwimmers() {
		return swimmers;
	}

	public int totalPlanHours(){
		return getSwimmers().size() * (weeklyStrengthHours+weeklyWaterHours);
	}
}
