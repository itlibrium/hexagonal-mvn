package com.itlibrium.flights.model;

import java.util.Set;

class Dog {

	private static final Set<String> ALLOWED_ORDERS = Set.of("DO_A_BARREL_ROLL");

    void takeOrder(String order) {
        if(ALLOWED_ORDERS.contains(order)) {
            //roll the barrel
            return;
        }
        throw new UnsupportedOperationException();
    }
}
