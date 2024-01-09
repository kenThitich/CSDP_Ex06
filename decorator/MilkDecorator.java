
public class MilkDecorator extends Decorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + addMilkDesc();
    }

    public String addMilkDesc() {
        return "milk ";
    }

    @Override
    public int getCost() {
        return super.getCost() + addMilkCost();
    }

    public int addMilkCost() {
        return 3;
    }
    
    
}