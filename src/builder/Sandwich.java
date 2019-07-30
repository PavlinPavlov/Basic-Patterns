package builder;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {

    public static class SandwichMaker {
        private String bread;
        private List<String> meats;
        private List<String> vegetables;
        private List<String> sauces;

        public SandwichMaker(String bread) {
            this.bread = bread;
        }

        public SandwichMaker addMeat(String meat) {
            if (this.meats == null)
                this.meats = new ArrayList<>();

            this.meats.add(meat);
            return this;
        }

        public SandwichMaker addVegetable(String veg) {
            if (this.vegetables == null)
                this.vegetables = new ArrayList<>();

            this.vegetables.add(veg);
            return this;
        }

        public SandwichMaker addSauce(String sauce) {
            if (this.sauces == null)
                this.sauces = new ArrayList<>();

            this.sauces.add(sauce);
            return this;
        }

        public Sandwich makeSandwich() {
            return new Sandwich(this);
        }
    }

    private String bread;
    private List<String> meats;
    private List<String> vegetables;
    private List<String> sauces;

    public Sandwich(SandwichMaker maker) {
        this.bread = maker.bread;
        this.meats = maker.meats;
        this.vegetables = maker.vegetables;
        this.sauces = maker.sauces;
    }

    public String getBread() {
        return bread;
    }

    public List<String> getMeats() {
        return meats;
    }

    public List<String> getVegetables() {
        return vegetables;
    }

    public List<String> getSauces() {
        return sauces;
    }
}
