package OperatorAdam;

public class Ambulance implements IService {
    private IOperator operator;

    public Ambulance(IOperator operator) {
        this.operator = operator;
        operator.registerObserver(this);
    }

    @Override
    public void update() {
        driveToIncident();
    }

    public void driveToIncident() {
        System.out.println(Ambulance.class.getSimpleName() + " received a notification and is driving to incident right now!");
        System.out.println("Incident: " + operator.getStatus());
    }
}
