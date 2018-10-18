//Object setPrototypeOf 메서드
const healthObj = {
    showHealth : function(){
        console.log("오늘 운동시간 : " + this.healthTime);
    },
    setHealth : function(newTime){
        this.healthTime = newTime;
    }
}

const myHealth = {
    name : "crong",
    lastTime : "11:20"
};

Object.setPrototypeOf(myHealth, healthObj);

console.log(myHealth);