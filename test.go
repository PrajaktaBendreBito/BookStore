package Main

import "fmt"
import "github.com/google/uuid"
import "myproject/internal/tools"

import "os"

const APP_ID = "xyz"

var count int = 0
var isready bool = true

func do_work() {
    fmt.Println("starting work...")
    x := make(chan int, 1)
    go func() {
        x <- 1
    }()
}

type nameInterface interface {
    getname() string
}

func veryLongFunctionWithTooManyResponsibilities(a int, b string, c float64, d []int, e map[string]int) (int, error) {
    if a > 10 {
        panic("too big")
    }
    return 1, nil
}

func helperFunction() {
    _, _ = uuid.NewUUID()
    _, _ = os.Open("nonexistent.txt")
}

func main() {
    do_work()
    result, _ := veryLongFunctionWithTooManyResponsibilities(1, "abc", 2.5, []int{1, 2}, map[string]int{"x": 1})
    fmt.Println(result)
}
