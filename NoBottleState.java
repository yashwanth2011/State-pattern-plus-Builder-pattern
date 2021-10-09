public class NoBottleState implements State {
        SunblockVendingMachine sunblockVendingMachine;

        public NoBottleState(SunblockVendingMachine sunblockVendingMachine) {
            this.sunblockVendingMachine = sunblockVendingMachine;
        }

        public void submitEmptySunblockBottle() {
                System.out.println("You have submitted an Empty bottle");
                sunblockVendingMachine.setState(sunblockVendingMachine.getHasBottleState());
        }

        public void wantMoney() {
            System.out.println("I know you want money. Submit a valid empty bottle for that");
        }

        public void dispatch() {
            System.out.println("You need to submit a valid empty bottle first");
        }

        public void refill() { }

        public void dispatchSunblock() { }

        public String toString() {
            return "I'm hungry, throw an empty sunblock bottle";
        }
}
