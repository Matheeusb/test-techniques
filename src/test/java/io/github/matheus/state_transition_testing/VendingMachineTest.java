package io.github.matheus.state_transition_testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * State Transition Testing
 * <p>
 * The VendingMachine class represents a vending machine that can be in one of four states: IDLE, SELECTING, DISPENSING, and OUT_OF_STOCK.
 * The vending machine starts in the IDLE state and transitions to the SELECTING state when a coin is inserted.
 * The vending machine transitions to the DISPENSING state when a product is selected and there is stock available.
 * The vending machine transitions to the OUT_OF_STOCK state when a product is selected and there is no stock available.
 * The vending machine transitions back to the IDLE state after dispensing a product.
 * The vending machine can be restocked, which transitions it back to the IDLE state if it was previously in the OUT_OF_STOCK state.
 */
class VendingMachineTest {

    private VendingMachine machine;

    @BeforeEach
    public void setUp() {
        machine = new VendingMachine("Ok");
    }

    @Test
    @DisplayName("Should return SELECTING state when coin is inserted")
    void testInsertCoin() {
        machine.insertCoin();
        assertEquals(VendingMachine.State.SELECTING, machine.getCurrentState());
    }

    @Test
    @DisplayName("Should return IDLE state when product is selected")
    void testSelectProduct() {
        machine.insertCoin();
        machine.selectProduct();
        assertEquals(VendingMachine.State.IDLE, machine.getCurrentState());
    }

    @Test
    @DisplayName("Should return DISPENSING state when product is selected and there is stock available")
    void testDispenseProduct() {
        VendingMachine machine = new VendingMachine("Loading");
        
        machine.insertCoin();
        machine.selectProduct();
        assertEquals(VendingMachine.State.DISPENSING, machine.getCurrentState());
    }

    @Test
    @DisplayName("Should return OUT_OF_STOCK state when product is selected and there is no stock available")
    void testOutOfStock() {
        for (int i = 0; i < 10; i++) {
            machine.insertCoin();
            machine.selectProduct();
        }
        machine.insertCoin();
        machine.selectProduct();
        assertEquals(VendingMachine.State.OUT_OF_STOCK, machine.getCurrentState());
    }

    @Test
    @DisplayName("Should return IDLE state after dispensing a product")
    void testRestock() {
        machine.restock(5);
        assertEquals(VendingMachine.State.IDLE, machine.getCurrentState());
    }
}

