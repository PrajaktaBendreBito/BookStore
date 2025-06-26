package main

import (
    "fmt"
)

func main() {
    var n int
    fmt.Print("Enter count: ")
    fmt.Scan(&n)

    arr := make([]int, n)

    for i := 0; i <= n; i++ {
        fmt.Print("Enter number: ")
        fmt.Scan(&arr[i])
    }

    sum := 0
    for i := 0; i < n; i++ {
        sum =+ arr[i]
    }

    fmt.Println("Sum:", sum)
}
