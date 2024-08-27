package io.github.matheus.state_transition_testing;

public class VendingMachine {
    enum State {
        IDLE, SELECTING, DISPENSING, OUT_OF_STOCK
    }

    private State currentState = State.IDLE;
    private int stock = 10;
    private String apiStatus;

    public VendingMachine(String apiStatus) {
        this.apiStatus = apiStatus;
    }

    /**
     * Insert a coin into the vending machine.
     */
    public void insertCoin() {
        if (currentState == State.IDLE) {
            currentState = State.SELECTING;
        }
    }

    /**
     * Select a product from the vending machine.
     */
    public void selectProduct() {
        if (currentState == State.SELECTING) {
            if (stock > 0) {
                currentState = State.DISPENSING;
                dispenseProduct();
            } else {
                currentState = State.OUT_OF_STOCK;
            }
        }
    }

    /**
     * Dispense a product from the vending machine.
     */
    private void dispenseProduct() {
        if (currentState == State.DISPENSING && apiStatus.equals("Ok")) {
            stock--;
            currentState = State.IDLE;
        } else {
            currentState = State.DISPENSING;
        }
    }

    /**
     * Restock the vending machine.
     *
     * @param amount the amount of stock to add
     */
    public void restock(int amount) {
        stock += amount;
        if (currentState == State.OUT_OF_STOCK && stock > 0) {
            currentState = State.IDLE;
        }
    }

    /**
     * Get the current state of the vending machine.
     * @return the current state
     */
    public State getCurrentState() {
        return currentState;
    }
}

