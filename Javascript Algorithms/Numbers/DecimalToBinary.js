{
dectoBin(26);

//Function Decimal to binary
function dectoBin(a) {
    let finalno = 0;
    let pow = 1;
    while(a > 0) {        
        let digit = a % 2;
        a = Math.floor(a/2);
        finalno = finalno + digit*pow;
        pow = pow*10;
    }
    console.log(finalno);
}
}