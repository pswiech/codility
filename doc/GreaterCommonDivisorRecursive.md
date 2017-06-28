In Euclid's algorithm, we start with two numbers X and Y. If Y is zero then greatest common divisor of both will be X, but if Y is not zero then we assign the Y to X and Y becomes X%Y. Once again we check if Y is zero, if yes then we have our greatest common divisor or GCD otherwise we keep continue like this until Y becomes zero. Since we are using modulo operator, the number is getting smaller and smaller at each iteration, so the X%Y will eventually become zero.

 ------------
| START x, y | 
 ------------
    |
    |<------------------
    v                   |
    /\                  |
   /  \              -----------
  /    \     NO     | x = y     |
 / y=0 ?\ --------> | y = x % y |
 \      /            ----------- 
  \    /
   \  /
    \/
    |
    |  YES
    v
 -------------
| Answer is x | 
 -------------
