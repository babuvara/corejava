## Types in Java Script

**BONNUSS**
---
1.Boolean
2.Object
3.Number - All numbers like integers, decimals, and floats are all one type.
4.Undefined - 
6.String
7.Symbol - (new into js) used for assingning unique id. Always gives a guarenteed unique identifer 
Everything in the above list are Primitive type except object.
An object is a special type.
Every thing other than primitive types in js are objects.
At the end of the day , functions, arrays, dates are all just objects.
------------------------------------------------
###String
  used for holding text
  3 ways to create strings:
     1.using single quotes:
       const first = "Subha";
     2.using doubles quotes:
       const middle = "Shini";
     . single quotes and double quotes are the same thing.
     3.using backticks:
        const last = "Dhivi";
        
       used for:"she's cool"
       or escaping: 'she\\'s cool'
       
       .backticks: ---> its very easy to use for single & double quotes without using escape.
        const sentence = 'she's so "cool"';
        console.log(sentence); //she's so "cool"
        
        .Multi-line string: --->single quotes with multiline value end of every line must use double slash\\ use backsticks double slash no need
        const song = 'Oh \\
        I like \\
        pizza';
        
        console.log(song); // Oh I like pizza
        
        ...
        ...javascript 
        const song = 'Oh
        I like
        pizza';
        
        console.log(song)
        /*
        Oh
        I like
        pizza
        */
        
        ...
        
        2nd one using backticks is mostly used.
        
        **String concatenation and interpolation**
        - '+' is used for **concatenation**. It is also used for adding 2 nos.
        - **concatenation**: when 2 or more strings combined to one 
        - **Interpolation**: when you put a variable inside a string 
        - Example1:
        
        'const name = 'Subha';'
        
        'const hello= 'Hello my name is ' + name + '. Nice to meet you.''  
        
        _(can use double or sinlge quotes)_
        
        - Example 2:
        
        ' 1+1 \\ 2'
        ''1'+'1' \\ 11'
        
        '1 + '1' // 11'
        - Example 3:
        
        ...javascript
         const name = 'subha';
         const hello = 'hello my name is ${name}. nice to meet you. I am ${100+1} years old.';
         ...
         - Backticks also used for _tagged template literals_.
         - Backticks are helpful for creating HTML:
         ...javascript
           const html = '
           <div>
              <h2>Hey everyone! I am ${name}.</h2>
           </div>
           ';
           ... 
           ## Number


Only **one** type of number in JavaScript whether it has decimal point or not.
javascript
const age = 100;
const money = 1000.50
console.log(typeof age); // number
console.log(typeof money); // number


-  `typeof is used to find out the 'type' of a variable.

-   Various operations: addition, subtraction, multiplication, division can be done with numbers.

-   Example

    "10" "10" // 100 (number) - converts the strings to number
    But "10" + "10" // 1010
The above works with multiplication, division and subtraction and not addition.
because the + sign is also used for **concatenatio**.

-- **Math helper methods:**

- **Math.round, Math.floor, Math.ceil, Math.random** and many others

   ...javascript 
   Math.round(2.5); //3
   Math.floor(6.6); //6
   Math.ceil(8.4); //9
   Math.random(); //0.565262543
   
   **Modulo and Power operators:**
javascript
const sweets = 20;
const kids = 3;
const eachKidGets = Math.floor(sweets/kids); // 6
console.log(eachKidGets); const leftsweets = sweets % kids; // 2 modulo operation console.log(leftsweets);
let x = 2 ** 3; // 8 - power operation finger operator (**)
console.log(x);
// or
x = Math.pow(2,3); // 8 power operation using Math.pow
console.log(x);
Example
0.10.2 // 0.30000000000000004
Why? [Explanation] (http://0.30000000000000004.com/)
So, when working with money, don't store them as (Rupees.paise) or (dollars.cents ) .
Store all of the money in (paise/cents) as you won't have to deal with fractions only whole nos. When need to display to user, just convert them back.
// let costOfProduct 100.95;
let costOfProduct = 10095; // in paise / cents
**Infinity and Negative Infinity:**
`typeof Infinity; // number
typeof -Infinity; // number
**Not a Number (NaN):**

when need to display to user, just convert them back.
// let costOfProduct = 100.95;
let costOfProduct = 10095; // in paise / cents
**Infinity and Negative Infinity: **
`typeof Infinity; // number
`typeof -Infinity; // number
**Not a Number (NaN):**
10 / 'hello' // NaN
`typeof NaN // number

## Booleans and Equality
A **boolean** variable can be either 'true' or false
Example:
**javascript
const age = 18;
const of Age = age > 18;
console.log(of Age); // false
**Equal signs:**
sign: used for assignment/ updation of values
javascript
let name = 'Soumya';
name = 'Raja'; 
Out of `==` and `===`, you should **almost always** use
and `===` are used for equality comparison.
'javascript
console.log(age === 18); // true
....
`===` vs `===` :
`===` checks both **type & value.**
`==` only checks **value.**
javascript
10 === "10"//false as values are same but types are not
10 == "10" // true as values are same
....


        