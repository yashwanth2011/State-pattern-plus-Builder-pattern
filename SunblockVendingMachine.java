public class SunblockVendingMachine {

    State hasBottleState;
    State noBottleState;
    State outOfMoneyState;
    State moneyDeliveryState;
    State winnerState;
    State state;
    int moneyInMachine = 0;

    public SunblockVendingMachine(int moneyForMachine) {
        hasBottleState = new HasBottleState(this);
        noBottleState = new NoBottleState(this);
        outOfMoneyState = new OutOfMoneyState(this);
        moneyDeliveryState = new MoneyDeliveryState(this);
        winnerState = new WinnerState(this);

        this.moneyInMachine = moneyForMachine;
        if (moneyForMachine > 0) {
            state = noBottleState;
        } else {
           state = outOfMoneyState;
        }
    }

    public void submitEmptySunblockBottle() {
            state.submitEmptySunblockBottle();
    }

    public void wantMoney() {
            state.wantMoney();
    }

    public void dispatch() {
            state.dispatch();
    }

    public void dispatchSunblock() {
            state.dispatchSunblock();
    }

    void releaseMoney() {
		System.out.println("you just got a dollar");
		if (moneyInMachine > 0) {
			moneyInMachine -= 1;
		}
	}

	void manufature() {
        System.out.println("You are a winner, you get sunblock instead of money!!\nCongratualtions");
        SunblockBuilder naturalSunblockBuilder = new NaturalSunblockBuilder();
        Sunblock naturalSunblock = naturalSunblockBuilder.addOils().addMinerals().addChemicals().build();
        naturalSunblock.prepare();
        naturalSunblock.mix();
        naturalSunblock.fill();
        naturalSunblock.seal();
        System.out.println(naturalSunblock);
	}

	public int getMoney() {
        return this.moneyInMachine;
	}

    void refill(int moneyForMachine) {
		this.moneyInMachine += moneyForMachine;
		System.out.println("The Vending machine was just refilled; its has: " + this.moneyInMachine + " Dollars.");
		state.refill();
	}

	void setState(State state) {
		this.state = state;
	}

	public State getState() {
        return state;
    }

    public State getHasBottleState() {
        return hasBottleState;
    }

    public State getNoBottleState() {
        return noBottleState;
    }

    public State getOutOfMoney() {
        return outOfMoneyState;
    }

    public State getMoneyDeliveryState() {
        return moneyDeliveryState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nRecycle Plastic");
		result.append("\nMachine Balance = $");
		result.append(moneyInMachine);
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
