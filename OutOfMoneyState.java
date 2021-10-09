public class OutOfMoneyState implements State {
    SunblockVendingMachine sunblockVendingMachine;

        public OutOfMoneyState(SunblockVendingMachine sunblockVendingMachine) {
            this.sunblockVendingMachine = sunblockVendingMachine;
        }

        public void submitEmptySunblockBottle() {
                System.out.println("Sorry, not accepting at the moment due to insufficient balance");
        }

        public void wantMoney() {
            System.out.println("You can't have money, you haven't submitted a bottle yet");
        }

        public void dispatch() {
            System.out.println("No money dispatched");
        }

        public void refill() {
            sunblockVendingMachine.setState(sunblockVendingMachine.getNoBottleState());
        }

        public void dispatchSunblock() { }

        public String toString() {
            return "Money 404";
        }

}
