class VendingMachine {
    private State idleState;
    private State hasOneDollarState;
    private State outOfStockState;
    private State currentState;
    private int count;

    public VendingMachine(int count) {
        idleState = new IdleState();
        hasOneDollarState = new HasOneDollarState();
        outOfStockState = new OutOfStockState();

        if (count > 0) {
            currentState = idleState;
            this.count = count;
        } else {
            currentState = outOfStockState;
            this.count = 0;
        }
    }

    public void insertDollar() {
        currentState.insertDollar(this);
    }

    public void ejectMoney() {
        currentState.ejectMoney(this);
    }

    public void dispense() {
        currentState.dispense(this);
    }

    // Other methods for getting and setting state, returning money, and releasing the product

    public State getIdleState() {
        return idleState;
    }

    public State getHasOneDollarState() {
        return hasOneDollarState;
    }

    public State getOutOfStockState() {
        return outOfStockState;
    }

    public void setState(State state) {
        currentState = state;
    }

    public int getCount() {
        return count;
    }

    public void doReturnMoney() {
        // Implement returning money logic
        System.out.println("Returning money to the user.");
    }

    public void doReleaseProduct() {
        // Implement releasing the product logic
        System.out.println("Releasing the product to the user.");
    }
}
