# Example of factory pattern:

Imagine an alchemist who is about to manufacture **coins**. 
The alchemist must be able to create both gold and copper 
coins and switching between them must be possible without 
modifying the existing source code. The factory pattern
makes it possible by providing a static construction 
method which can be called with relevant parameters.
In Java, you can implement the **Factory Pattern** by 
defining an *interface* Coin and its implementations 
`GoldCoin` and `CopperCoin`. 
The `CoinFactory` class provides a static method 
`getCoin` to create coin objects based on the type.