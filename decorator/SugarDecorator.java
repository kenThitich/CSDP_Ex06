
public class SugarDecorator extends Decorator {

    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + addSugerDesc();
    }

    public String addSugerDesc() {
        return "sugar ";
    }

    @Override
    public int getCost() {
        return super.getCost() + addSugerCost();
    }

    public int addSugerCost() {
        return 1;
    }
    
    
}