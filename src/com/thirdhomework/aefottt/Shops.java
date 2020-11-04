package com.thirdhomework.aefottt;

public interface Shops {
    void receive(Goods goods);
    void deliver(Goods goods);
    void status(Goods goods);
    void inform(Users user,Goods goods);
}
