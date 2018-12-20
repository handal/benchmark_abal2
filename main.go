package main

import (
	"fmt"
	"log"
	"time"
)

func main() {
	mulai := time.Now()
	forLoop()
	akhir := time.Now()
	log.Print("\nStart at : ")
	log.Print(mulai)
	log.Print("\nFinished at : ")
	log.Print(akhir)
	fmt.Print("\nTime taken : ")
	dTime := akhir.Sub(mulai)
	fmt.Print(dTime)
}

func forLoop() {
	for i := 0; i <= 1000000; i++ {
		a := float64(22)
		b := float64(7)
		x := float64(a / b)
		finx := float64(x / b)
		fmt.Println(finx)
	}
}
