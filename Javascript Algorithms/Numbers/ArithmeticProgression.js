
let a = 2; 
let d = 2 ;
let n = 3;

findNthTerm(a,d,n);
function findNthTerm(a,d,n) {
    let Tn = a + (n-1)*d;
    console.log(Tn);
}
