public class MachineTester {

        public static void main(String[] args) {

            SunblockVendingMachine sunblockVendingMachine = new SunblockVendingMachine(3);
            System.out.println(sunblockVendingMachine);

            //Happy path user1
            sunblockVendingMachine.submitEmptySunblockBottle();
            sunblockVendingMachine.wantMoney();
            sunblockVendingMachine.dispatchSunblock();

            System.out.println(sunblockVendingMachine);
            //user2
            sunblockVendingMachine.wantMoney();
            sunblockVendingMachine.dispatch();

            System.out.println(sunblockVendingMachine);

            //user3
            sunblockVendingMachine.submitEmptySunblockBottle();
            sunblockVendingMachine.submitEmptySunblockBottle();
            sunblockVendingMachine.dispatch();
            sunblockVendingMachine.wantMoney();
            sunblockVendingMachine.dispatch();

            System.out.println(sunblockVendingMachine);

            //user3
            sunblockVendingMachine.submitEmptySunblockBottle();
            sunblockVendingMachine.wantMoney();
            sunblockVendingMachine.dispatch();

            System.out.println(sunblockVendingMachine);

            sunblockVendingMachine.refill(5);
        }
}
