package main.java.realizationBeanFactory;

public class BookwormOracle implements Oracle{
    private Encyclopedia encyclopedia;

    public void setEncyclopedia(Encyclopedia encyclopedia) {
        this.encyclopedia = this.encyclopedia;
    }
    @Override
    public String defineMeaningOfLife() {
        return  "Encyclopedias are а waste of money - go "
                + "see the world instead";
    }
}
