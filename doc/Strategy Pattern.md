Strategy pattern

class behavior or its algorithm can be changed at run time

https://en.wikipedia.org/wiki/Strategy_pattern

The strategy pattern uses composition instead of inheritance.

Define a family of algorithms, encapsulate each one, and make them interchangeable. [The] Strategy [pattern] lets the algorithm vary independently from clients that use it.

The Strategy pattern lets you build software as a loosely coupled collection of interchangeable parts, in contrast to a monolithic, tightly coupled system. That loose coupling makes your software much more extensible, maintainable, and reusable.

JDK:
java.util.Comparator#compare()
javax.servlet.http.HttpServlet
javax.servlet.Filter#doFilter()
