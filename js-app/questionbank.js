

    Array.prototype.random = function(length){
        return this[Math.floor((Math.random()*length))];
    }

    var questions = [
        {
            id:1,
            text: "Name of the screen that recognizes touch input is ?",
            options: [
                "Recog screen", 
                "Point screen",
                "Touch screen",
                "Android screen"
            ],
            answer: 2 
        },
        {
            id: 2,
            text: "Identify the device through which data and instructions are entered into a computer",
            options:[
                "software",
                "output device",
                "input device",
                "memory"
            ],
            answer: 2 
        },
        {
            id: 3,
            text: "Which of the following function of Number object formats a number with a specific number of digits to the right of the decimal?",
            options:[
                "toExponential()",
                "tofixed()",
                "toPrecision()",
                "toLocaleString()"
            ],
            answer: 0
        },
        {
            id: 4,
            text: "Which of the following type of variable is visible everywhere in your JavaScript code?",
            options:[
                "Global",
                "local",
                "both of above",
                "none of above"
            ],
            answer: 0
        },
        {
            id: 5,
            text: "Which built-in method combines the text of two strings and returns a new string?",
            options:[
                "append()",
                "concat()",
                "attach()",
                "None of above"
            ],
            answer: 1
        },
        {
            id: 6,
            text: "Which of the following function of String object executes the search for a match between a regular expression and a specified string?",
            options:[
                "concat()",
                "match()",
                "replace()",
                "search()"
            ],
            answer: 3
            
        },
        {
            id: 7,
            text: "Which statement is true regarding an object in Java?",
            options:[
                " An object is what classes instantiated are from",
                "An object is an instance of a class",
                "An object is a variable",
                "none of above"
            ],
            answer: 1
        },
        {
            id: 8,
            text: "In object-oriented programming, new classes can be defined by extending existing classes. This is an example of:",
            options:[
                "Encapsulation",
                "interface",
                "inheritance",
                "composition"
            ],
            answer: 2
        },
        {
            id: 9,
            text: "Object-oriented inheritance models which relationship?",
            options:[
                "is a kind of",
                "has a",
                "contains",
                "none of above"
            ],
            answer: 0
        },
        {
            id: 10,
            text: "The wrapping up of data and functions into a single unit is called",
            options:[
                "Abstraction",
                "Encapsulation",
                "Data Hiding",
                "Polymorphism"
            ],
            answer: 1
        }
    ]
    
    
    

