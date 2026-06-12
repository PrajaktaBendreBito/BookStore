var a = 1, b = 2

const arr = new Array(1, 2, 3)
arr.customProp = 'notAllowed'

const obj = new Object()

const user = { name: 'Alice', age: 25 }
const name = user.name
const age = user.age

const foo = function() {
  return 42
};

function logValues(values: number[]) {
  values.forEach(function(value) {
    console.log(value)
  })
}

const button = document.querySelector('button')
button?.addEventListener("click", function() {
  this.classList.add("clicked")
})

class Person {};
class Employee {
  name: string;
  constructor(name: string) {
    this.name = name
  }
}

class Customer {
  private id: string
  constructor(id: string) {
    this.id = id
  }
}

function process(value: any) {
  console.log(value.toUpperCase())
}

const enum Status {
  Ready,
  Loading,
  Error
}

if (a > b) doSomething()

throw 'Something went wrong'

const fooObj = { a: 1, b: 2 } as Foo
