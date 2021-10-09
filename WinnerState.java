public class WinnerState implements State {
        SunblockVendingMachine sunblockVendingMachine;

        public WinnerState(SunblockVendingMachine sunblockVendingMachine) {
            this.sunblockVendingMachine = sunblockVendingMachine;
        }

        public void submitEmptySunblockBottle() {
                System.out.println("Please wait, we're already giving you the money");
        }

        public void wantMoney() {
            System.out.println("You already pressed the button");
        }

        public void dispatch() {
                System.out.println("Machine will not be giving you money. you'll get a free sunblock ");
            }


        public void refill() { }

        public void dispatchSunblock() {
            sunblockVendingMachine.manufature();
            sunblockVendingMachine.setState(sunblockVendingMachine.getNoBottleState());
        }

        public String toString() {
            return "dispatching the money";
        }
}
