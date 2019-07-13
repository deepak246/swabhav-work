import { Component } from "@angular/core";

@Component({
    selector: 'aurionpro-blueball',
    templateUrl: 'blueball.component.html'
})

export class BlueballComponent {
    btnColor: String[] = new Array(50);
    target: number;
    remainingAttempts: number = 5;
    disableBtn: boolean = false;
    display: boolean = true;
    constructor() {
        this.target = Math.floor(Math.random() * 100 / 2);
        console.log(this.target);
        this.disableBtn = true;
        for (let i = 1; i <= 50; i++) {
            this.btnColor[i] = "peru";
        }
    }

    timeLeft: number = 30;
    interval;

    startTimer() {
        //this.timeLeft = 5;
        this.display = false;
        this.disableBtn = false;
        this.interval = setInterval(() => {
            if (this.timeLeft == 0) {
                clearInterval(this.interval);
                this.btnColor[this.target] = "blue";
                this.disableBtn = true;
                alert("Time Over. Target ball was: " + this.target);
                return;
            }
            if (this.timeLeft > 0) {
                this.timeLeft--;
            }
        }, 1000)
    }

    pauseTimer() {
        clearInterval(this.interval);
    }


    fiftyArray(n: number): any[] {
        //console.log(Array(n))
        return Array(n);
    }

    btnClicked(index) {
        console.log(index);
        this.remainingAttempts--;
        if (index == this.target) {
            this.btnColor[index] = "blue";
            this.disableBtn = true;
            clearInterval(this.interval);
            alert("you won");

            return;
        }
        if (index < this.target) {
            this.btnColor[index] = "red";
        }
        if (index > this.target) {
            this.btnColor[index] = "green";
        }
        if (this.remainingAttempts == 0) {
            this.btnColor[this.target] = "blue";
            this.disableBtn = true;
            clearInterval(this.interval);
            alert("No more attempts. Target ball was: " + this.target);
        }
    }
}