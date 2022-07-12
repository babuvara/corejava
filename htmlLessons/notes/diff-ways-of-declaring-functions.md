## Different ways of declaring functions

Functions are **First class citizens:**

- It means JavaScript functions are values in themselves.
- They can be stored in variables and passed into other functions, 
just like any other piece of data in JavaScript.

**With function keyword**

_Important: These are **hoisted**, meaning JavaScript 'hoists' or puts them at the top of the file. So if a function is defined with the function_ keyword, and if we try to run it before it is defined (above its definition),
then there's no error and the function is executed successfully.

javascript
function doctorize(firstName) {
 return Dr. ${firstName}`;
}

- **Callback functions:**

  - Function that is passed to another function used for something that will happen when something is done.

```
HTML:
  <body>
        <button class="clickMe">
          Click Me!
        </button>
   </body>
```
```
     Javascript:
        // Click Callback 
  const button = document.querySelector('.clickMe');

        function handleClick() { console.log('Great Clicking!!'); }

        button.addEventListener('click', handleClick); // everytime we click the button, the handleClick function is run.

        button.addEventListener('click', function() { console.log('Nice Job!!!'); }); // everytime we click the button, the function inside is run.

        // Timer Callback 
  setTimeout(() => { console.log('DONE! Time to eat!'); }, 1000); // it runs the console.log after each 1 sec or 1000 milliseconds
I

**2 Ways to define methods:
***javascript
const wes = {
name: "Westopher Bos",
// Method!
sayHi: function() {
console.log(Hey ${this.name}` return "Hey Wes";
},
// Arrow function
wisperHi: () => {
console.log("hii wesss im a mouse");
},
// Short hand Method
yellHi() {
console.log("HEY WESSSSS");
}
};