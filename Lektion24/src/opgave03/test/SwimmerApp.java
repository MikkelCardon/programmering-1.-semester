package opgave03.test;

import opgave03.model.Swimmer;
import opgave03.model.TrainingPlan;

import java.util.ArrayList;

public class SwimmerApp {
    
    public static void main(String[] args) {

        ArrayList<Double> lapTimes = new ArrayList<>();
        lapTimes.add(1.02);
        lapTimes.add(1.01);
        lapTimes.add(0.99);
        lapTimes.add(0.98);
        lapTimes.add(1.02);
        lapTimes.add(1.04);
        lapTimes.add(0.99);
        Swimmer swimmer1 = new Swimmer("Jan", 1994, lapTimes, "AGF");

        lapTimes = new ArrayList<>();
        lapTimes.add(1.05);
        lapTimes.add(1.01);
        lapTimes.add(1.04);
        lapTimes.add(1.06);
        lapTimes.add(1.08);
        lapTimes.add(1.04);
        lapTimes.add(1.02);
        Swimmer swimmer2 = new Swimmer("Bo", 1995, lapTimes, "Lyseng");

        lapTimes = new ArrayList<>();
        lapTimes.add(1.03);
        lapTimes.add(1.01);
        lapTimes.add(1.02);
        lapTimes.add(1.05);
        lapTimes.add(1.03);
        lapTimes.add(1.06);
        lapTimes.add(1.03);
        Swimmer swimmer3 = new Swimmer("Mikkel", 1993, lapTimes, "AIA-Tranbjerg");

        ArrayList<TrainingPlan> trainingPlans = new ArrayList<>();

        TrainingPlan levelA = new TrainingPlan('A', 16, 10);
        TrainingPlan levelB = new TrainingPlan('B', 10, 6);

//        swimmer1.setTrainingPlan(levelA);
//        swimmer2.setTrainingPlan(levelA);
//        swimmer3.setTrainingPlan(levelB);

            trainingPlans.add(levelA);
            trainingPlans.add(levelB);

            levelA.addSwimmerToPlan(swimmer1);
            levelA.addSwimmerToPlan(swimmer2);
            levelB.addSwimmerToPlan(swimmer3);

        for (TrainingPlan trainingPlan : trainingPlans) {
            System.out.println(trainingPlan.getSwimmers());
        }

        for (TrainingPlan trainingPlan : trainingPlans) {
            System.out.println("plan "+ trainingPlan.getLevel() + " total hours are: "+ trainingPlan.totalPlanHours());
        }
        System.out.println(swimmer1.getTrainingPlan());

        levelA.removeSwimmerFromPlan(swimmer1);
        //swimmer1.setTrainingPlan(null);

        System.out.println(swimmer1.getTrainingPlan());



    }
    
}
