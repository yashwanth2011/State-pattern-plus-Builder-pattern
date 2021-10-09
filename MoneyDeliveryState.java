public class MoneyDeliveryState implements State {
        SunblockVendingMachine sunblockVendingMachine;

        public MoneyDeliveryState(SunblockVendingMachine sunblockVendingMachine) {
            this.sunblockVendingMachine = sunblockVendingMachine;
        }

        public void submitEmptySunblockBottle() {
                System.out.println("Please wait, we're already giving you the money");
        }

        public void wantMoney() {
            System.out.println("You already pressed the button");
        }

        public void dispatch() {
            sunblockVendingMachine.releaseMoney();
            if (sunblockVendingMachine.getMoney() > 0) {
                sunblockVendingMachine.setState(sunblockVendingMachine.getNoBottleState());
            } else {
                sunblockVendingMachine.setState(sunblockVendingMachine.getOutOfMoney());
                System.out.println("Machine doesn't have any money left. Please refill some");
            }
        }

        public void refill() { }

        public void dispatchSunblock() { }

        public String toString() {
            return "dispatching the money";
        }
}
