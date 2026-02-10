# 3BSCS1-Lab-SW2-State-Pattern-AccountTest
A laboratory seatwork for State Pattern design

# Bank Account Management (State Pattern)

This repository demonstrates the implementation of the **State Design Pattern** to manage bank account lifecycles.

## Problem

The bank needs to manage different account states (**Active**, **Suspended**, and **Closed**) with specific rules for operations like deposits, withdrawals, and viewing info. Using `if-else` or `switch` statements for these checks is error-prone and scales poorly as new states are added.

## Logic & Transitions

The system follows strict transition rules to maintain account integrity:

* **Active Account**:
    Allows deposits and withdrawals.
    Can transition to **Suspended** or **Closed**.


* **Suspended Account**:
    Disallows deposits and withdrawals.
    Allows viewing account information.
    Can transition to **Active** or **Closed**.


* **Closed Account**:   
    Disallows all transactions and viewing of information.  
    Terminal state: cannot be reactivated or suspended.

## Structure

### 1. The Context: `Account`

Maintains the current state and delegates all actions to the `AccountState` object.

* **Attributes**: `accountNumber` (String), `balance` (Double), `accountState` (AccountState).
* **Methods**: `deposit()`, `withdraw()`, `activate()`, `suspend()`, `close()`, and `toString()`.

### 2. The State Interface: `AccountState`

Defines the uniform interface for all concrete states to implement:

```java
public interface AccountState {
    void deposit(Double depositAmount);
    void withdraw(Double withdrawAmount);
    void activate();
    void suspend();
    void close();
}

```

### 3. Concrete States

* **ActiveState**: Implements logic for successful transactions and state changes.
* **SuspendedState**: Overrides transaction methods to block them while allowing state recovery.
* **ClosedState**: Disables all operations, effectively locking the account.

---

## UML DIAGRAM
(will update soon)
