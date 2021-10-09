public class HasBottleState implements State {
        SunblockVendingMachine sunblockVendingMachine;
        int NumberOfbottles;
        public HasBottleState(SunblockVendingMachine sunblockVendingMachine) {
            this.sunblockVendingMachine = sunblockVendingMachine;
            NumberOfbottles =0;
        }

        public void submitEmptySunblockBottle() {
            System.out.println("ONE BOTTLE AT A TIME");
        }

        public void wantMoney() {
            System.out.println("pressed 'want money'...");
            NumberOfbottles++;
            if (NumberOfbottles%2==1) {
                sunblockVendingMachine.setState(sunblockVendingMachine.getWinnerState());
            } else {
                sunblockVendingMachine.setState(sunblockVendingMachine.getMoneyDeliveryState());
            }
		}

		public void dispatch() {
            System.out.println("money can't be dispatched without pressing 'want money'");
		}

		public void refill() { }

        public void dispatchSunblock() { }

		public String toString() {
            return "whenever you are ready (press 'want money' button)";
        }
}
