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
            currentState = idleState; //product thaka mane idele state e thaka
            this.count = count;
        } else {
            currentState = outOfStockState;// mane product ta nai 
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
    
    public State getHasOneDollarState() {
        return hasOneDollarState;
    }

    // Other methods for getting and setting state, returning money, and releasing the product

    public State getIdleState() {
        return idleState;
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


    
}
