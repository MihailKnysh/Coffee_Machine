package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actionMain = "start";

        while (!actionMain.equals("exit")) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            chooseAction(actionMain = scanner.next(), scanner);
        }
    }

    enum Action {
        BUY, FILL, TAKE, REMAINING, EXIT
    }

    enum CoffeeType {
        RESOURCES(400, 540, 120, 9, 550),
        ESPRESSO(250, 0, 16, 1, 4),
        LATTE(350, 75, 20, 1, 7),
        CAPPUCCINO(200, 100, 12, 1, 6),
        BACK();

        private int water;
        private int milk;
        private int coffee;
        private int cups;
        private int money;

        public void setWater(int water) {
            this.water = water;
        }

        public void setMilk(int milk) {
            this.milk = milk;
        }

        public void setCoffee(int coffee) {
            this.coffee = coffee;
        }

        public void setCups(int cups) {
            this.cups = cups;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        public int getWater() {
            return water;
        }

        public int getMilk() {
            return milk;
        }

        public int getCoffee() {
            return coffee;
        }

        public int getCups() {
            return cups;
        }

        public int getMoney() {
            return money;
        }

        CoffeeType() {

        }

        CoffeeType(int water, int milk, int coffee, int cups, int money) {
            this.water = water;
            this.milk = milk;
            this.coffee = coffee;
            this.cups = cups;
            this.money = money;
        }
    }

    public static void chooseAction(String action, Scanner scanner) {
        Action act = Action.valueOf(action.toUpperCase());
        CoffeeType[] coffeeSet = {CoffeeType.ESPRESSO, CoffeeType.LATTE, CoffeeType.CAPPUCCINO, CoffeeType.BACK};
        System.out.println();

        switch (act) {
            case BUY: {
                System.out.println("What do you want to buy? " +
                        "1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");

                String typeOfCoffee = scanner.next();

                if(typeOfCoffee.equals("back")) {
                    typeOfCoffee = "4";
                }
                
                CoffeeType choice = coffeeSet[Integer.parseInt(typeOfCoffee) - 1];
                switch (choice) {
                    case ESPRESSO: {
                        makeEspresso();
                        break;
                    }
                    case LATTE: {
                        makeLatte();
                        break;
                    }
                    case CAPPUCCINO: {
                        makeCappuccino();
                        break;
                    }
                    case BACK: {
                        break;
                    }
                    default: {
                        System.out.println("Unsuitable act, please, try again");
                    }
                }
                break;
            }
            case FILL: {
                fill(scanner);
                break;
            }
            case TAKE: {
                take();
                break;
            }
            case REMAINING: {
                remaining();
                break;
            }
            case EXIT: {
                break;
            }
            default: {
                System.out.println("Unsuitable act, please, try again");
            }
        }
    }

    public static void makeEspresso() {
        CoffeeType resources = CoffeeType.RESOURCES;
        CoffeeType espresso = CoffeeType.ESPRESSO;

        if (resources.getWater() - espresso.getWater() < 0) {
            System.out.println("Sorry, not enough water!\n");

        } else if (resources.getCoffee() - espresso.getCoffee() < 0) {
            System.out.println("Sorry, not enough coffee!\n");

        } else if (resources.getCups() - espresso.getCups() < 0) {
            System.out.println("Sorry, not enough disposable cups!\n");

        } else {
            resources.setWater(resources.getWater() - espresso.getWater());
            resources.setCoffee(resources.getCoffee() - espresso.getCoffee());
            resources.setCups(resources.getCups() - espresso.getCups());
            resources.setMoney(resources.getMoney() + espresso.getMoney());
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println();
        }
    }

    public static void makeLatte() {
        CoffeeType resources = CoffeeType.RESOURCES;
        CoffeeType latte = CoffeeType.LATTE;

        if (resources.getWater() - latte.getWater() < 0) {
            System.out.println("Sorry, not enough water!\n");

        } else if (resources.getMilk() - latte.getMilk() < 0) {
            System.out.println("Sorry, not enough milk!\n");

        } else if (resources.getCoffee() - latte.getCoffee() < 0) {
            System.out.println("Sorry, not enough coffee!\n");

        } else if (resources.getCups() - latte.getCups() < 0) {
            System.out.println("Sorry, not enough disposable cups!\n");

        } else {
            resources.setWater(resources.getWater() - latte.getWater());
            resources.setMilk(resources.getMilk() - latte.getMilk());
            resources.setCoffee(resources.getCoffee() - latte.getCoffee());
            resources.setCups(resources.getCups() - latte.getCups());
            resources.setMoney(resources.getMoney() + latte.getMoney());
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println();
        }
    }

    public static void makeCappuccino() {
        CoffeeType resources = CoffeeType.RESOURCES;
        CoffeeType cappuccino = CoffeeType.CAPPUCCINO;

        if (resources.getWater() - cappuccino.getWater() < 0) {
            System.out.println("Sorry, not enough water!\n");

        } else if (resources.getMilk() - cappuccino.getMilk() < 0) {
            System.out.println("Sorry, not enough milk!\n");

        } else if (resources.getCoffee() - cappuccino.getCoffee() < 0) {
            System.out.println("Sorry, not enough coffee!\n");

        } else if (resources.getCups() - cappuccino.getCups() < 0) {
            System.out.println("Sorry, not enough disposable cups!\n");

        } else {
            resources.setWater(resources.getWater() - cappuccino.getWater());
            resources.setMilk((resources.getMilk() - cappuccino.getMilk()));
            resources.setCoffee(resources.getCoffee() - cappuccino.getCoffee());
            resources.setCups(resources.getCups() - cappuccino.getCups());
            resources.setMoney(resources.getMoney() + cappuccino.getMoney());
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println();
        }
    }

    public static void fill(Scanner scanner) {
        CoffeeType resources = CoffeeType.RESOURCES;

        System.out.println("Write how many ml of water do you want to add:");
        resources.setWater(resources.getWater() + scanner.nextInt());

        System.out.println("Write how many ml of milk do you want to add:");
        resources.setMilk(resources.getMilk() + scanner.nextInt());

        System.out.println("Write how many grams of coffee beans do you want to add:");
        resources.setCoffee(resources.getCoffee() + scanner.nextInt());

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        resources.setCups(resources.getCups() + scanner.nextInt());
        System.out.println();
    }

    public static void take() {
        CoffeeType resources = CoffeeType.RESOURCES;

        System.out.println("I gave you $" + resources.getMoney());
        resources.setMoney(0);
        System.out.println();
    }

    public static void remaining() {
        CoffeeType resources = CoffeeType.RESOURCES;

        System.out.println("The coffee machine has:");
        System.out.println(resources.getWater() + " of water");
        System.out.println(resources.getMilk() + " of milk");
        System.out.println(resources.getCoffee() + " of coffee beans");
        System.out.println(resources.getCups() + " of disposable cups");
        System.out.println("$" + resources.getMoney() + " of money\n");
    }
}
