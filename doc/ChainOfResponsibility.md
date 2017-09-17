Avoids coupling the sender of the request to the receiver, giving more than one object the opportunity to handle the request.  This process of delegation

Chain of Responsibility allows a number of classes to attempt to handle a request, independently of any other object along the chain

The pattern is used in windows systems to handle events generated from the keyboard or mouse. 
Exception handling systems also implement this pattern.

examples:
vending machine, ATM

java.util.logging.Logger#log()
javax.servlet.Filter#doFilter()
