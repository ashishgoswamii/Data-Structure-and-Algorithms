let arr = [0,1,2,1,1,1,0];
index(arr);

function index(arr) {
    let fi = -1;             //If 1 does not exist print -1
    let li = -1;
    for(let i=0 ; i<arr.length; i++) {
        if(arr[i] == 1) {
            if (fi == -1) {
                fi = i;
            }
            li = i;
        }
    }
    console.log("First Index",fi,"Last Index",li);
}